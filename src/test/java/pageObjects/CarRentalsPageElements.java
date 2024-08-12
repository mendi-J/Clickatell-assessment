package pageObjects;

public interface CarRentalsPageElements {
    String clickCarsTab = "//span[normalize-space()='Cars']";
    String clickPickUpPoint = "//button[@aria-label='Pick-up']";
    String searchCarPickUp = "//input[@id='pick_up_location']"; //Reno
    String selectPickUpLocation = "//button[@aria-label='Reno (RNO - Reno-Tahoe Intl.) Nevada, United States']";
    String clickDropOff = "//button[@aria-label='Same as pick-up']";
    String searchDropOff = "//input[@id='drop_off_location']"; //Reno
    String selectDropOffLocation = "//button[@aria-label='Reno (RNO - Reno-Tahoe Intl.) Nevada, United States']";
    String clickDateField = "//button[@name='EGDSDateRange-date-selector-trigger']";
    String selectDateFromCalendar = "//tbody/tr[5]/td[7]/div[1]";
    String clickDoneButton = "//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item']";
    String clickSearchButton = "//button[@id='search_button']";
    String clickReserve = "//a[@aria-label='Reserve Item, Midsize from Dollar Rent A Car at $102 total']//button[@name='textonly'][normalize-space()='Reserve']";
    String validateRentalOption1 = "//h1[@class='uitk-heading uitk-heading-4']"; // Midsize
    String validateRentalOption2 = "//div[normalize-space()='Car rental fee x 1 day']"; //Car rental fee x 1 day
}
