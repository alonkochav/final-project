package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilities.CommonOps;

public class ElectronFlows extends CommonOps {

    @Step("Add New Task to the List")
    public static void addNewTask(String taskName){
        UIActions.updateTextHuman(todoMain.getTxt_create(), taskName);
        UIActions.submitKey(todoMain.getTxt_create(), Keys.RETURN);
    }

    @Step("Count and Return Number Of Counts")
    public static int getTaskCount(){
        return todoMain.getList_tasks().size();
    }

    @Step("Empty Task List")
    public static void emptyList(){
        for (int i=0; i < getTaskCount(); i++){
            UIActions.mouseHover(todoMain.getBtn_delete());
        }
    }

}
