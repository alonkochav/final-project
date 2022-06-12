package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class Base {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;

    // page objects
    protected static pageObjects.grafana.LoginPage grafanaLogin;
    protected static pageObjects.grafana.MainPage grafanaMain;
    protected static pageObjects.grafana.LeftMenuPage grafanaLeftMenu;
    protected static pageObjects.grafana.ServerAdminPage grafanaServerAdmin;
//    protected static pageObjects.grafana.UsersPage grafanaUsers;

}
