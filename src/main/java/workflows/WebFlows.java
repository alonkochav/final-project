package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {

    public static void login(String user, String pass){

        UIActions.updateText(grafanaLogin.txt_username, user);
        UIActions.updateText(grafanaLogin.txt_password, pass);
        UIActions.click(grafanaLogin.btn_login);
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
        UIActions.click(grafanaLogin.btn_skip);
    }
}
