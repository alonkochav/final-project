package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base{

    public static void initGrafana(){
        grafanaLogin = PageFactory.initElements(driver, pageObjects.grafana.LoginPage.class);
        grafanaMain = PageFactory.initElements(driver, pageObjects.grafana.MainPage.class);
        grafanaLeftMenu = PageFactory.initElements(driver, pageObjects.grafana.LeftMenuPage.class);
        grafanaServerAdmin = PageFactory.initElements(driver, pageObjects.grafana.ServerAdminMenuPage.class);
        grafanaServerAdminMain = PageFactory.initElements(driver, pageObjects.grafana.ServerAdminMainPage.class);
        grafanaAddNewUser = PageFactory.initElements(driver, pageObjects.grafana.AddNewUserPage.class);
        grafanaEditUser = PageFactory.initElements(driver, pageObjects.grafana.EditUserPage.class);
    }
}
