package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base{

    public static void initGrafana(){
        grafanaLogin = PageFactory.initElements(driver, pageObjects.grafana.LoginPage.class);
        grafanaMain = PageFactory.initElements(driver, pageObjects.grafana.MainPage.class);
        grafanaLeftMenu = PageFactory.initElements(driver, pageObjects.grafana.LeftMenuPage.class);
        grafanaServerAdmin = PageFactory.initElements(driver,pageObjects.grafana.ServerAdminPage.class);
//      grafanaUsers = PageFactory.initElements(driver,pageObjects.grafana.UsersPage.class);
    }
}
