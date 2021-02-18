package practico12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.GetProperties;

public class testngSalesforce {
    public static String SALESFORCE_URL = "https://login.salesforce.com/";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        driver = new ChromeDriver();
        driver.get(SALESFORCE_URL);
    }

    @AfterMethod
    public void close(){
        //driver.quit();
    }
}
