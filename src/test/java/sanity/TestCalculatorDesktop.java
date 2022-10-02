package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlows;

import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;


@Listeners(utilities.Listeners.class)
public class TestCalculatorDesktop extends CommonOps {

    @Test(description = "Test 01 - Verify Addition Operation"  )//, enabled=false)
    @Description("This Test Verifies the Addition Operation")
    public void test01_verifyAdditionCommand(){
        int a = 833;
        char o = '+';
        int b = 12;
        int res = a + b;
        String exp = NumberFormat.getIntegerInstance().format(res);

        DesktopFlows.calculateAny(a, o, b);
        Verifications.verifyTextInElement(calcMain.getFieldResult(),"Display is "+ exp );
    }

    @Test(description = "Test 02 - Verify Subtraction Operation"  )//, enabled=false)
    @Description("This Test Verifies the Subtraction Operation")
    public void test02_verifySubtractionOperation(){
        int a = 8133;
        char o = '-';
        int b = 123;
        int res = a - b;
        String exp = NumberFormat.getIntegerInstance().format(res);
        DesktopFlows.calculateSubtraction(a,b);
        Verifications.verifyTextInElement(calcMain.getFieldResult(),"Display is "+ exp );
    }

    @Test(description = "Test 03 - Verify Multiplication Operation" )//, enabled=false)
    @Description("This Test Verifies the Multiplication Operation")
    public void test03_verifyMultiplicationOperation(){
        int a = 83;
        char o = '*';
        int b = 13;
        int res = a * b;
        String exp = NumberFormat.getIntegerInstance().format(res);
        DesktopFlows.calculateMultiplication(a,b);
        Verifications.verifyTextInElement(calcMain.getFieldResult(),"Display is "+ exp );
    }

    @Test(description = "Test 04 - Verify Division Operation"  )//, enabled=false)
    @Description("This Test Verifies the Division Operation")
    public void test04_verifyDivisionOperation(){
        int a = 144;
        char o = '/';
        int b = 12;
        int res = a / b;
        String exp = NumberFormat.getIntegerInstance().format(res);
        DesktopFlows.calculateDivision(a,b);
        Verifications.verifyTextInElement(calcMain.getFieldResult(),"Display is "+ exp );
    }
}
