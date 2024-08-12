package pageEvents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.FlightSearchElements;
import pageObjects.HomePageElements;
import utils.ElementFetch;

import java.util.ArrayList;

import static base.BaseTest.driver;

public class FlightSearchEvents {
    ElementFetch ele = new ElementFetch();

    public void searchForFlightByDestinationAndDate() throws InterruptedException {
        Thread.sleep(4000);
        ele.getWebElement("XPATH", FlightSearchElements.leavingFrom).click();
        Thread.sleep(10000);
        ele.getWebElement("XPATH", FlightSearchElements.searchOrigin).sendKeys("Lagos");
        ele.getWebElement("XPATH", FlightSearchElements.confirmFlightOrigin).click();
        ele.getWebElement("XPATH", FlightSearchElements.goingTo).click();
        Thread.sleep(4000);
        ele.getWebElement("XPATH", FlightSearchElements.searchDestination).sendKeys("Johannesburg");
        ele.getWebElement("XPATH", FlightSearchElements.confirmFlightDestination).click();
        Thread.sleep(4000);
        ele.getWebElement("XPATH", FlightSearchElements.selectDepartureDate).click();
        Thread.sleep(2000);
        ele.getWebElement("XPATH", FlightSearchElements.selectRoundTripTo).click();
        ele.getWebElement("XPATH", FlightSearchElements.clickDoneToConfirmSelectedDates).click();
        ele.getWebElement("XPATH", FlightSearchElements.clickSearchButton).click();

        WebElement searchResult = ele.getWebElement("XPATH", FlightSearchElements.validateSearchResult);
        String actualResult = searchResult.getText();
        String expectedResult = "Recommended departing flights";
        Assert.assertTrue(actualResult.contains(expectedResult), "The search result does not contain the expected result. Actual: " + actualResult);

    }
    public void searchFlightByDestinationDateAndClass() throws InterruptedException {
        Thread.sleep(4000);
        ele.getWebElement("XPATH", HomePageElements.validateTheExistenceOfFlightTab).click();
        ele.getWebElement("XPATH", FlightSearchElements.oneWayTab).click();
        ele.getWebElement("XPATH", FlightSearchElements.clickClassOption).click();
        Thread.sleep(4000);
        ele.getWebElement("XPATH", FlightSearchElements.selectClassType).click();
        ele.getWebElement("XPATH", FlightSearchElements.leavingFromSA).click();
        Thread.sleep(10000);
        ele.getWebElement("XPATH", FlightSearchElements.searchOriginFlight).sendKeys("Johannesburg");
        ele.getWebElement("XPATH", FlightSearchElements.confirmFlightOriginSA).click();
        ele.getWebElement("XPATH", FlightSearchElements.goingToNY).click();
        Thread.sleep(4000);
        ele.getWebElement("XPATH", FlightSearchElements.searchDestinationNY).sendKeys("New york");
        ele.getWebElement("XPATH", FlightSearchElements.confirmFlightDestinationNY).click();
        Thread.sleep(4000);
        ele.getWebElement("XPATH", FlightSearchElements.selectDate).click();
        Thread.sleep(2000);
        ele.getWebElement("XPATH", FlightSearchElements.selectOneWayTrip).click();
        ele.getWebElement("XPATH", FlightSearchElements.clickDoneToConfirmSelectedDates).click();
        ele.getWebElement("XPATH", FlightSearchElements.clickSearchButton).click();
        ele.getWebElement("XPATH", FlightSearchElements.selectFlightToNY).click();
        ele.getWebElement("XPATH", FlightSearchElements.confirmSelection).click();
        ele.getWebElement("XPATH", FlightSearchElements.closePopModal).click();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(4000);
        WebElement searchResult = ele.getWebElement("XPATH", FlightSearchElements.validateFlightSearchResult);
        String actualResult = searchResult.getText();
        String expectedResult = "Flight from New York to Johannesburg'";
        Assert.assertTrue(actualResult.contains(expectedResult), "The search result does not contain the expected result. Actual: " + actualResult);
    }
}
