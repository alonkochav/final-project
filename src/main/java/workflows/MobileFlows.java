package workflows;

import extensions.MobileActions;
import io.qameta.allure.Step;

public class MobileFlows extends utilities.CommonOps {

    @Step("Business Flow : Fill Form And Calculate Mortgage")
    public static void calculateMortgage(String amount, String term, String rate){
        MobileActions.updateText(mortgageMain.getTxt_amount(), amount);
        MobileActions.updateText(mortgageMain.getTxt_term(), term);
        MobileActions.updateText(mortgageMain.getTxt_rate(), rate);
        MobileActions.tap(mortgageMain.getBtn_calculate());
        MobileActions.tap(mortgageMain.getTxt_repayment());

    }


}
