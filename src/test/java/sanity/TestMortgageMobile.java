package sanity;

import extensions.Verifications;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.MobileFlows;


@Listeners(utilities.Listeners.class)
public class TestMortgageMobile extends CommonOps {

    protected AndroidDriver mobileDriver = null;
    private final DesiredCapabilities dc = new DesiredCapabilities();

    @Test
    public void test01_verifyMortgage() {
        MobileFlows.calculateMortgage("1000", "3", "4");
        Verifications.verifyTextInMobileElement(mortgageMain.txt_repayment,"£30.03");
    }
}
