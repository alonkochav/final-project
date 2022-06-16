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

    @Test
    public void test02_verifyDefaultUsers(){
        WebFlows.showUsers();
        Verifications.numberOfElements(grafanaServerAdminMain.rows,2);
    }

    @Test
    public void test03_verifyNewUser(){

        WebFlows.createNewUser("Digital", "digital@web.com", "digiweb", "12345678");
        WebFlows.showUsers();
        Verifications.numberOfElements(grafanaServerAdminMain.rows,2);
        WebFlows.createNewUser("Grafana", "grafana@boo.com", "grafana", "12345678");
        WebFlows.showUsers();
        Verifications.numberOfElements(grafanaServerAdminMain.rows,3);
    }

    @Test
    public void test04_verifyUserDeletion(){
        WebFlows.deleteLastUser();
        WebFlows.showUsers();
        Verifications.numberOfElements(grafanaServerAdminMain.rows,2);
    }

    @Test
    public void test05_verifyprogressSteps(){
            System.out.println(grafanaMain.list_progressSteps);
        Verifications.visibilityOfElements(grafanaMain.list_progressSteps);
    }
}
