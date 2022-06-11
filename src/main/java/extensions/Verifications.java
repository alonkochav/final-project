package extensions;

import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;

public class Verifications {
    public static void verifyTextInElement(WebElement elem, String expected){
        assertEquals(elem.getText(), expected);
    }
}
