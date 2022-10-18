package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

    public class ServerAdminMainPage  extends ServerAdminMenuPage {

    @FindBy(how = How.CSS, using = ".admin-list-table table tbody tr")
    private List<WebElement> rows;

    @FindBy(how = How.CSS, using = ".admin-list-table table tbody tr:last-of-type a")
    private WebElement row;

    @FindBy(how = How.CSS, using = ".page-action-bar a")
    private WebElement btn_newUser;

    @FindBy(how = How.CSS, using = "input[placeholder='Search user by login, email, or name.']")
    private WebElement txt_search;

        public List<WebElement> getRows() {
            return rows;
        }

        public WebElement getRow() {
            return row;
        }

        public WebElement getBtn_newUser() {
            return btn_newUser;
        }

        public WebElement getTxt_search() {
            return txt_search;
        }

    }
