package tests;

import utilities.testmodeller.TestModellerLogger;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import reports.ExtentTestListener;
import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//http://mainframedemo.cloud.testinsights.io/app/#!/model-engine/guid/9590b59a-15d2-414c-8a4a-33e585c8f125
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 12, profileId = 100007)
public class SubmitUserSearch_DefaultProfile extends MainframeTestBase
{
    

    
    @Test  (groups= {"09d69c49-8ca5-4725-918a-699d08211fa2","Submit User Search","Submit User Search - Default Profile"})
    @TestModellerPath(guid = "09d69c49-8ca5-4725-918a-699d08211fa2")
    public void OpenApplicationEnterUsernameEnterPasswordAuthenticateAuthenticatedJobTypeSearchfordatabyuser1()
    {
        
        pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("f08b5df1-16d7-41d8-b044-4ea5bb2deffa");
    _MainApplication.EnterApplication("daefts");

pages.MainframeAutomation.Authentication	_Authentication = new pages.MainframeAutomation.Authentication (session);
    TestModellerLogger.SetLastNodeGuid("64f05930-bed6-430c-a304-2c28d7e5d39c");
    _Authentication.EnterUsername("xrrisjp");

    TestModellerLogger.SetLastNodeGuid("4649fa26-5898-475d-9fb4-cc4d0b0bf13a");
    _Authentication.EnterPassword("rissep20");

    TestModellerLogger.SetLastNodeGuid("42e73fda-f12b-4313-85af-0f05eb5e7cc0");
    _Authentication.EnterTS0();

pages.MainframeAutomation.TS0Menu	_TS0Menu = new pages.MainframeAutomation.TS0Menu (session);
    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _TS0Menu.OpenDataView();

pages.MainframeAutomation.DataFinder	_DataFinder = new pages.MainframeAutomation.DataFinder (session);
    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.PerformDSNameSearch("XRRISJP.**.cntl");

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.BrowseCatalog();

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.FindDataSet("LISTCAT");

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.OpenDataSetBrowse();

    TestModellerLogger.SetLastNodeGuid("f2b0a6c1-e329-4ed9-8cf5-c9a64ccd4da8");
    _DataFinder.SubmitDataSet();

    TestModellerLogger.SetLastNodeGuid("f2b0a6c1-e329-4ed9-8cf5-c9a64ccd4da8");
    _TS0Menu.BackToTS0();

    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _TS0Menu.OpenJobQueue();

pages.MainframeAutomation.JobSubmission	_JobSubmission = new pages.MainframeAutomation.JobSubmission (session);
    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _JobSubmission.FindJob("PREFIX JP*");

    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _JobSubmission.OpenJobDetails();

    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _JobSubmission.OpenSysPrint();

    TestModellerLogger.SetLastNodeGuid("8b8d630e-2f50-4238-9fa6-02cf55272370");
    _MainApplication.Logoff();

    }

    @Test  (groups= {"9902c32f-5855-412f-8501-6726ed82edc7","Submit User Search","Submit User Search - Default Profile"})
    @TestModellerPath(guid = "9902c32f-5855-412f-8501-6726ed82edc7")
    public void OpenApplicationEnterUsernameEnterPasswordAuthenticateAuthenticatedJobTypeSearchfordatabyuser2()
    {
        
        pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("f08b5df1-16d7-41d8-b044-4ea5bb2deffa");
    _MainApplication.EnterApplication("daefts");

pages.MainframeAutomation.Authentication	_Authentication = new pages.MainframeAutomation.Authentication (session);
    TestModellerLogger.SetLastNodeGuid("64f05930-bed6-430c-a304-2c28d7e5d39c");
    _Authentication.EnterUsername("xrrisjp");

    TestModellerLogger.SetLastNodeGuid("4649fa26-5898-475d-9fb4-cc4d0b0bf13a");
    _Authentication.EnterPassword("rissep20");

    TestModellerLogger.SetLastNodeGuid("42e73fda-f12b-4313-85af-0f05eb5e7cc0");
    _Authentication.EnterTS0();

pages.MainframeAutomation.TS0Menu	_TS0Menu = new pages.MainframeAutomation.TS0Menu (session);
    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _TS0Menu.OpenDataView();

pages.MainframeAutomation.DataFinder	_DataFinder = new pages.MainframeAutomation.DataFinder (session);
    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.PerformDSNameSearch("XRRISJP.**.cntl");

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.BrowseCatalog();

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.FindDataSet("LISTCAT");

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.OpenDataSetBrowse();

    TestModellerLogger.SetLastNodeGuid("f2b0a6c1-e329-4ed9-8cf5-c9a64ccd4da8");
    _DataFinder.SubmitDataSet();

    TestModellerLogger.SetLastNodeGuid("f2b0a6c1-e329-4ed9-8cf5-c9a64ccd4da8");
    _TS0Menu.BackToTS0();

    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _TS0Menu.OpenJobQueue();

pages.MainframeAutomation.JobSubmission	_JobSubmission = new pages.MainframeAutomation.JobSubmission (session);
    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _JobSubmission.FindJob("PREFIX JP*");

    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _JobSubmission.OpenJobDetails();

    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _JobSubmission.OpenSysPrint();

    TestModellerLogger.SetLastNodeGuid("8b8d630e-2f50-4238-9fa6-02cf55272370");
    _MainApplication.Logoff();

    }

