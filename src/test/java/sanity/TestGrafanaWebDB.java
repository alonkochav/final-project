package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class TestGrafanaWebDB extends CommonOps {
    @Test(description = "Test 01 - Login to Grafana with DB credentials - and Verify Header")
    @Description("This Test logs in with DB credentials and verifies the main header")
    public void test01_loginDBAndVerifyHeader(){
        WebFlows.loginDB();
        Verifications.verifyTextInElement(grafanaMain.head_Dashboard,"Alon ");      // FAIL TEST
//        Verifications.verifyTextInElement(grafanaMain.head_Dashboard,"Welcome to Grafana");
    }

    @Test (description = "Test 02 - Verify Default Users")
    @Description ("This Test verifies the default users")
    public void test02_verifyDefaultUsers(){
        WebFlows.showUsers();
//        Verifications.numberOfElements(grafanaServerAdminMain.rows,99);      // FAIL TEST
        Verifications.numberOfElements(grafanaServerAdminMain.rows,1);
    }
}
