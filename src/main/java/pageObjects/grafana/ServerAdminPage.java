package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminPage extends LeftMenuPage {
//    @FindBy(how = How.ID, using = "navbar-menu-portal-container")
//    public WebElement link_navbar;

    @FindBy(how = How.CSS, using = "a[href='/admin/users']")
    public WebElement link_users;

    @FindBy(how = How.CSS, using = "a[href='/admin/orgs']")
    public WebElement link_orgs;

    @FindBy(how = How.CSS, using = "a[href='/admin/settings']")
    public WebElement link_settings;

    @FindBy(how = How.CSS, using = "a[href='/admin/plugins']")
    public WebElement link_plugins;

    @FindBy(how = How.CSS, using = "a[href='/admin/stats']")
    public WebElement link_stats;
}
