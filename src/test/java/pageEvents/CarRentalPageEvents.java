package pageEvents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.CarRentalsPageElements;
import utils.ElementFetch;

import java.util.ArrayList;

import static base.BaseTest.driver;

public class CarRentalPageEvents {
    ElementFetch ele = new ElementFetch();

    public void CarRentalSearchAndValidation() throws InterruptedException {
        ele.getWebElement("XPATH", CarRentalsPageElements.clickCarsTab).click();
        ele.getWebElement("XPATH", CarRentalsPageElements.clickPickUpPoint).click();
        Thread.sleep(10000);
        ele.getWebElement("XPATH", CarRentalsPageElements.searchCarPickUp).sendKeys("Reno");
        Thread.sleep(4000);
        ele.getWebElement("XPATH", CarRentalsPageElements.selectPickUpLocation).click();
        ele.getWebElement("XPATH", CarRentalsPageElements.clickDropOff).click();
        Thread.sleep(4000);
        ele.getWebElement("XPATH", CarRentalsPageElements.searchDropOff).sendKeys("Reno");
        ele.getWebElement("XPATH", CarRentalsPageElements.selectDropOffLocation).click();
        ele.getWebElement("XPATH", CarRentalsPageElements.clickDateField).click();
        Thread.sleep(4000);
        ele.getWebElement("XPATH", CarRentalsPageElements.selectDateFromCalendar).click();
        ele.getWebElement("XPATH", CarRentalsPageElements.clickDoneButton).click();
        ele.getWebElement("XPATH", CarRentalsPageElements.clickSearchButton).click();
        ele.getWebElement("XPATH", CarRentalsPageElements.clickReserve).click();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement searchResult = ele.getWebElement("XPATH", CarRentalsPageElements.validateRentalOption1);
        String actualResult = searchResult.getText();
        String expectedResult = "Midsize";
        Assert.assertTrue(actualResult.contains(expectedResult), "The search result does not contain the expected result. Actual: " + actualResult);

        WebElement reservationDetails = ele.getWebElement("XPATH", CarRentalsPageElements.validateRentalOption2);
        String actualBooking = reservationDetails.getText();
        String expectedBooking = "Car rental fee x 1 day";
        Assert.assertTrue(actualBooking.contains(expectedBooking), "The search result does not contain the expected result. Actual: " + actualBooking);
    }

}
