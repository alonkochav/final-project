package extensions;

import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Verifications extends CommonOps {

    @Step ("Verify text in elements")
    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step ("Verify number of elements")
    public static void numberOfElements(List<WebElement> elems, int expected){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(),expected);
    }

    @Step("Verify visibility of elements using softAssertion")
    public static void visibilityOfElements(List<WebElement> elems){
        int index = 0;
        for (WebElement elem:elems) {
            wait.until(ExpectedConditions.visibilityOfAllElements(elems));
            softAssert.assertTrue(elem.isDisplayed(),"Sorry, the element "+ elem.getText() + "is not displayed." );
        }
        softAssert.assertAll("Some elements were not displayed");
    }
}
