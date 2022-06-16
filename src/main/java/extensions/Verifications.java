package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Verifications extends CommonOps {
    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    public static void numberOfElements(List<WebElement> elems, int expected){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(),expected);
    }

    public static void visibilityOfElements(List<WebElement> elems){
        for (WebElement elem:elems) {
            System.out.println(elem);
            softAssert.assertTrue(elem.isDisplayed(),"Sorry, the element "+ elem.getText() + "is not displayed." );
        }
        softAssert.assertAll("Some elements were not displayed");
    }


}
