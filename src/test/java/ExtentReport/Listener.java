package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Listener implements ITestListener {




    ExtentTest logger;

    private static ExtentReports extent= new ExtentReports();
    private static ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL, "Test Case " + result.getMethod().getMethodName() + " Has failed");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS, "Test Case " + result.getMethod().getMethodName() + " Has Passed");
    }

//    @Override
//    public void onFinish(ITestContext result) {
//        extent.flush();
//    }

    public void onStart(ITestContext result){
        extent=ExtentReportReportManager.extentSetup();
    }

    @AfterMethod
    public void tearDown(ITestResult result)
    {
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = System.getProperty("user.dir")+"/Screenshot";
            logger.fail(MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:", ExtentColor.RED));
            logger.fail(result.getThrowable());
            logger.fail("Screenshot below: " + logger.addScreenCaptureFromPath(screenshotPath));
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            logger.log(Status.PASS, "Test Case Passed");
        } else {
            logger.log(Status.SKIP, "Test Case Skipped");
        }
        extent.flush();
    }

}
