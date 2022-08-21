    package extensions;

    import com.google.common.util.concurrent.Uninterruptibles;
    import io.qameta.allure.Step;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.Select;
    import utilities.CommonOps;

    import java.util.concurrent.TimeUnit;
    
    public class UIActions extends CommonOps {
    
        @Step("Click on Element")
        public static void click(WebElement elem) {
            wait.until(ExpectedConditions.elementToBeClickable(elem));
            elem.click();
        }
    
        @Step("Update Text Element")
        public static void updateText(WebElement elem, String text) {
            wait.until(ExpectedConditions.visibilityOf(elem));
            elem.sendKeys(text);
        }
        
        @SuppressWarnings("deprecated")
        @Step("Update Text Element as Human")
        public static void updateTextHuman(WebElement elem, String text) {
            wait.until(ExpectedConditions.visibilityOf(elem));
            for (char ch : text.toCharArray()){
                Uninterruptibles.sleepUninterruptibly(Long.parseLong(getData("KeyStrokeDelay")), TimeUnit.MILLISECONDS);
                elem.sendKeys(ch+ "");
            }
        }

        @Step("Update Text Element")
        public static void submitKey(WebElement elem, Keys value) {
            elem.sendKeys(value);
        }
    
        @Step("Update Dropdown Element")
        public static void updateDropDown(WebElement elem, String text) {
            wait.until(ExpectedConditions.visibilityOf(elem));
            Select dropDown = new Select(elem);
            dropDown.selectByVisibleText(text);
        }

        @Step("OVERLOAD #1 Double Mouse Hover - 2 Elements  In case of nested subMenu")
        public static void mouseHover(WebElement elem1, WebElement elem2) {
            action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
        }

        @Step("OVERLOAD #2  Single Mouse Hover -  In case of Electron ToDoList")
        public static void mouseHover(WebElement elem1) {
            action.moveToElement(elem1).click().build().perform();
        }
    }
