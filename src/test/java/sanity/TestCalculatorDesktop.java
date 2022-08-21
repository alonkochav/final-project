package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlows;

import java.util.concurrent.TimeUnit;


@Listeners(utilities.Listeners.class)
public class TestCalculatorDesktop extends CommonOps {

    @Test(description = "Test 01 - Verify Addition Command")
    @Description("This Test Verifies the Addition Command")
    public void test01_verifyAdditionCommand(){
        DesktopFlows.calculateAddition(1,8);
        Verifications.verifyTextInElement(calcMain.field_result,"Display is 9");
        Uninterruptibles.sleepUninterruptibly(12, TimeUnit.SECONDS);
    }
}
