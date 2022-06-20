package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import workflows.WebFlows;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {

    public String getData (String nodeName) {
        File fXmlFile;
        DocumentBuilder dBuilder;
        Document doc = null;
        DocumentBuilderFactory dbFactory;

        try {
            fXmlFile = new File("D:\\Automation\\final-project\\Confirguration\\DataConfig.xml");
            System.out.println(fXmlFile);
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
        }
        catch(Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        finally {
            return doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }

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
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("Timeout")),TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,Long.parseLong(getData("Timeout")));
        driver.get(getData("url"));
        ManagePages.initGrafana();
        action = new Actions(driver);
        softAssert = new SoftAssert();
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
        if (getData("PlatformName").equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
//        else if (getData("PlatformName").equalsIgnoreCase("mobile"))
//            initMobile();
        else
            throw new RuntimeException("Invalid platform name");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void afterMethod(){
        driver.get("http://localhost:3000/");

    }

    @AfterClass
    public void closeSession() {
        driver.quit();

    }
}


