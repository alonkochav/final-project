package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.APIFlows;

//    @Listeners(utilities.Listeners.class)
public class TestGrafanaAPI extends CommonOps {

    @Test (description = "Test 01 - Get Team From Grafana")
    @Description("This Test verifies the properties of the team")
    public void test01_verifyTeam() {
        Verifications.verifyText(APIFlows.getTeamProperty("teams[1].name"), "MyTeam");
//        Verifications.verifyText(APIFlows.getTeamProperty("teams[1].name"), "Alon");   // FAIL
    }

}
