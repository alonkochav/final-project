package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.util.Date;
import java.util.logging.Logger;


public class Listeners extends CommonOps implements ITestListener {


    public void onStart (ITestContext execution) {
        Logger.getLogger(execution.getStartDate() +" :------------------- Starting Execution ------------------");
    }

    public void onFinish (ITestContext execution) {
        Logger.getLogger(" :---------------------- Ending Execution ------------------");
        Logger.getLogger("finished : " + execution.getEndDate());
    }

    public void onTestSkipped (ITestResult test) {
        Logger.getLogger(" :---------------------- Skipping Test " + test.getName() + " -----------------" );

    }

    public void onTestStart (ITestResult test) {
        Logger.getLogger(" ---------------------- Starting Test: " + test.getName() + "  ------------------");
    }

    public void onTestSuccess (ITestResult test) {
        Logger.getLogger(" ----------  SUCCESS! ----------- Test: " + test.getName() + " Passed ------------------");
        if (!isAPI() && !isMobile()) {
//            if (isWeb() || isElectron()) {
            //   Stop Recording
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Delete recorded file
            File file = new File("./test-recordings/" + test.getName() + ".avi");
            if (file.delete())
                Logger.getLogger("File was deleted successfully");
            else
                Logger.getLogger("Failed to delete the file");
//            }
//            else {
////                ((CanRecordScreen) mobileDriver).stopRecordingScreen();
//            }
        }
    }

    public void onTestFailure (ITestResult test) {
        Logger.getLogger("---------------------- Test "  + test.getName() + " Failed ------------------");
        if (!isAPI()) {
            if (isWeb() || isElectron()) {
                try {
                    MonteScreenRecorder.stopRecord();
                } catch (Exception e) {
                    Logger.getLogger("Error recording video of screen :" + e);
                    e.printStackTrace();
                }
            }
            saveScreenshot();
            Logger.getLogger(new Date(test.getStartMillis()) + test.getName() + "SCREENSHOT TAKEN : ");
        }

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
    }

    @Attachment(value = "Page Screen Shot" ,type = "image/png")
    public byte[] saveScreenshot () {
//        Allure.addAttachment(test.getName(), new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File file = ts.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file, new File("./ScreenShot_Folder/TestFailure.png"));

        if (isMobile())
            return ((TakesScreenshot)mobileDriver).getScreenshotAs(OutputType.BYTES);
        else
            Logger.getLogger("ScreenShot taken!");
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

    }

}
