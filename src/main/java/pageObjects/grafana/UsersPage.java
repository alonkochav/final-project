package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsersPage {
    @FindBy(how = How.CSS, using = "table tr")
    public WebElement txt_username;

}
