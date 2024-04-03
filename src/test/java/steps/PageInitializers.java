package steps;

import pages.FlightDisplayPage;
import pages.Mainpage;

public class PageInitializers {

    public static Mainpage mainPage;
    public static FlightDisplayPage flightDisplayPage;

    public static void initializePageObjects() {

        mainPage = new Mainpage();
        flightDisplayPage = new FlightDisplayPage();
    }
}