    @Test  (groups= {"4b5b3fd1-dc9e-4508-a156-ffcf7ec5f423","Submit User Search","Submit User Search - Default Profile"})
    @TestModellerPath(guid = "4b5b3fd1-dc9e-4508-a156-ffcf7ec5f423")
    public void OpenApplicationEnterUsernameEnterPasswordAuthenticateAuthenticatedJobTypeSearchfordatabyuser3()
    {
        
        pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("f08b5df1-16d7-41d8-b044-4ea5bb2deffa");
    _MainApplication.EnterApplication("daefts");

pages.MainframeAutomation.Authentication	_Authentication = new pages.MainframeAutomation.Authentication (session);
    TestModellerLogger.SetLastNodeGuid("64f05930-bed6-430c-a304-2c28d7e5d39c");
    _Authentication.EnterUsername("xrrisjp");

    TestModellerLogger.SetLastNodeGuid("4649fa26-5898-475d-9fb4-cc4d0b0bf13a");
    _Authentication.EnterPassword("rissep20");

    TestModellerLogger.SetLastNodeGuid("42e73fda-f12b-4313-85af-0f05eb5e7cc0");
    _Authentication.EnterTS0();

pages.MainframeAutomation.TS0Menu	_TS0Menu = new pages.MainframeAutomation.TS0Menu (session);
    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _TS0Menu.OpenDataView();

pages.MainframeAutomation.DataFinder	_DataFinder = new pages.MainframeAutomation.DataFinder (session);
    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.PerformDSNameSearch("XRRISJP.**.cntl");

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.BrowseCatalog();

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.FindDataSet("LISTCAT");

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.OpenDataSetBrowse();

    TestModellerLogger.SetLastNodeGuid("f2b0a6c1-e329-4ed9-8cf5-c9a64ccd4da8");
    _DataFinder.SubmitDataSet();

    TestModellerLogger.SetLastNodeGuid("f2b0a6c1-e329-4ed9-8cf5-c9a64ccd4da8");
    _TS0Menu.BackToTS0();

    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _TS0Menu.OpenJobQueue();

pages.MainframeAutomation.JobSubmission	_JobSubmission = new pages.MainframeAutomation.JobSubmission (session);
    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _JobSubmission.FindJob("PREFIX JP*");

    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _JobSubmission.OpenJobDetails();

    TestModellerLogger.SetLastNodeGuid("0b37ed2e-9d60-44b8-9309-033ac0f83559");
    _JobSubmission.OpenSysPrint();

    TestModellerLogger.SetLastNodeGuid("8b8d630e-2f50-4238-9fa6-02cf55272370");
    _MainApplication.Logoff();

    }

