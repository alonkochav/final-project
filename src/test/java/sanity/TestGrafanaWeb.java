package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import extensions.Verifications;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

import java.util.concurrent.TimeUnit;

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
        WebFlows.createNewUser("Alon Kochav", "alonkochav@gmail.com", "alonkochav", "admin");
        WebFlows.showUsers();
        Verifications.numberOfElements(grafanaServerAdminMain.rows,2);
    }

    @Test
    public void test04_verifyUserDeletion(){
        WebFlows.showUsers();
        WebFlows.deleteLastUser();
        Verifications.verifyUserDeletion(grafanaServerAdminMain.rows,1);
    }
}
