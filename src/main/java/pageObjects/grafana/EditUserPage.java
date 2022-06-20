package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage {

    @FindBy(how = How.CSS, using = "div.gf-form-group > div + div > button")
    public WebElement btn_deleteUser;

    @FindBy(how = How.CSS, using = "div[class$='horizontal-group'] div:nth-of-type(2) button")
    public WebElement btn_confirmDeleteUser;

}
