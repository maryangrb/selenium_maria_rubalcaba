package practico11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class spotify_test {

    private WebDriver getDriver(String url){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = url;
        driver.get(baseURL);
        return driver;
    }


    //Spotify con XPath
    //Completar todos los campos con xpath name
    @Test
    public void spotifyByNameXpath() {
        WebDriver driver = getDriver("https://www.spotify.com/uy/signup/");
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

    //Completar todos los campos con xpath placeholder
    @Test
    public void spotifyByPlaceHolderXpath() {
        WebDriver driver = getDriver("https://www.spotify.com/uy/signup/");
        driver.findElement(By.xpath("//input[@placeholder = 'Introduce tu correo electrónico.']")).sendKeys("1234mrb@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder = 'Vuelve a introducir tu correo electrónico.']")).sendKeys("1234mrb@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder = 'Crea una contraseña.']")).sendKeys("holamundo");
        driver.findElement(By.xpath("//input[@placeholder = 'Introduce un nombre de perfil.']")).sendKeys("testing");
        driver.findElement(By.xpath("//input[@placeholder = 'DD']")).sendKeys("16");
        Select mes = new Select(driver.findElement(By.name("month")));
        mes.selectByIndex(06);
        driver.findElement(By.xpath("//input[@placeholder = 'AAAA']")).sendKeys("1985");
    }


    //Spotify con CSS selector
    //Completar todos los campos con Css Selector name
    @Test
    public void spotifyByNameCss() {
        WebDriver driver = getDriver("https://www.spotify.com/uy/signup/");
        driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("1234mrb@gmail.com");
        driver.findElement(By.cssSelector("input[name = 'confirm']")).sendKeys("1234mrb@gmail.com");
        driver.findElement(By.cssSelector("input[name = 'password']")).sendKeys("holamundo");
        driver.findElement(By.cssSelector("input[name = 'displayname']")).sendKeys("TestSelenium");
        driver.findElement(By.cssSelector("input[name = 'day']")).sendKeys("15");

        Select mes = new Select(driver.findElement(By.cssSelector("select[name = 'month']")));
        mes.selectByIndex(06);
        driver.findElement(By.cssSelector("input[name = 'year']")).sendKeys("2001");

    }

    //Completar todos los campos con Css Selector placeholder
    @Test
    public void spotifyByPlaceHolderCss() {
        WebDriver driver = getDriver("https://www.spotify.com/uy/signup");
        driver.findElement(By.cssSelector("input[placeholder = 'Introduce tu correo electrónico.']")).sendKeys("1234mrb@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder = 'Vuelve a introducir tu correo electrónico.']")).sendKeys("1234mrb@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder = 'Crea una contraseña.']")).sendKeys("holamundo");
        driver.findElement(By.cssSelector("input[placeholder = 'Introduce un nombre de perfil.']")).sendKeys("TestSelenium");
        driver.findElement(By.cssSelector("input[placeholder = 'DD']")).sendKeys("15");

        Select mes = new Select(driver.findElement(By.cssSelector("select[name = 'month']")));
        mes.selectByIndex(06);
        driver.findElement(By.cssSelector("input[placeholder = 'AAAA']")).sendKeys("2001");
    }


    //Gmail con XPath
    @Test
    public void gmailXpathEx1() {
        WebDriver driver = getDriver("https://www.gmail.com");

        driver.findElement(By.xpath("//span[@class = 'NlWrkb snByac']")).click();

    }

    @Test
    public void gmailXpathEx2() {
        WebDriver driver = getDriver("https://www.gmail.com");

    }


}
