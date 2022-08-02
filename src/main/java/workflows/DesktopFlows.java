package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.List;

public class DesktopFlows extends CommonOps {

    public static void getCalcButtonObjects(int a) {
        switch (a) {
            case 0:
                UIActions.click(calcMain.btn_zero);
                break;
            case 1:
                UIActions.click(calcMain.btn_one);
                break;
            case 2:
                UIActions.click(calcMain.btn_two);
                break;
            case 3:
                UIActions.click(calcMain.btn_three);
                break;
            case 4:
                UIActions.click(calcMain.btn_four);
                break;
            case 5:
                UIActions.click(calcMain.btn_five);
                break;
            case 6:
                UIActions.click(calcMain.btn_six);
                break;
            case 7:
                UIActions.click(calcMain.btn_seven);
                break;
            case 8:
                UIActions.click(calcMain.btn_eight);
                break;
            case 9:
                UIActions.click(calcMain.btn_nine);
                break;

            // Default case
            default:
                System.out.println("Not found");
        }
    }

    @Step("Calculate Addition: 1 + 8 ")
    public static void calculateAddition(int a, int b) {
        UIActions.click(calcMain.btn_clear);
        getCalcButtonObjects(a);
        UIActions.click(calcMain.btn_plus);
        getCalcButtonObjects(b);
        UIActions.click(calcMain.btn_equals);
        System.out.println(calcMain.field_result.getText());

    }

    public static void printReport(){

    }
}
