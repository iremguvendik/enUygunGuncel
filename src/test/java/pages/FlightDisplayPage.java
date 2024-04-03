package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class FlightDisplayPage extends CommonMethods {

    @FindBy(xpath = "//span[text() = 'Gidiş kalkış / varış saatleri']")
    public WebElement gidisKalkisVarisSaatleri;

    @FindBy(xpath = "(//div[@class='rc-slider-handle rc-slider-handle-1'])[1]")
    public WebElement gidisSaatiSlider1;

    @FindBy(xpath = "(//div[@class='rc-slider-handle rc-slider-handle-2'])[1]")
    public WebElement gidisSaatiSlider2;

    @FindBy (xpath = "//div[@class = 'flight-departure-time']")
    public List<WebElement> gidisKalkisSaatlerListesi;

    @FindBy(xpath = "//div[@class ='ctx-filter-airline card-header']")
    public WebElement airlineCompanySelect;

    @FindBy(xpath = "//input[@id = 'TKairlines']")
    public WebElement thySelect;

    @FindBy(xpath = "//div[@data-testid= 'flightInfoPrice']")
    public List<WebElement> thyFlightsPriceList;


    public FlightDisplayPage() {
        PageFactory.initElements(driver, this);
    }

}