package workflows;

import extensions.DBActions;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;
import utilities.Log;

import java.util.List;

public class WebFlows extends CommonOps {

    @Step("Business Flow: Login to Grafana")
    public static void login(String user, String pass){
        UIActions.updateText(grafanaLogin.getTxt_username(), user);
        UIActions.updateText(grafanaLogin.getTxt_password(), pass);
        UIActions.click(grafanaLogin.getBtn_login());
        UIActions.click(grafanaLogin.getBtn_skip());
    }

    @Step("Business Flow: Login to Grafana using DB Credentials")
    public static void loginDB(){
        String query = "SELECT username,password FROM employees WHERE id='3'";
        List<String> cred = DBActions.getCredentials(query);
        Log.info(cred.get(0));
        UIActions.updateText(grafanaLogin.getTxt_username(), cred.get(0));
        UIActions.updateText(grafanaLogin.getTxt_password(), cred.get(1));
        UIActions.click(grafanaLogin.getBtn_login());
        UIActions.click(grafanaLogin.getBtn_skip());
    }

    @Step("Business Flow: show Users")
    public static void showUsers()
    {
        UIActions.mouseHover(grafanaLeftMenu.getBtn_server(), grafanaServerAdmin.getLink_users());
    }

    @Step("Business Flow: Create New User")
    public static void createNewUser(String name, String email, String username, String pass){
        UIActions.click(grafanaServerAdminMain.getBtn_newUser());
        UIActions.updateText(grafanaAddNewUser.getTxt_name(), name);
        UIActions.updateText(grafanaAddNewUser.getTxt_email(), email);
        UIActions.updateText(grafanaAddNewUser.getTxt_username(), username);
        UIActions.updateText(grafanaAddNewUser.getTxt_password(), pass);
        UIActions.click(grafanaAddNewUser.getBtn_create());
    }

    @Step("Business Flow: Delete last user")
    public static void deleteLastUser(){
        UIActions.click(grafanaServerAdminMain.getRow());
        UIActions.click(grafanaEditUser.getBtn_deleteUser());
        UIActions.click(grafanaEditUser.getBtn_confirmDeleteUser());
    }

    @Step("Business Flow: Search and Verify User")
    public static void searchAndVerifyUser(String user, String shouldExist) {
        UIActions.updateTextHuman(grafanaServerAdminMain.getTxt_search(),user);
        if (shouldExist.equalsIgnoreCase("existing")){
            Verifications.existenceOfElement(grafanaServerAdminMain.getRows());
            Log.info("The user " + user + " DOES exist!");
        } else if (shouldExist.equalsIgnoreCase("nonExisting")){
            Verifications.nonExistenceOfElement(grafanaServerAdminMain.getRows());
            Log.info("The user " + user + " doesn't exist");
        } else
            throw new RuntimeException("Invalid Expected Output Option in Data Driven Testing , Should be 'existing' or 'nonExisting'");
    }
}
