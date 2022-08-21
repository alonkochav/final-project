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
        System.out.println(execution.getStartDate() +" :------------------- Starting Execution ------------------");
    }

    public void onFinish (ITestContext execution) {
        System.out.println(" :---------------------- Ending Execution ------------------");
        System.out.println("finished : " + execution.getEndDate());
    }

    public void onTestSkipped (ITestResult test) {
        System.out.println(" :---------------------- Skipping Test " + test.getName() + " -----------------" );

    }

    public void onTestStart (ITestResult test) {
        System.out.println(" ---------------------- Starting Test: " + test.getName() + "  ------------------");
    }

    public void onTestSuccess (ITestResult test) {
        System.out.println(" ----------  SUCCESS! ----------- Test: " + test.getName() + " Passed ------------------");
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
                    System.out.println("File was deleted successfully");
                else
                    System.out.println("Failed to delete the file");
//            }
//            else {
////                ((CanRecordScreen) mobileDriver).stopRecordingScreen();
//            }
        }
    }

    public void onTestFailure (ITestResult test) {
        System.out.println("---------------------- Test "  + test.getName() + " Failed ------------------");
        if (!isAPI()) {
            if (isWeb() || isElectron()) {
                try {
                    MonteScreenRecorder.stopRecord();
                } catch (Exception e) {
                    System.out.println("Error recording video of screen :" + e);
                    e.printStackTrace();
                }
            }
            saveScreenshot();
            System.out.println(new Date(test.getStartMillis()) + test.getName() + "SCREENSHOT TAKEN : ");
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
            System.out.println("ScreenShot taken!");
            return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

    }

}
