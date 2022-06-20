package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import workflows.WebFlows;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static java.lang.Runtime.getRuntime;

public class CommonOps extends Base {

    public String getData (String nodeName) {
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
//        else if (browserType.equalsIgnoreCase("tor"))
//            driver = initTorDriver();
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

    public static WebDriver initFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;

    }

    public static WebDriver initIEDriver() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;
    }

/*    public static WebDriver initTorDriver() {
        System.setProperty("webdriver.gecko.driver", ".C:\\Users\\DELL\\Desktop\\Tor Browser\\geckodriver.exe");
        String torPath = "C:\\Users\\DELL\\Desktop\\Tor Browser\\Browser\\firefox.exe";
        Runtime runTime = getRuntime();
        Process torProcess = runTime.exec(torPath + " -n");
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("network.proxy.type", 1);
        profile.setPreference("network.proxy.socks", "127.0.0.1");
        profile.setPreference("network.proxy.socks_port", 9150);
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setProfile(profile);
        WebDriver driver;
        driver = new FirefoxDriver(firefoxOptions);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return driver;

        //added end

//        WebDriverManager.firefoxdriver().setup();
//
//        System.setProperty("webdriver.gecko.driver", ".C:\\Users\\DELL\\Desktop\\Tor Browser\\geckodriver.exe");
//        String torPath = "C:\\Users\\DELL\\Desktop\\Tor Browser\\Browser\\firefox.exe";
//        String profilePath = "C:\\Users\\DELL\\Desktop\\Tor Browser\\Browser\\TorBrowser\\Data\\Browser\\profile.default";
//
//        File torProfileDir = new File(profilePath);
//        FirefoxBinary binary = new FirefoxBinary(new File(torPath));
//        FirefoxProfile torProfile = new FirefoxProfile(torProfileDir);
//
//        FirefoxOptions options = new FirefoxOptions();
//        options.setBinary(binary);
//        options.setProfile(torProfile);
//        options.setCapability(FirefoxOptions.FIREFOX_OPTIONS,options);
//        WebDriver driver = new FirefoxDriver(options);


        // Path of Tor Browser Binary
//        String torBinaryPath = "C:\\Users\\DELL\\Desktop\\Tor Browser\\Browser\\firefox.exe";
//        String torBinaryPath = "C:\\Users\\DELL\\Desktop\\Tor Browser\\Browser\\TorBrowser\\Tor\\tor.exe";

//        FirefoxProfile profile = new FirefoxProfile(new File(
//                "C:\\Users\\DELL\\Desktop\\Tor Browser\\Browser\\TorBrowser\\Data\\Browser\\profile.default"));
        // Creating Object o Qf FirefoxOptions

//        // Creating FirefoxProfile by providing default Tor Profile.

//        FirefoxOptions options = new FirefoxOptions();

// Path of Tor Browser Binary
//        profile.setPreference("network.proxy.type", 1);
//        profile.setPreference("network.proxy.socks", "127.0.0.1");
//        profile.setPreference("network.proxy.socks_port", 9050 );
//        profile.setPreference("extensions.torlauncher.start_tor", false);
//        profile.setPreference("extensions.torbutton.block_disk", false);
//        profile.setPreference("extensions.torbutton.custom.socks_host", "127.0.0.1");
//        profile.setPreference("extensions.torbutton.custom.socks_port", 9050 );
//        profile.setPreference("extensions.torbutton.inserted_button", true);
//        profile.setPreference("extensions.torbutton.launch_warning", false);
//        profile.setPreference("privacy.spoof_english", 2);
//        profile.setPreference("extensions.torbutton.loglevel", 2);
//        profile.setPreference("extensions.torbutton.logmethod", 0);
//        profile.setPreference("extensions.torbutton.settings_method", "custom");
//        profile.setPreference("extensions.torbutton.use_privoxy", false);
//        profile.setPreference("extensions.torlauncher.control_port", 9251); // 9251
//        profile.setPreference("extensions.torlauncher.loglevel", 2);
//        profile.setPreference("extensions.torlauncher.logmethod", 0);
//        profile.setPreference("extensions.torlauncher.prompt_at_startup", false);
//        profile.setPreference("browser.startup.page", "0");
//        profile.setPreference("browser.startup.homepage", "about:newtab");
//        profile.setPreference("extensions.torlauncher.prompt_at_startup", 0);
//        profile.setPreference("webdriver.load.strategy", "normal");
//        profile.setPreference("app.update.enabled", false);
//        profile.setPreference("extensions.torbutton.versioncheck_enabled", false);
//        profile.setPreference("extensions.torbutton.prompted_language", true);
//        profile.setPreference("extensions.torbutton.socks_port", 9050);
//
//
//        options.setProfile(profile);
//        options.setBinary(torBinaryPath);
//        options.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
//
//        driver = new FirefoxDriver(options);
//        return driver;
    }
*/

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
        driver.get(getData("url"));

    }

    @AfterClass
    public void closeSession() {
        driver.quit();

    }
}


