package utils;

public class DriverUtils {

    public static void setups (){
        System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir") + "src/test/resources/chromedriver.exe");
    }
}
