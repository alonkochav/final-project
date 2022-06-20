package sanity;

import extensions.Verifications;
import org.openqa.selenium.WebElement;
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
        Verifications.numberOfElements(grafanaServerAdminMain.rows,1);
    }

    @Test
    public void test03_verifyNewUser(){
        WebFlows.showUsers();
        WebFlows.createNewUser("Digital", "digital@web.com", "digiweb", "12345678");
        Verifications.numberOfElements(grafanaServerAdminMain.rows,2);
    }

    @Test
    public void test04_verifyUserDeletion(){
        WebFlows.showUsers();
        WebFlows.deleteLastUser();
        WebFlows.showUsers();
        Verifications.numberOfElements(grafanaServerAdminMain.rows,1);
    }

    @Test
    public void test05_verifyProgressSteps(){
        Verifications.verifyTextInElement( grafanaMain.head_progressSteps,"Basic\n" +
                "The steps below will guide you to quickly finish setting up your Grafana installation.");
        for (int i = 0 ; i < grafanaMain.list_progressSteps.size(); i++){
        }
        Verifications.visibilityOfElements(grafanaMain.list_progressSteps);
    }
}
