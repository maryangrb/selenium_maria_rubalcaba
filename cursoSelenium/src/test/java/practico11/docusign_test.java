package practico11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class docusign_test {

    private WebDriver getDriver(String url){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = url;
        driver.get(baseURL);
        return driver;
    }

    //Completar todos los campos con xpath name
    @Test
    public void completeDocusignRegistrationForm(){
        WebDriver driver = getDriver("https://go.docusign.com/o/trial/");

        driver.findElement(By.xpath("//input[@name = 'first_name']")).sendKeys("Pepe");
        driver.findElement(By.xpath("//input[@name = 'last_name']")).sendKeys("Perez");
        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("pepeperez@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("095145329");
        driver.findElement(By.xpath("//input[@name = 'title']")).sendKeys("Ingeniero");

        Select industry = new Select(driver.findElement(By.name("ds_industry")));
        industry.selectByValue("Education");
    }

    //Completar todos los campos usando el xpath sugerido por el explorador
    @Test
    public void defaultxPath(){
        WebDriver driver = getDriver("https://go.docusign.com/o/trial/");

        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_First_Name\"]/input")).sendKeys("Pepe");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Last_Name\"]/input")).sendKeys("Perez");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Email\"]/input")).sendKeys("pepeperez@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Phone\"]/input")).sendKeys("095145329");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Job_Title\"]/input")).sendKeys("Ingeniero");

        Select industry = new Select(driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Industry\"]/select")));
        industry.selectByValue("Education");

    }
}
