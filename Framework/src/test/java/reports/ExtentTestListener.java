package reports;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.TestBase;
import utilities.Session;
import utilities.reports.ExtentReportManager;

public class ExtentTestListener extends TestBase implements ITestListener {
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        iTestContext.setAttribute("Session", this.session);
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        ExtentReportManager.extentReport.flush();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Object testClass = iTestResult.getInstance();

        TestBase tb = (TestBase) testClass;

        Session s = tb.getSession();
        ExtentReportManager.passStepWithScreenshot(s, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Object testClass = iTestResult.getInstance();

        TestBase tb = (TestBase) testClass;

        Session s = tb.getSession();

        ExtentReportManager.failStepWithScreenshot(s, "Test Failure");

        ExtentReportManager.extentReport.flush();
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }
}
