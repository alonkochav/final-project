package utilities;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;


public class Listeners extends CommonOps implements ITestListener {

    public void onStart (ITestContext execution) {
        System.out.println("---------------------- Starting Execution ------------------");
    }

    public void onFinish (ITestContext execution) {
        System.out.println("---------------------- Ending Execution ------------------");
    }

    public void onTestSkipped (ITestResult test) {
        System.out.println("---------------------- Skipping Test "  + test.getName() + "  ------------------");
    }

    public void onTestStart (ITestResult test) {
        System.out.println("---------------------- Starting Test: " + test.getName() + "  ------------------");
    }

    public void onTestSuccess (ITestResult test) {
        System.out.println("---------------------- Test: " + test.getName() + " Passed ------------------");

        // Stop recording
        try {
            MonteScreenRecorder.stopRecord();
        } catch (Exception e){
            e.printStackTrace();
        }

        // Delete recorded file

        File file = new File("./test-recordings/" + test.getName() + ".avi");
        if (file.delete())
            System.out.println("File was deleted successfully");
        else
            System.out.println("Failed to delete the file");
    }

    public void onTestFailure (ITestResult test) {
        System.out.println("---------------------- Test "  + test.getName() + " Failed ------------------");
        try {
            MonteScreenRecorder.stopRecord();
        } catch (Exception e){
            e.printStackTrace();
        }
        saveScreenshot(driver);
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
    }
    @Attachment(value = "Page Screen Shot" ,type = "image/png")
    public byte[] saveScreenshot (WebDriver driver) {
//        Allure.addAttachment(test.getName(), new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File file = ts.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file, new File("./ScreenShot_Folder/TestFailure.png"));
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

}
