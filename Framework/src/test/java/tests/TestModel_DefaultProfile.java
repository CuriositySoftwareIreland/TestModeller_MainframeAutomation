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
@TestModellerSuite(id = 4, profileId = 100001)
public class TestModel_DefaultProfile extends MainframeTestBase
{
    

    
    @Test  (groups= {"7ad4b3e1-89c6-4165-9f06-2d07eaa8b500","Test Model","Test Model - Default Profile"})
    @TestModellerPath(guid = "7ad4b3e1-89c6-4165-9f06-2d07eaa8b500")
    public void WaitForChangeEnterApplicationGoToUrlPositiveEnterUsername1()
    {
        
        pages.MainframeAutomation.MainframeCommands	_MainframeCommands = new pages.MainframeAutomation.MainframeCommands (session);
    TestModellerLogger.SetLastNodeGuid("74ba49b2-a043-4f09-bdd9-4d74c7e0123d");
    _MainframeCommands.WaitForChange(3000);

pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("554ff9cc-8d07-4485-8e10-2e7b32f3046e");
    _MainApplication.EnterApplication("daefts");

    }

    @Test  (groups= {"fb786d08-9023-4eff-bed6-55df36942f83","Test Model","Test Model - Default Profile"})
    @TestModellerPath(guid = "fb786d08-9023-4eff-bed6-55df36942f83")
    public void WaitForChangeEnterApplicationGoToUrlNegativeEnterUsername2()
    {
        
        pages.MainframeAutomation.MainframeCommands	_MainframeCommands = new pages.MainframeAutomation.MainframeCommands (session);
    TestModellerLogger.SetLastNodeGuid("74ba49b2-a043-4f09-bdd9-4d74c7e0123d");
    _MainframeCommands.WaitForChange(3000);

pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("554ff9cc-8d07-4485-8e10-2e7b32f3046e");
    _MainApplication.EnterApplication("daefts");

    }

}
