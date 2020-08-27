package practico10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.concurrent.TimeUnit;

public class practico_10 {

    private WebDriver getDriver(String url){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = url;
        driver.get(baseURL);
        return driver;
    }

    //Parte 1: Waits
    //Ejercicio 1 con Thread.sleep
    @Test
    public void threadTest () throws InterruptedException {
        WebDriver driver = getDriver("https://login.salesforce.com/");

        Thread.sleep(5000);
        WebElement linkForgot = driver.findElement(By.partialLinkText("Forgot Your "));
        linkForgot.click();
    }

    //Ejercicio 2 con Implicit Wait
    @Test
    public void implicitWait() {
        WebDriver driver = getDriver("https://login.salesforce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement linkForgot = driver.findElement(By.linkText("Forgot Your Password?"));
        linkForgot.click();
    }

    //Ejercicio 3 con Explicit Wait
    @Test
    public void explicitWait(){
        WebDriver driver = getDriver("https://login.salesforce.com/");
        WebElement button = driver.findElement(By.xpath("//input[@name='Login']"));

        WebDriverWait ewait = new WebDriverWait(driver, 10);
        ewait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }


    //Parte 2: Links
    //Ej1 Crear un método de test llamado forgotAccount
    @Test
    public void forgotAccount(){
        WebDriver driver = getDriver("https://www.facebook.com/");
        WebElement forgotAccount = driver.findElement(By.linkText("Forgot account?"));
        forgotAccount.click();
    }

    //Ej2 Crear un método de test llamado forgotAccountPartialLink
    @Test
    public void forgotAccountPartialLink(){
        WebDriver driver = getDriver("https://www.facebook.com/");
        WebElement forgotAccount = driver.findElement(By.partialLinkText("Forgot "));
        forgotAccount.click();
    }

    //Ej3 Crear un método de test llamado customSalesforceLink
    @Test
    public void customSalesforceLink(){
        WebDriver driver = getDriver("https://login.salesforce.com/");
        WebElement link = driver.findElement(By.linkText("Use Custom Domain"));
        link.click();

        WebElement completar = driver.findElement(By.xpath("//*[@id=\"mydomain\"]"));
        completar.sendKeys("as");

        WebElement buttonContinue = driver.findElement(By.name("Continue"));
        buttonContinue.click();
        driver.navigate().back();
    }

    //Parte 3: Checkbox
    //Ej9 Crear un método de test llamado checkBoxAndComboboxTest
    @Test
    public void checkBoxAndComboboxTest(){
        WebDriver driver = getDriver("https://www.facebook.com/");

        WebElement buttonCreateNewAccount = driver.findElement(By.id("u_0_2"));
        buttonCreateNewAccount.click();

    }

    //Ej5 Crear un método de test llamado checkBoxTest
    @Test
    public void checkBoxTest(){

    }


    //Parte 4: Comboboxes
    //Ej8 Crear un método de test llamado birthdateTest
    @Test
    public void birthdateTest(){

    }

    //Ej6 Crear un método de test llamado comboboxTest
    @Test
    public void comboboxTest(){

    }

    //Ej7 Crear un método de test llamado comboboxTest
    @Test
    public void comboboxTest1(){

    }

    //Ej11 Crear un método privado llamado setBirthdate
    @Test
    public void setBirthdate(){

    }

    //Parte 5: Registration tests
    //Ej2 Ir a Facebook
    //Ej10 Crear un método de test llamado completeRegistration
    //Ej Completar los campos de registro de facebook, utilizando el atributo className.


}
