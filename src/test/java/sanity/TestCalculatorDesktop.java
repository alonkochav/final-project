package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Log;
import workflows.DesktopFlows;

import java.text.DecimalFormat;

@Listeners(utilities.Listeners.class)
public class TestCalculatorDesktop extends CommonOps {

    @Test(description = "Test 01 - Verify Addition Operation")
    @Description("This Test Verifies the Addition Operation")
    public void test01_verifyAdditionOperation() {
        try {
            double a = 200.12345;
            double b =  93;
            double res = a + b;
            String exp = new DecimalFormat("#,###.##########").format(res);
            DesktopFlows.calculateAddition(a, b);
            Log.info("Result = " + exp );
            Verifications.verifyTextInElement(calcMain.getFieldResult(), "Display is " + exp);
        }
        catch(Exception e) {
            Log.info("There was a problem with the input expression");
        }
    }

    @Test(description = "Test 02 - Verify Subtraction Operation")
    @Description("This Test Verifies the Subtraction Operation")
    public void test02_verifySubtractionOperation() {
        double a = 9;
        double b = -5;
        double res = a - b;
        String exp = new DecimalFormat("#,###.##########").format(res);
        DesktopFlows.calculateSubtraction(a,b);
        Log.info("Result = " + res);
        Verifications.verifyTextInElement(calcMain.getFieldResult(), "Display is " + exp);
    }

    @Test(description = "Test 03 - Verify Multiplication Operation")
    @Description("This Test Verifies the Multiplication Operation")
    public void test03_verifyMultiplicationOperation() {
        double a = 2498;
        double b = 2;
        double res = a * b;
        String exp = new DecimalFormat("#,###.##########").format(res);
        DesktopFlows.calculateMultiplication(a,b);
        Log.info("Result = " + res);
        Verifications.verifyTextInElement(calcMain.getFieldResult(), "Display is " + exp);
    }

    @Test(description = "Test 04 - Verify Division Operation")
    @Description("This Test Verifies the Division Operation")
    public void test04_verifyDivisionOperation(){
        try {
            double a = 144;
            double b = 15;
            double res = a / b;
            String exp = new DecimalFormat("#,###.##############").format(res);
            DesktopFlows.calculateDivision(a, b);
            Log.info("Result = " + res);
            Verifications.verifyTextInElement(calcMain.getFieldResult(),"Display is "+ exp );
        }
        catch(ArithmeticException ex) {
            Log.info("Can't divide a number by 0. See details :"+ex.getMessage());
        }
    }
}
