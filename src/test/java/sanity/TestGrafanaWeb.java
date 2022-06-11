package sanity;

import extensions.Verifications;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

    public class TestGrafanaWeb extends CommonOps {

    @Test
    public void test01_verifyHeader(){
        WebFlows.login("admin", "admin");
        Verifications.verifyTextInElement(grafanaMain.head_Dashboard,"Welcome to Grafana");
    }
}
