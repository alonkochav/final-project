package pageObjects.mortgage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainPage {

    public AndroidDriver mobileDriver;

    public MainPage(AndroidDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(5)), this);
    }

    @AndroidFindBy(id = "etAmount")
    private AndroidElement txt_amount;

    @AndroidFindBy(id = "etTerm")
    private AndroidElement txt_term;

    @AndroidFindBy(id = "etRate")
    private AndroidElement txt_rate;

    @AndroidFindBy(id = "btnCalculate")
    private AndroidElement btn_calculate;

    @AndroidFindBy(id = "tvRepayment")
    private AndroidElement txt_repayment;

    public AndroidElement getTxt_amount() {
        return txt_amount;
    }

    public AndroidElement getTxt_term() {
        return txt_term;
    }

    public AndroidElement getTxt_rate() {
        return txt_rate;
    }

    public AndroidElement getBtn_calculate() {
        return btn_calculate;
    }

    public AndroidElement getTxt_repayment() {
        return txt_repayment;
    }

}
