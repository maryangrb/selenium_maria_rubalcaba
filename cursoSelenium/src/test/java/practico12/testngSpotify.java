package practico12;

import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class testngSpotify {

    public static String SPOTIFY_URL = "https://www.spotify.com/uy/";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        driver = new ChromeDriver();
        driver.get(SPOTIFY_URL);
    }

    @Test (priority = 0)
    public void spotifyByNameXpath() {             //https://www.spotify.com/uy/signup/
        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("1234mrb@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'confirm']")).sendKeys("1234mrb@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("holamundo");
        driver.findElement(By.xpath("//input[@name = 'displayname']")).sendKeys("testing");
        driver.findElement(By.xpath("//input[@name = 'day']")).sendKeys("16");
        Select mes = new Select(driver.findElement(By.name("month")));
        mes.selectByIndex(06);
        driver.findElement(By.xpath("//input[@name = 'year']")).sendKeys("1985");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[6]/div[2]/label[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[7]/label/span[2]")).click();
        driver.findElement(By.xpath("//a[@href=\"/legal/end-user-agreement\"]")).click();
    }

    @AfterMethod
    public void close(){
        //driver.quit();
    }

    @Test (priority = 1)
    public void verifySpotifyTitle(){
        //System.out.println("el titulo es: " + driver.getTitle());
        String expectedTitle = "Escuchar es todo - Spotify";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test (priority = 2)
    public void verifySignupUrl(){
        driver.findElement(By.xpath("/html/body/div[2]/div/header/div/nav/ul/li[5]/a")).click();
        //System.out.println("La url actual es: " + driver.getCurrentUrl());

        Assert.assertTrue((driver.getCurrentUrl()).contains("signup"), "La url actual no contiene la palabra signup");
    }

    @Test (priority = 3)
    public void invalidEmailTest() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href = 'https://www.spotify.com/uy/signup/']")).click();
        driver.findElement(By.id("email")).sendKeys("test.com");

        //tengo que dar clic pq sino no me sale el mensaje de error:
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[1]/div[1]/label")).click();
        Thread.sleep(5500);

        //Este correo electrónico no es válido. Asegúrate de que tenga un formato como este: ejemplo@email.com
        WebElement emailErrorMsg = driver.findElement(By.xpath("//*[contains(text(), 'Este correo electrónico no es válido. Asegúrate de que tenga un formato como este: ejemplo@email.com']"));

        //Validar que se despliegue el error: “La dirección de email que proporcionaste no es válida.”
        Assert.assertEquals(emailErrorMsg.getText(), "La dirección de email que proporcionaste no es válida.");

    }

    @Test (priority = 4)
    public void validateExistingEmail(){
        driver.findElement(By.xpath("//a[@href = 'https://www.spotify.com/uy/signup/']")).click();
        driver.findElement(By.id("email")).sendKeys("test@test.com");



    }

    @Test (priority = 5)
    public void checkEqualEmailsError(){
        driver.findElement(By.xpath("//a[@href = 'https://www.spotify.com/uy/signup/']")).click();
        driver.findElement(By.id("email")).sendKeys("test999@test.com");
        driver.findElement(By.id("confirm")).sendKeys("hola@hola.com");
        driver.findElement(By.id("password")).sendKeys("hola1234");

    }

    @Test (priority = 6)
    public void checkErrorMessages(){
        driver.findElement(By.xpath("//a[@href = 'https://www.spotify.com/uy/signup/']")).click();

    }

}



















