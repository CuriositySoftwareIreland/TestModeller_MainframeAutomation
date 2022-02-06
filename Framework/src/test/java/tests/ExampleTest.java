package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainframeAutomation.*;
import reports.ExtentTestListener;
import reports.TestNGListener;

@Listeners({TestNGListener.class, ExtentTestListener.class})
public class ExampleTest extends MainframeTestBase {
    @Test
    public void exampleTest()
    {
        pages.MainframeAutomation.MainframeCommands	_MainframeCommands = new pages.MainframeAutomation.MainframeCommands (session);

        // Wait for environment to load
        _MainframeCommands.WaitForChange(4000);
        _MainframeCommands.CaptureScreenshot("Login application");
        _MainframeCommands.EnterText("demo");
        _MainframeCommands.TypeTab();
        _MainframeCommands.EnterText("demo");
        _MainframeCommands.TypeEnter();
        _MainframeCommands.WaitForChange(12000);
        _MainframeCommands.CaptureScreenshot("Authenticated");
    }
}
