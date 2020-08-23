package practico9;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class practico_9 {

    //Ej 1: Crear un método que abra el browser y muestre el explorador de google con chrome
    @Test
    public void ejercicio1(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.google.com";
        driver.get(baseURL);
    }

    //Ej2: Crear un método llamado mostrarTitulo, que muestre el título del sitio web.
    @Test
    public void mostrarTitulo(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.google.com";
        driver.get(baseURL);

        System.out.println(driver.getTitle());
    }

    //Ej3: Crear un método llamado bbcMundo
    @Test
    public void bbcMundo(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);

        //crea una instancia nueva de un navegador chrome
        WebDriver driver = new ChromeDriver();
        String bbcURL = "https://www.bbc.com/mundo";
        driver.get(bbcURL);

        System.out.println("*********** H1 de BBC MUNDO *************");
        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));
        for (WebElement elementH1: listaH1){
            System.out.println(elementH1.getText());
        }

        System.out.println("*********** H2 de BBC MUNDO *************");
        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));
        for (WebElement elementH2: listaH2){
            System.out.println(elementH2.getText());
        }

        System.out.println("*********** H3 de BBC MUNDO *************");
        List<WebElement> listaH3 = driver.findElements(By.tagName("h3"));
        for (WebElement elementH3: listaH3){
            System.out.println(elementH3.getText());
        }

        System.out.println("*********** Links de BBC MUNDO *************");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement elementLink: links){
            System.out.println(elementLink.getText());
        }

        driver.manage().window().maximize();
        driver.navigate().refresh();
        //driver.close();
    }

    //Ej4: Crear un método llamado bbcMundoLinks
    @Test
    public void bbcMundoLinks(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);

        WebDriver driver = new ChromeDriver();
        String bbcURL = "https://www.bbc.com/mundo";
        driver.get(bbcURL);

        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));

        System.out.println("La cantidad de párrafos es " + paragraphs.size());
        System.out.println("La cantidad de links es " + anchors.size());

        for (WebElement a : anchors){
            System.out.println(a.getText());
        }
        driver.navigate().refresh();
        driver.close();
    }

    //Ej5: Crear un método llamado bbcMundoListas
    @Test
    public void bbcMundoListas(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String bbcURL = "https://www.bbc.com/mundo";
        driver.get(bbcURL);

        List<WebElement> listas = driver.findElements(By.tagName("li"));
        for (WebElement a : listas){
            System.out.println(a.getText());
        }
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
    }

    //Ej6: Crear un método llamado getTitleTest
    @Test
    public void getTitleTest(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.google.com";
        driver.get(baseURL);

        String expectedTitle = "Google";
        String actualTitle = "";

        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed " + actualTitle);
        }
    }

    //Ej7: Crear un método llamado getWindowsSizeTest
    @Test
    public void getWindowsSizeTest(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.google.com";
        driver.get(baseURL);

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        System.out.println(height);
        System.out.println(width);

        //Setear un nuevo tamaño de pantalla 1024x768
        Dimension size = driver.manage().window().getSize();
        int height1 = size.getHeight();
        int width1 = size.getWidth();

        driver.manage().window().setSize(new Dimension(1024,768));

        //Validar que el ancho y el alto sea el esperado
        height = driver.manage().window().getSize().getHeight();
        Assert.assertEquals(height, 768);

        width = driver.manage().window().getSize().getWidth();
        Assert.assertEquals(width, 1024);
    }

    //Ej8: Crear un método llamado getGoogleDriver que inicialice un sitio web www.google.com
    //@Test
    private WebDriver getGoogleDriver(){

        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.google.com";
        driver.get(baseURL);

       return driver;
    }

    //Ej9:Crear un método llamado getDriver que inicialice un sitio web que recibe por parámetro
    private WebDriver getDriver(String url){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();

        String baseURL = url;
        driver.get(baseURL);

        return driver;
    }

   /* private WebDriver getDriver(String url){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }*/

    //Ej10:Crear un método llamado searchInGoogle
    @Test
    public void searchInGoogle(){
        WebDriver driver = getDriver("https://www.google.com");

        //Inserta el texto "WebElement" y ejecuta la accion del teclado "Enter"
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys ("WebElement" + Keys.ENTER);
    }

    //Ej11:Crear un método llamado searchInGoogleAndGoBack
    @Test
    public void searchInGoogleAndGoBack(){
        WebDriver driver = getDriver("https://www.google.com");
        System.out.println("El titulo del sitio es: " + driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys ("selenium driver" + Keys.ENTER);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }

    //Ej12:Crear un método llamado getBrowserSizes
    @Test
    public void getBrowserSizes(){
        WebDriver driver = getDriver("https://www.facebook.com");

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();
        System.out.println("El alto del navegador es: " + height);
        System.out.println("El ancho del navegador es: " + width);

        driver.manage().window().maximize();
        int heightMax = driver.manage().window().getSize().getHeight();
        int widthMax = driver.manage().window().getSize().getWidth();
        System.out.println("El alto del navegador maximizado es: " + heightMax);
        System.out.println("El ancho del navegador maximizado es: " + widthMax);
    }

    //Ej13:Crear un método llamado facebookPageTest
    @Test
    public void facebookPageTest(){
        WebDriver driver = getDriver("https://www.facebook.com");

        List<WebElement> divs = driver.findElements(By.tagName("div"));
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("La cantidad de elementos de tipo div en el sitio son: " + divs.size());

        System.out.println("******** TEXTO DE LOS TIPOS ANCHOR ********");
        for (WebElement elementAnchor: anchors){
            System.out.println(elementAnchor.getText());
        }

        System.out.println("La cantidad de botones que tiene la pagina son: " + buttons.size());
        System.out.println("******** TEXTO DE LOS BOTONES ********");
        for (WebElement elementButton: buttons){
            System.out.println(elementButton.getText());
        }
    }

    //Ej14:Crear un método con un nombre a seleccionar
    @Test
    public void netflixTest(){
        WebDriver driver = getDriver("https://www.netflix.com/uy/");

        //Mostrar los elementos h1, h2 o h3 que se encuentren en mayor cantidad en el sitio.
        List<WebElement> h1 = driver.findElements(By.tagName("h1"));
        List<WebElement> h2 = driver.findElements(By.tagName("h2"));
        List<WebElement> h3 = driver.findElements(By.tagName("h3"));

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        List<WebElement> divs = driver.findElements(By.tagName("div"));
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        List<WebElement> links = driver.findElements(By.tagName("link"));

        for (WebElement elementH1: h1){
            System.out.println(elementH1.getText());
        }

        for (WebElement elementH2: h2){
            System.out.println(elementH2.getText());
        }

        for (WebElement elementH3: h3){
            System.out.println(elementH3.getText());
        }

        driver.navigate().refresh();

       //Mostrar el texto de los botones que se encuentran en la página, daba error pq no habia puse una Excepcion
        System.out.println("*************** TEXTO DE LOS BOTONES ***************");
        try {
            for (WebElement elementButton: buttons){
                System.out.println(elementButton.getText());
            }
        }catch (Exception e){
            System.out.println("No hay botones en la pagina");
        };

        driver.manage().window().maximize();
        System.out.println("La cantidad de elementos de tipo div que contiene el sitio son: " + divs.size());
        System.out.println("El titulo de la pagina es: " + driver.getTitle());
        System.out.println("La cantidad de elementos de tipo input son: " + inputs.size());
        System.out.println("La cantidad de elementos de tipo link son: " + links.size());

    }

    //Ej15:Acceder a Netflix
    @Test
    public void netflixStartTest(){
        WebDriver driver = getDriver("https://www.netflix.com/uy/");

        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[1]/div/a")).click();
        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));
        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));
        List<WebElement> divs = driver.findElements(By.tagName("div"));
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        List<WebElement> links = driver.findElements(By.tagName("link"));

        System.out.println("*********** H1 de NETFLIX *************");
        for (WebElement elementH1: listaH1){
            System.out.println(elementH1.getText());
        }
        System.out.println("*********** H2 de NETFLIX *************");
        for (WebElement elementH2: listaH2){
            System.out.println(elementH2.getText());
        }

        driver.navigate().back();
        driver.navigate().refresh();

        System.out.println("*********** DIV de NETFLIX *************"); //no habia div y se rompia, por eso puse Exception
        try {
            for (WebElement elementDiv: divs){
                System.out.println(elementDiv.getText());
            }
        }catch (Exception e) {
            System.out.println("No hay div en la pagina");
        }

        System.out.println("El titulo de la pagina es: " + driver.getTitle());
        System.out.println("La cantidad de elementos de tipo input son: " + inputs.size());
        System.out.println("La cantidad de elementos de tipo link son: " + links.size());
    }

    //Ej16:Acceder a Spotify
    @Test
    public void spotifyTest(){
        WebDriver driver = getDriver("https://www.spotify.com/uy/");

       // System.out.println("El titulo de la pagina es: " + driver.getTitle());
        String expectedTitle = "Escuchar es todo - Spotify";
        String actualTitle = "";

        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed. El titulo es: " + actualTitle);
        }

        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));

        System.out.println("La cantidad de elementos de tipo parrafo es " + paragraphs.size());
        System.out.println("La cantidad de links que contiene la pagina es " + links.size()) ;

        System.out.println("******** TEXTO DE LOS BOTONES ********");
        for (WebElement b : buttons){
            System.out.println(b.getText());
        }

        WebElement help = driver.findElement(By.xpath("/html/body/div[2]/div/header/div/nav/ul/li[2]/a"));
        help.click();

        for (WebElement h1 : listaH1){
            System.out.println(h1.getText());
        }
    }

    //Ej17:Crear un método de test llamado sendKeysToFacebook
    @Test
    public void sendKeysToFacebook(){
        WebDriver driver = getDriver("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("pass")).sendKeys("holamundo");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
        button.click();

        WebElement smsError = driver.findElement(By.xpath("//*[contains(text(), 'Sorry, something went wrong.')]"));
        System.out.println(smsError.getText());

        Assert.assertEquals(smsError.getText(), "Sorry, something went wrong.");
    }

}












