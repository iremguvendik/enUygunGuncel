package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class MainPageSteps extends CommonMethods {

    @Given("user goes to enuygun.com webpage")
    public void user_goes_to_enuygun_com_webpage() {
        jsClick(mainPage.cerezKabulEt);
    }

    @When("user search for a round trip departure on {string} {string}  and return on {string} {string}  from {string} to {string} for {string} adult")
    public void user_search_for_a_round_trip_departure_on_and_return_on_from_to_for_adult(String depDay, String depMonth, String returnDay, String returnMonth, String departurePort, String destPort, String adultPassenger) throws InterruptedException {
        jsClick(mainPage.gidisDonusField);
        jsClick(mainPage.neredenField);
        sendText(mainPage.neredenField, departurePort);
        mainPage.neredenField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        jsClick(mainPage.nereyeField);
        sendText(mainPage.nereyeField, destPort);
        mainPage.nereyeField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        Thread.sleep(1000);
        jsClick(mainPage.depDayField);
        while (true) {
            String textMonth1 = mainPage.depFirstMonth.getText();
            String textMonth2 = mainPage.depSecondMonth.getText();
            if (textMonth1.equals(depMonth)) {
                for (WebElement day : mainPage.depMonthActiveDepartureDays
                ) {
                    if (day.getText().equals(depDay)) {
                        day.click();
                        break;
                    }
                }
                break;
            } else if (textMonth2.equals(depMonth)) {
                boolean isFirstSameDay = false;
                for (int i = 0; i < mainPage.depMonthActiveDepartureDays.size(); i++) {
                    if (mainPage.depMonthActiveDepartureDays.get(i).getText().equals(depDay)) {
                        if (isFirstSameDay) {
                            mainPage.depMonthActiveDepartureDays.get(i).click();
                            break;
                        } else {
                            isFirstSameDay = true;
                        }
                    }
                }
                break;
            } else {
                mainPage.departureMonthForwardButton.click();
            }
        }
        jsClick(mainPage.returnDayField);
        while (true) {
            String textMonth1 = mainPage.returnFirstMonth.getText();
            String textMonth2 = mainPage.returnSecondMonth.getText();
            if (textMonth1.equals(returnMonth)) {
                for (WebElement day : mainPage.returnMonthActiveDepartureDays
                ) {
                    if (day.getText().equals(returnDay)) {
                        day.click();
                        break;
                    }
                }
                break;
            } else if (textMonth2.equals(returnMonth)) {
                boolean isFirstSameDay = false;
                for (int i = 0; i < mainPage.returnMonthActiveDepartureDays.size(); i++) {
                    if (mainPage.returnMonthActiveDepartureDays.get(i).getText().equals(returnDay)) {
                        if (isFirstSameDay) {
                            mainPage.returnMonthActiveDepartureDays.get(i).click();
                            break;
                        } else {
                            isFirstSameDay = true;
                        }
                    }
                }
                break;
            } else {
                mainPage.returnMonthForwardButton.click();
            }
        }

        jsClick(mainPage.passangerField);
        while (true) {
            if(mainPage.passangerAdultCounter.getText().equals(adultPassenger)){
                jsClick(mainPage.passangerCountDoneButton);
                break;
            }else{
                jsClick(mainPage.passangerAdultCounterIncrease);
            }
        }

        jsClick(mainPage.submitButton);
        Thread.sleep(5000);

    }



}
