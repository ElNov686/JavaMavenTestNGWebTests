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
    //TC_11_03
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
    @Test
    public void testSubmenu0and9() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/elena/Downloads/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/a.html";
        String expectedResult = "0-9";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmenu9and0 = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a")
        );

        String actualResult = menuSubmenu9and0.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }
    //TC_11_06 Подтвердите, что имена создателей сайта:
    //Oliver Schade
    //Gregor Scheithauer
    //Stefan Scheler

    //1. Открыть вебсайт на главной странице
    //2. Кликнуть на ссылку  team members
    //3. Подтвердить, имена создателей соответствует ожидаемому
    //4. Закрыть браузер

    @Test
    public void testTeamMembers() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/elena/Downloads/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/team.html";
        String [] expectedResult = {"Oliver Schade", "Gregor Scheithauer", "Stefan Scheler"};

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.findElement(By.xpath("//a[@href='team.html']"))
                .click();

        String [] actualResult = new String[3];
        WebElement firstCreatorName = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[text()='Oliver Schade']"));
        actualResult[0] = firstCreatorName.getText();
        Assert.assertEquals(actualResult[0], expectedResult[0]);

        WebElement secondCreatorName = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/h3[text()='Gregor Scheithauer']"));
        actualResult[1] = secondCreatorName.getText();
        Assert.assertEquals(actualResult[1], expectedResult[1]);

        WebElement thirdCreatorName = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='main']/h3[text()='Stefan Scheler']"));
        actualResult[2] = thirdCreatorName.getText();
        Assert.assertEquals(actualResult[2], expectedResult[2]);

        driver.quit();
    }
    }
