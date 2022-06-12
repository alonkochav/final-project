package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {

    public void initBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFirefoxDriver();
        else if (browserType.equalsIgnoreCase("ie/edge"))
            driver = initIEDriver();
        else
            throw new RuntimeException("Invalid browser type");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,5);
        driver.get("http://localhost:3000/");
        ManagePages.initGrafana();
        action = new Actions(driver);
    }

    public static WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initIEDriver() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;
    }

    @BeforeClass
    public void startSession() {
        String platform = "web";
        if (platform.equalsIgnoreCase("web"))
            initBrowser("chrome");
//        else if (platform.equalsIgnoreCase("mobile"))
//            initMobile();
        else
            throw new RuntimeException("Invalid platform name");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeSession() {
        driver.quit();

    }
}


