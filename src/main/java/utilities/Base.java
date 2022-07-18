package utilities;

 import io.appium.java_client.AppiumDriver;
 import io.appium.java_client.android.AndroidDriver;
 import io.restassured.response.Response;
 import org.json.simple.JSONObject;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.remote.DesiredCapabilities;
 import org.openqa.selenium.support.ui.WebDriverWait;
 import org.openqa.selenium.interactions.Actions;
 import org.sikuli.script.Screen;
 import org.testng.asserts.SoftAssert;
 import io.restassured.specification.RequestSpecification;
 import io.restassured.path.json.JsonPath;

public class Base {

    // General
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;

    // Web
    protected static WebDriver driver;

    // Mobile
    protected static AndroidDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    // Rest API

    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject params = new JSONObject();
    protected static JsonPath jp = new JsonPath();

    // Page Objects - Web
    protected static pageObjects.grafana.LoginPage grafanaLogin;
    protected static pageObjects.grafana.MainPage grafanaMain;
    protected static pageObjects.grafana.LeftMenuPage grafanaLeftMenu;
    protected static pageObjects.grafana.ServerAdminMenuPage grafanaServerAdmin;
    protected static pageObjects.grafana.ServerAdminMainPage grafanaServerAdminMain;
    protected static pageObjects.grafana.AddNewUserPage grafanaAddNewUser;
    protected static pageObjects.grafana.EditUserPage grafanaEditUser;

    // Page Objects - Mobile
    protected static pageObjects.mortgage.MainPage mortgageMain;


}
