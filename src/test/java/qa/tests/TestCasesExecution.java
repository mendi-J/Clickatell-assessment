package qa.tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.*;
import utils.ElementFetch;

public class TestCasesExecution extends BaseTest {
    ElementFetch ele = new ElementFetch();
    HomePageEvents homePage = new HomePageEvents();
    HotelSearchAndValidationEvents hotelBooking = new HotelSearchAndValidationEvents();
    FlightSearchEvents flightSearch = new FlightSearchEvents();
    CarRentalPageEvents carRentals = new CarRentalPageEvents();
    @Test
    public void searchFlightByDestinationAndDate() throws InterruptedException {
        homePage.validateFlightTabVisibility();
        flightSearch.searchForFlightByDestinationAndDate();
    }
    @Test
    public void searchFlightByDestinationDateAndClass() throws InterruptedException {
        flightSearch.searchFlightByDestinationDateAndClass();
    }
    @Test
    public void HotelSearchAndValidationEvents() throws InterruptedException {
        hotelBooking.hotelBookingAndValidation();
    }
    @Test
    public void CarRentalPageEvents() throws InterruptedException {
        carRentals.CarRentalSearchAndValidation();
    }
}
