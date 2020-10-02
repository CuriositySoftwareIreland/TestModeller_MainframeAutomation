package tests;

import utilities.testmodeller.TestModellerLogger;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import reports.ExtentTestListener;
import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//http://mainframedemo.cloud.testinsights.io/app/#!/model-engine/guid/794855fa-a6d7-47bd-8768-c1d7775b1a52
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 3, profileId = 100001)
public class TestModel_DefaultProfile extends MainframeTestBase
{
    

    
    @Test  (groups= {"2567b035-63aa-44b0-901a-4a7de724ac2b","Test Model","Test Model - Default Profile"})
    @TestModellerPath(guid = "2567b035-63aa-44b0-901a-4a7de724ac2b")
    public void WaitForChangeEnterApplication()
    {
        
        pages.MainframeAutomation.MainframeCommands	_MainframeCommands = new pages.MainframeAutomation.MainframeCommands (session);
    TestModellerLogger.SetLastNodeGuid("74ba49b2-a043-4f09-bdd9-4d74c7e0123d");
    _MainframeCommands.WaitForChange(3000);

pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("554ff9cc-8d07-4485-8e10-2e7b32f3046e");
    _MainApplication.EnterApplication("daefts");

    }

}
