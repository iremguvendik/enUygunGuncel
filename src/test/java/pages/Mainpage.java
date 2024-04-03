package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class Mainpage extends CommonMethods {

    @FindBy(xpath = "//button[text() = 'KABUL ET']")
    public WebElement cerezKabulEt;

    @FindBy(xpath = "//div[text() = 'Gidiş-dönüş']")
    public WebElement gidisDonusField;

    @FindBy(xpath = "//input[@name = 'origin']")
    public WebElement neredenField;

    @FindBy(xpath = "//input[@name = 'destination']")
    public WebElement nereyeField;

    @FindBy(xpath = "//div[@class ='Tab-module_separated-panels__7v5sO']")
    public WebElement bosAlan;

    @FindBy(xpath = "//div[text()='Gidiş Tarihi']")
    public WebElement depDayField;

    @FindBy(xpath = "//button[@data-testid= 'enuygun-homepage-flight-departureDate-month-forward-button']")
    public WebElement departureMonthForwardButton;

    @FindBy(xpath = "(//h3[@data-testid= 'enuygun-homepage-flight-departureDate-month-name-and-year'])[1]")
    public WebElement depFirstMonth;

    @FindBy(xpath = "(//h3[@data-testid= 'enuygun-homepage-flight-departureDate-month-name-and-year'])[2]")
    public WebElement depSecondMonth;

    @FindBy (xpath = "//button[@data-testid ='datepicker-active-day']")
    public List<WebElement> depMonthActiveDepartureDays;

    @FindBy(xpath = "//div[text()='Dönüş Tarihi']")
    public WebElement returnDayField;

    @FindBy(xpath = "(//h3[@data-testid='enuygun-homepage-flight-returnDate-month-name-and-year'])[1]")
    public WebElement returnFirstMonth;

    @FindBy(xpath = "(//h3[@data-testid='enuygun-homepage-flight-returnDate-month-name-and-year'])[2]")
    public WebElement returnSecondMonth;

    @FindBy (xpath = "//button[@data-testid= 'datepicker-active-day']")
    public List<WebElement>  returnMonthActiveDepartureDays;

    @FindBy(xpath = "//button[@data-testid= 'enuygun-homepage-flight-returnDate-month-forward-button']")
    public WebElement returnMonthForwardButton;

    @FindBy(xpath = "//div[text()='Yolcu Sayısı, Kabin']")
    public WebElement passangerField;

    @FindBy(xpath = "//div[@data-testid='flight-adult-counter-count']")
    public WebElement passangerAdultCounter;

    @FindBy(xpath = "//button[@data-testid= 'flight-adult-counter-plus-button']")
    public WebElement passangerAdultCounterIncrease;

    @FindBy(xpath = "//button[@data-testid='enuygun-homepage-flight-doneBtn']")
    public WebElement passangerCountDoneButton;

    @FindBy(xpath = "//button[@data-testid='enuygun-homepage-flight-submitButton']")
    public WebElement submitButton;

    public Mainpage() {
        PageFactory.initElements(driver, this);
    }


}
