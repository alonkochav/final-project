package utilities;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.io.IOException;


public class Listeners extends CommonOps implements ITestListener {

    public void onStart(ITestContext execution) {
        System.out.println("---------------------- Starting Execution ------------------");
    }

    public void onFinish(ITestContext execution) {
        System.out.println("---------------------- Ending Execution ------------------");
    }

    public void onTestSkipped(ITestResult test) {
        System.out.println("---------------------- Skipping Test "  + test.getName() + "  ------------------");
    }

    public void onTestStart(ITestResult test) {
        System.out.println("---------------------- Starting Test: " + test.getName() + "  ------------------");
    }

    public void onTestSuccess(ITestResult test) {
        System.out.println("---------------------- Test: " + test.getName() + " Passed ------------------");
    }

//    public void onTestFailure(ITestResult test) {
//        saveScreenshot();
//
//        File file =  saveScreenshot();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File file = ts.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file,new File ("./ScreenShot_Folder/Test1_Login.png"));
//
//    }
//    @Attachment(value = "Page Screen Shot" ,type = "image/png")
    public void onTestFailure(ITestResult result) {
        System.out.println("---------------------- Test "  + result.getName() + " Failed ------------------");
            saveScreenshot(driver);
//        Allure.addAttachment(result.getName(), new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File file = ts.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file, new File("./ScreenShot_Folder/TestFailure.png"));
    }

    @Attachment(value = "Page Screen Shot" ,type = "image/png")
    public byte[] saveScreenshot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

}
