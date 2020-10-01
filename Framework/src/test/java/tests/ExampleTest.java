package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
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

        // Enter action
        _MainframeCommands.EnterText("daefts");
        _MainframeCommands.TypeEnter();
        _MainframeCommands.WaitForChange(2000);

        // Enter username
        _MainframeCommands.EnterText("xrrisjp");
        _MainframeCommands.TypeEnter();
        _MainframeCommands.WaitForChange(2000);

        // Enter password
        _MainframeCommands.EnterText("rissep20");
        _MainframeCommands.TypeEnter();
        _MainframeCommands.WaitForChange(2000);
        
        // LOgoff
        _MainframeCommands.EnterText("LOGOFF");
        _MainframeCommands.TypeEnter();
        _MainframeCommands.WaitForChange(2000);
    }
}
