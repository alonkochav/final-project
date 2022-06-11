package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    @FindBy(how = How.XPATH, using = "//*[@id='1']/section/div/div/h1")
    public WebElement head_Dashboard;
}
