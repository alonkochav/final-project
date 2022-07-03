package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

    public class ServerAdminMainPage  extends ServerAdminMenuPage {

    @FindBy(how = How.CSS, using = ".admin-list-table table tbody tr")
    public List<WebElement> rows;

    @FindBy(how = How.CSS, using = ".admin-list-table table tbody tr:last-of-type a")
    public WebElement row;

    @FindBy(how = How.CSS, using = ".page-action-bar a")
    public WebElement btn_newUser;

    @FindBy(how = How.CSS, using = "input[placeholder='Search user by login, email, or name.']")
    public WebElement txt_search;

    }
