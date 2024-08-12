package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.Config;
import utils.Constants;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest logger;
    public String browser;

    @BeforeTest
    public void beforeTestMethod(){
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "reports" + File.separator + "ExpediaTaskReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("Test Automation Task");
        sparkReporter.config().setReportName("Automation Test Task Results by NDIFREKE JACOB");
        extent.setSystemInfo("HostName", "NDIFREKE");
        extent.setSystemInfo("UserName", "root");
    }

    @BeforeMethod
    public void beforeMethodMethod(Method testMethod){
        Config config = new Config("src/test/java/utils/TestData.properties");
        browser = config.getProperty("browser");
        logger = extent.createTest(testMethod.getName());

        setupDriver(browser);
        driver.manage().window().maximize();
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

    }
    @AfterMethod
    public void afterMethod (ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE){
            logger.log(Status.FAIL, MarkupHelper.createLabel (result.getName()+" Test Case Failed", ExtentColor.RED));
            logger.log(Status.FAIL, MarkupHelper.createLabel (result.getThrowable()+" Test Case Failed", ExtentColor.RED)); }
        else if(result.getStatus() == ITestResult.SKIP){
            logger.log(Status.SKIP, MarkupHelper.createLabel (result.getName()+" Test Case Skipped", ExtentColor.ORANGE));}
        else if(result.getStatus() == ITestResult.SUCCESS) {
            logger.log(Status. PASS, MarkupHelper.createLabel (result.getName()+" Test Case PASS", ExtentColor.GREEN)); }
        driver.quit();
    }

    @AfterTest
    public void afterTest(){
        extent.flush();
    }

    public void setupDriver (String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }
}

