package pageObjects.todo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.CSS, using = "input[placeholder='Create a task']")
    private WebElement txt_create;

    @FindBy(how = How.CSS, using = "svg.destroy_19w1q")
    private WebElement btn_delete;

    @FindBy(how = How.CLASS_NAME, using = "view_2Ow90")
    private List<WebElement> list_tasks;

    public WebElement getTxt_create() {
        return txt_create;
    }

    public WebElement getBtn_delete() {
        return btn_delete;
    }

    public List<WebElement> getList_tasks() {
        return list_tasks;
    }

}
