package pageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.NAME, using = "Clear")
    private WebElement btn_clear;

    public WebElement get_btn_clear() {
        return btn_clear;
    }

    @FindBy(how = How.NAME, using = "Zero")
    private WebElement btn_zero;

    public WebElement get_btn_zero() {
        return btn_zero;
    }

    @FindBy(how = How.NAME, using = "One")
    private WebElement btn_one;

    public WebElement get_btn_one() {
        return btn_one;
    }

    @FindBy(how = How.NAME, using = "Two")
    private WebElement btn_two;

    public WebElement get_btn_two() {
        return btn_two;
    }

    @FindBy(how = How.NAME, using = "Three")
    private WebElement btn_three;

    public WebElement get_btn_three() {
        return btn_three;
    }

    @FindBy(how = How.NAME, using = "Four")
    private WebElement btn_four;

    public WebElement get_btn_four() {
        return btn_four;
    }

    @FindBy(how = How.NAME, using = "Five")
    private WebElement btn_five;

    public WebElement get_btn_five() {
        return btn_five;
    }

    @FindBy(how = How.NAME, using = "Six")
    private WebElement btn_six;

    public WebElement get_btn_six() {
        return btn_six;
    }

    @FindBy(how = How.NAME, using = "Seven")
    private WebElement btn_seven;

    public WebElement get_btn_seven() {
        return btn_seven;
    }

    @FindBy(how = How.NAME, using = "Eight")
    private WebElement btn_eight;

    public WebElement get_btn_eight() {
        return btn_eight;
    }

    @FindBy(how = How.NAME, using = "Nine")
    private WebElement btn_nine;

    public WebElement get_btn_nine() {
        return btn_nine;
    }

    @FindBy(how = How.NAME, using = "Decimal Separator")
    private WebElement btn_point;

    public WebElement get_btn_point() {
        return btn_point;
    }


    @FindBy(how = How.NAME, using = "Positive Negative")
    private WebElement btn_polarity;

    public WebElement get_btn_polarity() {
        return btn_polarity;
    }

    // operations

    @FindBy(how = How.NAME, using = "Equals")
    private WebElement btn_equals;

    public WebElement get_btn_equals() {
        return btn_equals;
    }

    @FindBy(how = How.NAME, using = "Plus")
    private WebElement btn_plus;

    public WebElement get_btn_plus() {
        return btn_plus;
    }

    @FindBy(how = How.NAME, using = "Minus")
    private WebElement btn_minus;

    public WebElement get_btn_minus() {
        return btn_minus;
    }

    @FindBy(how = How.NAME, using = "Multiply by")
    private WebElement btn_multiply;

    public WebElement get_btn_multiply() {
        return btn_multiply;
    }

    @FindBy(how = How.NAME, using = "Divide by")
    private WebElement btn_divide;

    public WebElement get_btn_divide() {
        return btn_divide;
    }

    @FindBy(how = How.NAME, using = "Square")
    private WebElement btn_square;

    public WebElement get_btn_square() {
        return btn_square;
    }

    @FindBy(how = How.NAME, using = "Square Root")
    private WebElement btn_sqrt;

    public WebElement get_btn_sqrt() {
        return btn_sqrt;
    }

    @FindBy(how = How.NAME, using = "Percent")
    private WebElement btn_percent;

    public WebElement get_btn_percent() {
        return btn_percent;
    }

    @FindBy(how = How.XPATH, using = "//*[@AutomationId= 'CalculatorResults']")
    private WebElement field_result;

    public WebElement get_field_result() {
        return field_result;
    }

    // operations

    @FindBy(how = How.NAME, using = "Backspace")
    private WebElement btn_bkspc;

    public WebElement get_btn_bkspc() {
        return btn_bkspc;
    }


}
