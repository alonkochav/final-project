package workflows;

import extensions.UIActions;
import extensions.Verifications;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

public class WebFlows extends CommonOps {

    public static void login(String user, String pass){
        UIActions.updateText(grafanaLogin.txt_username, user);
        UIActions.updateText(grafanaLogin.txt_password, pass);
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
    }

    public static void openUsersPage(){
        UIActions.mouseHover(grafanaLeftMenu.btn_server,grafanaServerAdmin.link_users);
    }
}
