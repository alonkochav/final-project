package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//*[@class='panel-content panel-content--no-padding']//div//h1")
    public WebElement head_Dashboard;
}
