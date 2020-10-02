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
@TestModellerSuite(id = 2, profileId = 100001)
public class TestModel_DefaultProfile extends MainframeTestBase
{
    

    
    @Test  (groups= {"ecc0c182-7b04-4045-b499-2c1a3ab859de","Test Model","Test Model - Default Profile"})
    @TestModellerPath(guid = "ecc0c182-7b04-4045-b499-2c1a3ab859de")
    public void EnterApplication()
    {
        
        pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("554ff9cc-8d07-4485-8e10-2e7b32f3046e");
    _MainApplication.EnterApplication("daefts");

    }

}
