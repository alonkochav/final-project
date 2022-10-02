package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMenuPage {

    @FindBy(how = How.CSS, using = "a[href='/']")
    private WebElement btn_home;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(1)")
    private WebElement btn_search;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(2)")
    private WebElement btn_dashboards;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(3)")
    private WebElement btn_explore;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(4)")
    private WebElement btn_alerting;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(5)")
    private WebElement btn_configuration;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(6)")
    private WebElement btn_server;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(7) > div > a > span > img")
    private WebElement btn_admin;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(8)")
    private WebElement btn_help;

    public WebElement getBtn_home() {
        return btn_home;
    }

    public WebElement getBtn_search() {
        return btn_search;
    }

    public WebElement getBtn_dashboards() {
        return btn_dashboards;
    }

    public WebElement getBtn_explore() {
        return btn_explore;
    }

    public WebElement getBtn_alerting() {
        return btn_alerting;
    }

    public WebElement getBtn_configuration() {
        return btn_configuration;
    }

    public WebElement getBtn_server() {
        return btn_server;
    }

    public WebElement getBtn_admin() {
        return btn_admin;
    }

    public WebElement getBtn_help() {
        return btn_help;
    }

}
