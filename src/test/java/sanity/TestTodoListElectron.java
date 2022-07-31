package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ElectronFlows;

import java.util.concurrent.TimeUnit;

import static workflows.ElectronFlows.getTaskCount;

@Listeners(utilities.Listeners.class)
public class TestTodoListElectron extends CommonOps {

    @Test(description = "Test 01 - Add and Verify New Task")
    @Description("This Test Adds a New Tasks and Verifies it in the List of Tasks")
    public void test01_addAndVerifyNewTask(){
        ElectronFlows.addNewTask("Learn Java");
        Verifications.numberOfElements(todoMain.list_tasks,1);
        Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
    }

    @Test(description = "Test 02 - Add and Verify New Tasks")
    @Description("This Test Adds New Tasks and Verifies them in the List of Tasks")
    public void test01_addAndVerifyNewTasks(){
        ElectronFlows.addNewTask("Learn Java");
        ElectronFlows.addNewTask("Learn C#");
        ElectronFlows.addNewTask("Learn Python");
        Verifications.numberOfElements(todoMain.list_tasks,3);
    }

}
