package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

    public class ServerAdminMainPage  extends ServerAdminMenuPage {

    @FindBy(how = How.CSS, using = "table.filter-table tbody tr")
    public List<WebElement> rows;

    @FindBy(how = How.CSS, using = "div.page-body div.page-action-bar a[href='admin/users/create")
    public WebElement btn_newUser;

    }
