package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.util.Date;


public class Listeners extends CommonOps implements ITestListener {



    public void onStart (ITestContext execution) {
        Log.info("\n================================================================================================================");
        Log.info(" :------------------- Starting Execution ------------------");
    }

    public void onFinish (ITestContext execution) {
        Log.info(" :---------------------- Ending Execution ------------------");
        Log.info("================================================================================================================\n");
    }

    public void onTestSkipped (ITestResult test) {
        Log.info(" :---------------------- Skipping Test " + test.getName() + " -----------------" );

    }

    public void onTestStart (ITestResult test) {
        Log.info(" ---------------------- Starting Test: " + test.getName() + "  ------------------");
    }

    public void onTestSuccess (ITestResult test) {
        Log.info(" ----------  SUCCESS! ----------- Test: " + test.getName() + " Passed ------------------");
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
                Log.info("File was deleted successfully");
            else
                Log.info("Failed to delete the file");
//            }
//            else {
////                ((CanRecordScreen) mobileDriver).stopRecordingScreen();
//            }
        }
    }

    public void onTestFailure (ITestResult test) {
        Log.info("---------------------- Test "  + test.getName() + " Failed ------------------");
        if (!isAPI()) {
            if (isWeb() || isElectron()) {
                try {
                    MonteScreenRecorder.stopRecord();
                } catch (Exception e) {
                    Log.info("Error recording video of screen :" + e);
                    e.printStackTrace();
                }
            }
            saveScreenshot();
            Log.info(new Date(test.getStartMillis()) + test.getName() + "SCREENSHOT TAKEN : ");
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
            Log.info("ScreenShot taken!");
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

    }

}
