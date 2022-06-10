package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

public class UIActions extends CommonOps {

    // Step("click")
    public static void click(WebElement elem){
        // some wait
        elem.click();
    }

    public static void updateText(WebElement elem, String text){
        // some wait
        elem.sendKeys(text);
    }

    public static void updateDropDown(WebElement elem, String text){
        // some wait
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }
}
