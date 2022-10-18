package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminMenuPage extends LeftMenuPage {
    @FindBy(how = How.ID, using = "navbar-menu-portal-container")
    private WebElement link_navbar;

    @FindBy(how = How.CSS, using = "a[href='/admin/users']")
    private WebElement link_users;

    @FindBy(how = How.CSS, using = "a[href='/admin/orgs']")
    private WebElement link_orgs;

    @FindBy(how = How.CSS, using = "a[href='/admin/settings']")
    private WebElement link_settings;

    @FindBy(how = How.CSS, using = "a[href='/admin/plugins']")
    private WebElement link_plugins;

    @FindBy(how = How.CSS, using = "a[href='/admin/stats']")
    private WebElement link_stats;

    public WebElement getLink_navbar() {
        return link_navbar;
    }

    public WebElement getLink_users() {
        return link_users;
    }

    public WebElement getLink_orgs() {
        return link_orgs;
    }

    public WebElement getLink_settings() {
        return link_settings;
    }

    public WebElement getLink_plugins() {
        return link_plugins;
    }

    public WebElement getLink_stats() {
        return link_stats;
    }

}
