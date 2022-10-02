package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewUserPage {

    @FindBy(how = How.ID, using = "name-input")
    private WebElement txt_name;

    @FindBy(how = How.ID, using = "email-input")
    private WebElement txt_email;

    @FindBy(how = How.ID, using = "username-input")
    private WebElement txt_username;

    @FindBy(how = How.ID, using = "password-input")
    private WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    private WebElement btn_create;

    public WebElement getTxt_name() {
        return txt_name;
    }

    public WebElement getTxt_email() {
        return txt_email;
    }

    public WebElement getTxt_username() {
        return txt_username;
    }

    public WebElement getTxt_password() {
        return txt_password;
    }

    public WebElement getBtn_create() {
        return btn_create;
    }

}
