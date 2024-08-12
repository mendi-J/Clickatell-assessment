package pageObjects;

public interface HotelSearchAndValidationElements {
    String clickSearchBox = "//button[@aria-label='Where to?']";
    String searchForHotel = "//input[@id='destination_form_field']";
    String selectHotelName = "//button[@aria-label='Eko Hotel Main Building Lagos, Lagos, Nigeria']";
    String selectSearchDate = "//button[@name='EGDSDateRange-date-selector-trigger']";
    String selectDateFromCalendar = "//tbody/tr[5]/td[6]/div[1]/div[2]";
    String clickDoneButton = "//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item']";
    String clickSearchButton = "//button[@id='search_button']";
    String clickHotelInformation = "//div[@class='uitk-card uitk-card-roundcorner-all uitk-card-has-border uitk-card-has-featured-header uitk-card-has-primary-theme']//a[@class='uitk-card-link']";
    String validateSearchName = "//h3[normalize-space()='Popular among travelers']";
    String bookReservation = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[2]";
    String selectPayAtProperty = "//div[@data-stid='payment-option-PAY_LATER']//button[@role='link']";
    String enterFirstname = "//input[@id='smart-form-control-input-component-traveler:name:first_name']";
    String enterLastname = "//input[@id='smart-form-control-input-component-traveler:name:last_name']";
    String enterEmailAddress = "//input[@id='smart-form-control-input-component-contact:email']";
    String enterPhoneNumber = "//input[@id='smart-form-control-input-component-contact:phone:number']";
    String validateBookingDetails = "//h2[normalize-space()='Reservation card details']";
}
