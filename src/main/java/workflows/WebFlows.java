package workflows;

import extensions.UIActions;
import utilities.CommonOps;

public class WebFlows extends CommonOps {

    public static void login(String user, String pass){
        UIActions.updateText(grafanaLogin.txt_username, user);
        UIActions.updateText(grafanaLogin.txt_password, pass);
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
    }

    public static void showUsers(){
        UIActions.mouseHover( grafanaLeftMenu.btn_server,grafanaServerAdmin.link_users);
    }

    public static void createNewUser(String name, String email, String username, String pass){
        UIActions.click(grafanaServerAdminMain.btn_newUser);
        UIActions.updateText(grafanaAddNewUser.txt_name, name);
        UIActions.updateText(grafanaAddNewUser.txt_email, email);
        UIActions.updateText(grafanaAddNewUser.txt_username, username);
        UIActions.updateText(grafanaAddNewUser.txt_password, pass);
        UIActions.click(grafanaAddNewUser.btn_create);
    }

    public static void deleteLastUser(){
        UIActions.click(grafanaServerAdminMain.rows.get(grafanaServerAdminMain.rows.size()-1));
        UIActions.click(grafanaEditUser.btn_deleteUser);
        UIActions.click(grafanaEditUser.btn_confirmDeleteUser);
    }
}
