package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

import org.apache.log4j.Logger;
import utilities.Log;

public class DesktopFlows extends CommonOps {

    public static void getCalcButtonObjects(int a) {
        switch (a) {
            case 0:
                UIActions.click(calcMain.get_btn_zero());
            break;
            case 1:
                UIActions.click(calcMain.get_btn_one());
            break;
            case 2:
                UIActions.click(calcMain.get_btn_two());
                break;
            case 3:
                UIActions.click(calcMain.get_btn_three());

                break;
            case 4:
                UIActions.click(calcMain.get_btn_four());
                break;
            case 5:
                UIActions.click(calcMain.get_btn_five());
                break;
            case 6:
                UIActions.click(calcMain.get_btn_six());
                break;
            case 7:
                UIActions.click(calcMain.get_btn_seven());
                break;
            case 8:
                UIActions.click(calcMain.get_btn_eight());
                break;
            case 9:
                UIActions.click(calcMain.get_btn_nine());
                break;

            // Default case
            default:
                Log.info("Not found");
        }
    }

    @Step("Calculate Addition: 1 + 8 ")
    public static void calculateAddition(int a, int b) {
        UIActions.click(calcMain.get_btn_clear());
        getCalcButtonObjects(a);
        UIActions.click(calcMain.get_btn_plus());
        getCalcButtonObjects(b);
        UIActions.click(calcMain.get_btn_equals());

        Log.info(calcMain.get_field_result().getText());

    }


}
