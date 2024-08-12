package pageObjects;

public interface FlightSearchElements {
    String leavingFrom = "//button[@aria-label='Leaving from']";
    String searchOrigin = "//input[@id='origin_select']";
    String confirmFlightOrigin = "//button[@aria-label='Lagos (LOS - Murtala Muhammed Intl.) Nigeria']";
    String goingTo = "//button[@aria-label='Going to']";
    String searchDestination = "//input[@id='destination_select']";
    String confirmFlightDestination = "//button[@aria-label='Johannesburg (JNB - O.R. Tambo Intl.) South Africa']";
    String selectDepartureDate = "//div//button[@name='EGDSDateRange-date-selector-trigger']";
    String selectRoundTripTo = "//tbody/tr[5]/td[7]/div[1]";
    String clickDoneToConfirmSelectedDates = "//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item']";
    String clickSearchButton = "//button[@id='search_button']";
    String validateSearchResult = "//h5[@class='uitk-heading uitk-heading-5']";

    String oneWayTab = "//span[normalize-space()='One-way']";
    String clickClassOption = "//span[@class='uitk-pill-text']";
    String selectClassType = "//span[normalize-space()='Business class']";
    String leavingFromSA = "//button[@aria-label='Leaving from']";
    String searchOriginFlight = "//input[@id='origin_select']";
    String confirmFlightOriginSA = "//button[@aria-label='Johannesburg (JNB - O.R. Tambo Intl.) South Africa']";
    String goingToNY = "//button[@aria-label='Going to']";
    String searchDestinationNY = "//input[@id='destination_select']";
    String confirmFlightDestinationNY = "//button[@aria-label='New York (JFK - John F. Kennedy Intl.) New York, United States']";
    String selectDate = "//div[@class='uitk-layout-flex-item uitk-layout-flex-item-max-width-full_width uitk-layout-flex-item-flex-grow-1']//div[@class='uitk-field has-floatedLabel-label has-icon has-placeholder']";
    String selectOneWayTrip = "//tbody/tr[1]/td[4]/div[1]";
    String selectFlightToNY = "//body/div[@id='app-flights-shopping-pwa']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[2]/div[3]/div[1]/div[1]/div[2]/main[1]/ul[1]/li[2]/div[1]/div[1]/button[1]";
    String confirmSelection = "//button[contains(text(),'Select')]";
    String closePopModal = "//a[@aria-label='No thanks. Opens in a new tab']";
    String validateFlightSearchResult = "//h2[@aria-label='Flight from New York to Johannesburg']";
}
