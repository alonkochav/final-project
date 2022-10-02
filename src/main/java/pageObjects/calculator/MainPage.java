package pageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    // modification buttons

    @FindBy(how = How.NAME, using = "Clear")
    private WebElement btn_clear;

    @FindBy(how = How.NAME, using = "Backspace")
    private WebElement btn_bkspc;

    // decimal numbers

    @FindBy(how = How.NAME, using = "Zero")
    private WebElement btn_zero;

    @FindBy(how = How.NAME, using = "One")
    private WebElement btn_one;

    @FindBy(how = How.NAME, using = "Two")
    private WebElement btn_two;

    @FindBy(how = How.NAME, using = "Three")
    private WebElement btn_three;

    @FindBy(how = How.NAME, using = "Four")
    private WebElement btn_four;

    @FindBy(how = How.NAME, using = "Five")
    private WebElement btn_five;

    @FindBy(how = How.NAME, using = "Six")
    private WebElement btn_six;

    @FindBy(how = How.NAME, using = "Seven")
    private WebElement btn_seven;

    @FindBy(how = How.NAME, using = "Eight")
    private WebElement btn_eight;

    @FindBy(how = How.NAME, using = "Nine")
    private WebElement btn_nine;

    // floating point & polarity

    @FindBy(how = How.NAME, using = "Decimal Separator")
    private WebElement btn_point;

    @FindBy(how = How.NAME, using = "Positive Negative")
    private WebElement btn_polarity;

    // operations

    @FindBy(how = How.NAME, using = "Equals")
    private WebElement btn_equals;

    @FindBy(how = How.NAME, using = "Plus")
    private WebElement btn_plus;

    @FindBy(how = How.NAME, using = "Minus")
    private WebElement btn_minus;

    @FindBy(how = How.NAME, using = "Multiply by")
    private WebElement btn_multiply;

    @FindBy(how = How.NAME, using = "Divide by")
    private WebElement btn_divide;

    @FindBy(how = How.NAME, using = "Square")
    private WebElement btn_square;

    @FindBy(how = How.NAME, using = "Square Root")
    private WebElement btn_sqrt;

    @FindBy(how = How.NAME, using = "Percent")
    private WebElement btn_percent;

    // text output result

    @FindBy(how = How.XPATH, using = "//*[@AutomationId= 'CalculatorResults']")
    private WebElement field_result;

    // settings menu
    @FindBy(how = How.XPATH, using = "//*[@AutomationId= 'TogglePaneButton']")
    private WebElement btn_menu;

    // menu - mode
    @FindBy(how = How.XPATH, using = "//*[@AutomationId= 'Standard']")
    private WebElement btn_standard;

    // menu - mode
    @FindBy(how = How.XPATH, using = "//*[@AutomationId= 'Scientific']")
    private WebElement btn_scientific;

    // ACCESSORS modification buttons

    public WebElement getBtnClear() {
        return btn_clear;
    }

    public WebElement getBtnBkspc() {
        return btn_bkspc;
    }

    // ACCESSORS decimal number buttons

    public WebElement getBtnZero() {
        return btn_zero;
    }

    public WebElement getBtnOne() {
        return btn_one;
    }

    public WebElement getBtnTwo() {
        return btn_two;
    }

    public WebElement getBtnThree() {
        return btn_three;
    }

    public WebElement getBtnFour() {
        return btn_four;
    }

    public WebElement getBtnFive() {
        return btn_five;
    }

    public WebElement getBtnSix() {
        return btn_six;
    }

    public WebElement getBtnSeven() {
        return btn_seven;
    }

    public WebElement getBtnEight() {
        return btn_eight;
    }

    public WebElement getBtnNine() {
        return btn_nine;
    }

    // ACCESSORS floating point & polarity

    public WebElement getBtnPoint() {
        return btn_point;
    }

    public WebElement getBtnPolarity() {
        return btn_polarity;
    }

    // ACCESSORS operations

    public WebElement getBtnEquals() {
        return btn_equals;
    }

    public WebElement getBtnPlus() {
        return btn_plus;
    }

    public WebElement getBtnMinus() {
        return btn_minus;
    }

    public WebElement getBtnMultiply() {
        return btn_multiply;
    }

    public WebElement getBtnDivide() {
        return btn_divide;
    }

    public WebElement getBtnSquare() {
        return btn_square;
    }

    public WebElement getBtnSqrt() {
        return btn_sqrt;
    }

    public WebElement getBtnPercent() {
        return btn_percent;
    }

    // ACCESSORS output result

    public WebElement getFieldResult() {
        return field_result;
    }

}