    @Test  (groups= {"a6718e30-38d9-4d09-9744-04ea2ce2a283","Submit User Search","Submit User Search - Default Profile"})
    @TestModellerPath(guid = "a6718e30-38d9-4d09-9744-04ea2ce2a283")
    public void OpenApplicationEnterUsernameEnterPasswordAuthenticateAuthenticatedJobTypeSearchfordatabyuser4()
    {
        
        pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("f08b5df1-16d7-41d8-b044-4ea5bb2deffa");
    _MainApplication.EnterApplication("daefts");

pages.MainframeAutomation.Authentication	_Authentication = new pages.MainframeAutomation.Authentication (session);
    TestModellerLogger.SetLastNodeGuid("64f05930-bed6-430c-a304-2c28d7e5d39c");
    _Authentication.EnterUsername("xrrisjp");

    TestModellerLogger.SetLastNodeGuid("4649fa26-5898-475d-9fb4-cc4d0b0bf13a");
    _Authentication.EnterPassword("rissep20");

    TestModellerLogger.SetLastNodeGuid("42e73fda-f12b-4313-85af-0f05eb5e7cc0");
    _Authentication.EnterTS0();

pages.MainframeAutomation.TS0Menu	_TS0Menu = new pages.MainframeAutomation.TS0Menu (session);
    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _TS0Menu.OpenDataView();

pages.MainframeAutomation.DataFinder	_DataFinder = new pages.MainframeAutomation.DataFinder (session);
    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.PerformDSNameSearch("XRRISJP.**.cntl");

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.BrowseCatalog();

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.FindDataSet("LISTCAT");

    TestModellerLogger.SetLastNodeGuid("3dbbe476-8e7b-427d-9157-0cf2963df3d7");
    _DataFinder.OpenDataSetBrowse();

    TestModellerLogger.SetLastNodeGuid("49eeb5c8-77bb-4d89-b664-c0aa948e0e9e");
    _DataFinder.SubmitDataSet();

    TestModellerLogger.SetLastNodeGuid("49eeb5c8-77bb-4d89-b664-c0aa948e0e9e");
    _TS0Menu.BackToTS0();

    TestModellerLogger.SetLastNodeGuid("cf8058a3-a562-494a-ada9-6a056192d78f");
    _MainApplication.Logoff();

    }

    @Test  (groups= {"0de6e12b-de26-40de-a3f5-666c85c31c60","Submit User Search","Submit User Search - Default Profile"})
    @TestModellerPath(guid = "0de6e12b-de26-40de-a3f5-666c85c31c60")
    public void OpenApplicationEnterUsernameEnterPasswordAuthenticateErrorError5()
    {
        
        pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("f08b5df1-16d7-41d8-b044-4ea5bb2deffa");
    _MainApplication.EnterApplication("daefts");

pages.MainframeAutomation.Authentication	_Authentication = new pages.MainframeAutomation.Authentication (session);
    TestModellerLogger.SetLastNodeGuid("64f05930-bed6-430c-a304-2c28d7e5d39c");
    _Authentication.EnterUsername("xrrisjp");

    TestModellerLogger.SetLastNodeGuid("e7394c44-db70-43d8-870c-d6620d63f189");
    _Authentication.EnterPassword("asdjlk");

    }

    @Test  (groups= {"3cc938a8-c6d5-49ca-9337-ef52427f361e","Submit User Search","Submit User Search - Default Profile"})
    @TestModellerPath(guid = "3cc938a8-c6d5-49ca-9337-ef52427f361e")
    public void OpenApplicationEnterUsernameEnterPasswordAuthenticateErrorError6()
    {
        
        pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("f08b5df1-16d7-41d8-b044-4ea5bb2deffa");
    _MainApplication.EnterApplication("daefts");

pages.MainframeAutomation.Authentication	_Authentication = new pages.MainframeAutomation.Authentication (session);
    TestModellerLogger.SetLastNodeGuid("10612440-9f5d-408f-b9c9-6b9b5c222eac");
    _Authentication.EnterUsername("invaliduser");

    TestModellerLogger.SetLastNodeGuid("7fe2fd99-33f9-4e4e-ab66-be2d342b12c8");
    _Authentication.EnterPassword("rissep20");

    }

    @Test  (groups= {"35cd143b-7e22-4903-b885-d2d9b952eb76","Submit User Search","Submit User Search - Default Profile"})
    @TestModellerPath(guid = "35cd143b-7e22-4903-b885-d2d9b952eb76")
    public void OpenApplicationEnterUsernameEnterPasswordAuthenticateErrorError7()
    {
        
        pages.MainframeAutomation.MainApplication	_MainApplication = new pages.MainframeAutomation.MainApplication (session);
    TestModellerLogger.SetLastNodeGuid("f08b5df1-16d7-41d8-b044-4ea5bb2deffa");
    _MainApplication.EnterApplication("daefts");

pages.MainframeAutomation.Authentication	_Authentication = new pages.MainframeAutomation.Authentication (session);
    TestModellerLogger.SetLastNodeGuid("10612440-9f5d-408f-b9c9-6b9b5c222eac");
    _Authentication.EnterUsername("invaliduser");

    TestModellerLogger.SetLastNodeGuid("44d3ef58-72b2-40c4-a6b3-49a1646a2e45");
    _Authentication.EnterPassword("asdjlk");

    }

}
