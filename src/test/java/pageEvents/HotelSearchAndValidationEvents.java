package pageEvents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.HotelSearchAndValidationElements;
import utils.ElementFetch;

import java.util.ArrayList;

import static base.BaseTest.driver;

public class HotelSearchAndValidationEvents {
    ElementFetch ele = new ElementFetch();

    public void hotelBookingAndValidation() throws InterruptedException {
        Thread.sleep(4000);
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.clickSearchBox).click();
        Thread.sleep(10000);
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.searchForHotel).sendKeys("Eko Hotel");
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.selectHotelName).click();
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.selectSearchDate).click();
        Thread.sleep(4000);
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.selectDateFromCalendar).click();
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.clickDoneButton).click();
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.clickSearchButton).click();
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.clickHotelInformation).click();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // This Assertion is used to validate the search result
        WebElement searchResult = ele.getWebElement("XPATH", HotelSearchAndValidationElements.validateSearchName);
        String actualText = searchResult.getText();
        String expectedText = "Popular among travelers";
        Assert.assertEquals(actualText, expectedText, "The search result does not match the expected value.");

        ele.getWebElement("XPATH", HotelSearchAndValidationElements.bookReservation).click();
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.selectPayAtProperty).click();
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.enterFirstname).sendKeys("Ndifreke");
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.enterLastname).sendKeys("Jacob");
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.enterEmailAddress).sendKeys("ndifrekejacob2024@gmail.com");
        ele.getWebElement("XPATH", HotelSearchAndValidationElements.enterPhoneNumber).sendKeys("2346535345");

        // This assertion is used to validate the booking.
        WebElement reservationDetails = ele.getWebElement("XPATH", HotelSearchAndValidationElements.validateBookingDetails);
        String actualBooking = reservationDetails.getText();
        String expectedBooking = "Reservation card details";
        Assert.assertTrue(actualBooking.contains(expectedBooking), "The search result does not contain the expected result. Actual: " + actualBooking);

    }
}
