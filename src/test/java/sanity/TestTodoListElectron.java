package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ElectronFlows;

import java.util.concurrent.TimeUnit;

public class TestTodoListElectron extends CommonOps {

    @Test(description = "Test 01 - Add and Verify New Task")
    @Description("This Test Adds a New Tasks and Verifies it in the List of Tasks")
    public void test01_addAndVerifyNewTask(){
        ElectronFlows.addNewTask("Learn Java");
        Verifications.verifyCount(ElectronFlows.getTaskCount(),1);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

}
