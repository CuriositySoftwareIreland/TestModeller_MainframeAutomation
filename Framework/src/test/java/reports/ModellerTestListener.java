package reports;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.TestBase;
import utilities.Session;
import utilities.testmodeller.TestModellerLogger;

public class ModellerTestListener  extends TestBase implements ITestListener {
    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Object testClass = iTestResult.getInstance();

        Session s = ((TestBase) testClass).getSession();

        TestModellerLogger.PassStepWithScreenshot(s, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Object testClass = iTestResult.getInstance();

        Session s = ((TestBase) testClass).getSession();

        TestModellerLogger.FailStepWithScreenshot(s, "Test Failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }
}
