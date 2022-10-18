package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.NAME, using = "user")
    private WebElement txt_username;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    private WebElement btn_login ;

    @FindBy(how = How.CSS, using = "form div:nth-of-type(3) div:nth-of-type(2) button")
    private WebElement btn_skip;

    public WebElement getTxt_username() {
        return txt_username;
    }

    public WebElement getTxt_password() {
        return txt_password;
    }

    public WebElement getBtn_login() {
        return btn_login;
    }

    public void setBtn_login(WebElement btn_login) {
        this.btn_login = btn_login;
    }

    public WebElement getBtn_skip() {
        return btn_skip;
    }

}
