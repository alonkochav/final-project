package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//*[@id='1']//section//div[2]//h1")
    public WebElement head_Dashboard;

    @FindBy(how = How.CSS, using = "#id section div.panel-content:nth-child(2) > div")
    public List<WebElement>  list_progressSteps;
//
//    @FindBy(how = How.XPATH, using = "//*[@id='2']//section//*")
//    public List<WebElement> list_progressSteps;

}
