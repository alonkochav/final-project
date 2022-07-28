package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMenuPage {
    @FindBy(how = How.CSS, using = "a[href='/']")
    public WebElement btn_home;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(1)")
    public WebElement btn_search;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(2)")
    public WebElement btn_dashboards;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(3)")
    public WebElement btn_explore;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(4)")
    public WebElement btn_alerting;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(5)")
    public WebElement btn_configuration;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(6)")
    public WebElement btn_server;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(7) > div > a > span > img")
    public WebElement btn_admin;

    @FindBy(how = How.CSS, using = "ul:first-of-type > li:nth-of-type(8)")
    public WebElement btn_help;

}
