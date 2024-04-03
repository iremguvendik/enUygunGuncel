package steps;

import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class FlightDisplayPageSteps extends CommonMethods {
    @When("user clicks on search and filter departure flights between {double} and {double}")
    public void user_click_on_search_and_filter_departure_flights_between_and(double firstHour, double secondHour) throws InterruptedException {
        jsClick(flightDisplayPage.gidisKalkisVarisSaatleri);
        Thread.sleep(3000);
        WebElement slider1 = flightDisplayPage.gidisSaatiSlider1;
        int xwidth = slider1.getSize().width;
        double x=xwidth * ((firstHour-1)/2);
        Actions actions= new Actions(driver);
        actions.dragAndDropBy(slider1, (int) x,0);
        actions.build().perform();

        Thread.sleep(5000);

        WebElement slider2 = flightDisplayPage.gidisSaatiSlider2;
        int uwidth = slider2.getSize().width;
        double u= uwidth * ((uwidth-secondHour)/2);
        actions.dragAndDropBy(slider2,  -(int) u ,0);
        actions.build().perform();
        Thread.sleep(5000);
    }


    @Then("user validates the result are between {double} and {double}")
    public void user_validates_the_result_are_between_and(double firstHour, double secondHour) {
        for (WebElement flightHours : flightDisplayPage.gidisKalkisSaatlerListesi
        ) {
            double i =Double.parseDouble(flightHours.getText().replace(":","."));
            Assert.assertTrue(firstHour<=i && i<=secondHour);


        }
    }

    @Then("user clicks on the THY company and validate the order")
    public void userClicksOnTheTHYCompanyAndValidateTheOrder() throws InterruptedException {
        Thread.sleep(2000);
        jsClick(flightDisplayPage.airlineCompanySelect);
        Thread.sleep(2000);
        jsClick(flightDisplayPage.thySelect);
        Thread.sleep(2000);
        for (int i = 0; i < flightDisplayPage.thyFlightsPriceList.size()-1; i++) {
            double firstPrice =Double.parseDouble(flightDisplayPage.thyFlightsPriceList.get(i).getAttribute("data-price"));
            double secondPrice =Double.parseDouble(flightDisplayPage.thyFlightsPriceList.get(i+1).getAttribute("data-price"));
            if(firstPrice<=secondPrice){
                Assert.assertTrue(true);
            }else{
                Assert.assertFalse(false);
            }

        }

    }
}
