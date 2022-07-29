package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.screenrecording.BaseStartScreenRecordingOptions;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.restassured.RestAssured;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.sikuli.script.Screen;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;

import java.lang.reflect.Method;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {

    public boolean isWeb() {
        return getData("PlatformName").equalsIgnoreCase("web");
    }
    public boolean isMobile() {
        return getData("PlatformName").equalsIgnoreCase("mobile");
    }
    public boolean isAPI() {
        return getData("PlatformName").equalsIgnoreCase("api");
    }
    public boolean isElectron() {
        return getData("PlatformName").equalsIgnoreCase("electron");
    }

    public static String getData(String nodeName) {
        File fXmlFile;
        DocumentBuilder dBuilder;
        Document doc = null;
        DocumentBuilderFactory dbFactory;

        try {
            fXmlFile = new File(".\\Configuration\\DataConfig.xml");
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        } finally {
            return doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }

    public void initBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFirefoxDriver();
//        else if (browserType.equalsIgnoreCase("tortor"))
//            driver = initTorDriver();
        else if (browserType.equalsIgnoreCase("ie/edge"))
            driver = initIEDriver();
        else
            throw new RuntimeException("Invalid browser type");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("Timeout")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("Timeout")));
        driver.get(getData("url"));
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

    // Mobile driver methods

    public static void initMobile(){

        dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("AppPackage"));
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("AppActivity"));
        try {
            mobileDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), dc);

        } catch (Exception e) {
            System.out.println("Cannot Connect to Appium Server. See details: " + e);
        }
        ManagePages.initMortgage();
        mobileDriver.manage().timeouts().implicitlyWait(Long.parseLong(getData("Timeout")), TimeUnit.SECONDS);
        wait = new WebDriverWait(mobileDriver, Long.parseLong(getData("Timeout")));
    }

    //   Rest API

    public static void initAPI() {
        RestAssured.baseURI = getData("urlAPI");
        httpRequest = RestAssured.given().auth().preemptive().basic(getData("username"),getData("password"));
    }

    //  Electron Driver
    public static void initElectron() {
        System.setProperty("webdriver.chrome.driver",getData("ElectronDriverPath"));
        ChromeOptions opt = new ChromeOptions();
        dc.setCapability("chromeOptions",opt);
        dc.setBrowserName("chrome");
        driver = new ChromeDriver(dc);
        ManagePages.initToDo();

    }

    //  ---    BeforeClass
    @BeforeClass
    public void startSession() {
        if (isWeb())
            initBrowser(getData("BrowserName"));
        else if (isMobile())
            initMobile();
        else if (isAPI())
            initAPI();
        else if (isElectron())
            initElectron();
        else
            throw new RuntimeException("Invalid platform name");
        softAssert = new SoftAssert();
        screen = new Screen();
    }


    //  ---    BeforeMethod

    @BeforeMethod
    public void beforeMethod(Method method) {
        try {
            if (isWeb()){
                ((JavascriptExecutor) driver).executeScript("window.focus();");
                wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("html"), 0));
                MonteScreenRecorder.startRecord(method.getName());
            }
            else {
//                ((CanRecordScreen) mobileDriver).startRecordingScreen();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 //   --      @AfterMethod
    @AfterMethod
    public void afterMethod() {
        if (isWeb()) {
            driver.get(getData("url"));
            ((JavascriptExecutor) driver).executeScript("window.focus();");
        }
    }

//   ---            @AfterClass
   @AfterClass
    public void closeSession(){
       if (!isAPI()) {
           if (isMobile())
               mobileDriver.quit();
           else
               driver.quit();
       }
    }

}
