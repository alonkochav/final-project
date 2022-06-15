package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage {

    @FindBy(how = How.CSS, using = "div.gf-form-group:nth-child(2) div:nth-child(2) button")
    public WebElement btn_deleteUser;

    @FindBy(how = How.CSS, using = "div[class$='horizontal-group'] div:nth-of-type(2) button")
    public WebElement btn_confirmDeleteUser;

}
