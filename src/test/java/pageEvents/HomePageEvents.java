package pageEvents;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePageElements;
import utils.Constants;
import utils.ElementFetch;

import java.time.Duration;

import static base.BaseTest.driver;

import org.testng.Assert;

public class HomePageEvents {
    ElementFetch ele = new ElementFetch();
    public void validateFlightTabVisibility(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement flightTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageElements.validateTheExistenceOfFlightTab)));
        flightTab.click();
    }
}
