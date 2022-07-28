package extensions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.*;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    // Mobile
    @Step ("Verify Text in Elements")
    public static void verifyTextInMobileElement(AndroidElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    // Web   &&   Mobile
    @Step ("Verify Text in Elements")
    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step ("Verify Number of Elements")
    public static void numberOfElements(List<WebElement> elems, int expected){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(),expected);
    }

    @Step("Verify Visibility of Elements (softAssertion)")
    public static void visibilityOfElements(List<WebElement> elems){
        for (WebElement elem:elems) {
            wait.until(ExpectedConditions.visibilityOfAllElements(elems));
            softAssert.assertTrue(elem.isDisplayed(),"Sorry, the element "+ elem.getText() + "is not displayed." );
        }
        System.out.println("Some elements were not displayed");
        softAssert.assertAll();
    }

    @Step("Verify Element Visually")
    public static void  visualElement(String expectedImageName){
        try{
            wait.until(ExpectedConditions.visibilityOf(grafanaLeftMenu.btn_home));
            screen.find(getData("ImageRepo")+expectedImageName+".png");
        } catch (FindFailed findFailed){
            System.out.println("Error comparing Image File " + findFailed);
            fail("Error comparing Image File " + findFailed);
        }
    }

    @Step("Verify Element Displayed in Search")
    public static void existenceOfElement(List<WebElement> elems) {
        assertTrue(elems.size() > 0);
    }

    @Step("Verify Element is Not Displayed in Search")
    public static void nonExistenceOfElement(List<WebElement> elems){
        assertFalse(elems.size() > 0);
    }

    // Rest API
    @Step("Verify Text with Text in Rest API")
    public static void verifyText(String actual, String expected){
        assertEquals(actual,expected);
    }
}
