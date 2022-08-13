package workflows;

import extensions.DBActions;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.Date;
import java.util.List;

public class WebFlows extends CommonOps {

    @Step("{0}")
    public void log(final String message){
        //intentionally empty
    }

    public void mylogger(String msg){
        Date d = new Date();
        String[] dateTokens = d.toString().split(" ");
        System.out.println(dateTokens[3] + " " + msg);
        log(dateTokens[3] + msg);
    }

    step
    @Step("Business Flow: Login to Grafana")
    public static void login(String user, String pass){
        UIActions.updateText(grafanaLogin.txt_username, user);
        UIActions.updateText(grafanaLogin.txt_password, pass);
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
    }

    @Step("Business Flow: Login to Grafana using DB Credentials")
    public static void loginDB(){
        String query = "SELECT first_name, password FROM employees WHERE id='3'";
        List<String> cred = DBActions.getCredentials(query);
        System.out.println(cred.get(0));
        UIActions.updateText(grafanaLogin.txt_username, cred.get(0));
        UIActions.updateText(grafanaLogin.txt_password, cred.get(1));
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
    }

    @Step("Business Flow: show Users")
    public static void showUsers()
    {
        UIActions.mouseHover( grafanaLeftMenu.btn_server,grafanaServerAdmin.link_users);
    }

    @Step("Business Flow: Create New User")
    public static void createNewUser(String name, String email, String username, String pass){
        UIActions.click(grafanaServerAdminMain.btn_newUser);
        UIActions.updateText(grafanaAddNewUser.txt_name, name);
        UIActions.updateText(grafanaAddNewUser.txt_email, email);
        UIActions.updateText(grafanaAddNewUser.txt_username, username);
        UIActions.updateText(grafanaAddNewUser.txt_password, pass);
        UIActions.click(grafanaAddNewUser.btn_create);
    }

    @Step("Business Flow: Delete last user")
    public static void deleteLastUser(){
        UIActions.click(grafanaServerAdminMain.row);
        UIActions.click(grafanaEditUser.btn_deleteUser);
        UIActions.click(grafanaEditUser.btn_confirmDeleteUser);
    }

    @Step("Business Flow: Search and Verify User")
    public static void searchAndVerifyUser(String user, String shouldExist) {
        UIActions.updateTextHuman(grafanaServerAdminMain.txt_search,user);
        if (shouldExist.equalsIgnoreCase("existing")){
            Verifications.existenceOfElement(grafanaServerAdminMain.rows);
            System.out.println("The user " + user + " DOES exist!");
        } else if (shouldExist.equalsIgnoreCase("nonExisting")){
            Verifications.nonExistenceOfElement(grafanaServerAdminMain.rows);
            System.out.println("The user " + user + " doesn't exist");
        } else
            throw new RuntimeException("Invalid Expected Output Option in Data Driven Testing , Should be 'existing' or 'nonExisting'");
    }
}
