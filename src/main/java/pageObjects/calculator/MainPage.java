package pageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

        @FindBy(how = How.CLASS_NAME, using = "One")
        public WebElement btn_one;

        @FindBy(how = How.CLASS_NAME, using = "Eight")
        public WebElement btn_eight;

        @FindBy(how = How.CLASS_NAME, using = "Plus")
        public WebElement btn_plus;

        @FindBy(how = How.CLASS_NAME, using = "Equals")
        public WebElement btn_equals;

        @FindBy(how = How.CLASS_NAME, using = "//*[@AutonmationID = 'CalculatorResults']")
        public WebElement field_result;

}
