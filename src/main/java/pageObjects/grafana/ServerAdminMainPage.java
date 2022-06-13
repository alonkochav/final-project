package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

// Previously UsersPage
    public class ServerAdminMainPage  extends ServerAdminMenuPage {

    @FindBy(how = How.CSS, using = "table.filter-table tbody tr")
    public List<WebElement> rows;

}
