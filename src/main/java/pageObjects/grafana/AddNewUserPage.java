package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AddNewUserPage {

    @FindBy(how = How.ID, using = "name-input")
    public WebElement txt_name;

    @FindBy(how = How.ID, using = "email-input")
    public WebElement txt_email;

    @FindBy(how = How.ID, using = "username-input")
    public WebElement txt_username;

    @FindBy(how = How.ID, using = "password-input")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement btn_create;

}
