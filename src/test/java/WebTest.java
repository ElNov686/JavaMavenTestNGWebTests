import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    @Test
    public void testMenuStartTitle() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/elena/Downloads/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowsLanguages = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );
        menuBrowsLanguages.click();

        WebElement menuStart = driver.findElement(By.xpath(

                "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']")
        );
        menuStart.click();

        WebElement h2 = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/h2")
        );
        String actualResult = h2.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    @Test
    public void testHeaderH1() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/elena/Downloads/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement headerH1 = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='header']/h1")
        );
        headerH1.click();

        String actualResult = headerH1.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    @Test
    public void testSubmitNewLanguage() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/elena/Downloads/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit new Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='header']/div[@id='navigation']/ul[@id='menu']" +
                        "li[@class='sel']/a[@href='/submitnewlanguage.html']")
        );
        menuSubmitNewLanguage.click();

        String actualResult = menuSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }
    //1. Открыть вебсайт на странице
    //2. Считать название первого подзаголовка
    //3. Подтвердить, что название подменю соответствует ожидаемому
    //4. Закрыть браузер
    @Test
    public void testsubMenuCategoryA() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/elena/Downloads/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/a.html";
        String expectedResult = "Category A";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/h2")
        );
        menuSubmitNewLanguage.click();

        String actualResult = menuSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }
    //TC_11_04
    //1. Открыть вебсайт на странице: http://www.99-bottles-of-beer.net/abc. html
    //2. Считать название первого подзаголовка
    //3. Подтвердить, что название подменю соответствует ожидаемому 0-9
    //4. Закрыть браузер

    }
