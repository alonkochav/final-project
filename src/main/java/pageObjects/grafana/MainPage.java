package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {


    @FindBy(how = How.CSS, using = "section div:nth-of-type(2) h1")
    private WebElement head_Dashboard;

    @FindBy(how = How.CSS, using = "div.panel-content div:nth-child(2) > div:first-of-type > div")
    private WebElement head_progressSteps;

    @FindBy(how = How.CSS, using = ".panel-container div.panel-content div:nth-child(2) > div > div + div > a, a + div, a + div + div")
    private List<WebElement> list_progressSteps;

    public WebElement getHead_Dashboard() {
        return head_Dashboard;
    }

    public WebElement getHead_progressSteps() {
        return head_progressSteps;
    }

    public List<WebElement> getList_progressSteps() {
        return list_progressSteps;
    }

}
