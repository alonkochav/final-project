package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

public class UIActions extends CommonOps {

    // Step("click")
    public static void click(WebElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    // Step("update text")
    public static void updateText(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    // Step("update dropdown")
    public static void updateDropDown(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }

    // Step("mouse hover")
    public static void mouseHover(WebElement elem1, WebElement elem2){
        action.moveToElement(elem1);
        wait.until(ExpectedConditions.visibilityOf(elem2));
        wait.until(ExpectedConditions.elementToBeClickable(elem2));
        action.moveToElement(elem2).click().build().perform();
    }
}
