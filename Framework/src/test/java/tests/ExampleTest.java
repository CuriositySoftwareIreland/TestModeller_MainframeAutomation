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

        // Load app
        MainApplication mainApplication = new MainApplication(session);
        mainApplication.EnterApplication("daefts");

        Authentication authentication = new Authentication(session);
        authentication.EnterUsername("xrrisjp");
        authentication.EnterPassword("rissep20");
        authentication.EnterTS0();

        TS0Menu ts0Menu = new TS0Menu(session);
        ts0Menu.OpenDataView();

        DataFinder dataFinder = new DataFinder(session);

        dataFinder.PerformDSNameSearch("XRRISJP.**.cntl");

        dataFinder.BrowseCatalog();

        dataFinder.FindDataSet("LISTCAT");

        dataFinder.OpenDataSetBrowse();
        dataFinder.SubmitDataSet();

        // Back to TS0
        ts0Menu.BackToTS0();

        // Jobs
        ts0Menu.OpenJobQueue();

        JobSubmission jobSubmission = new JobSubmission(session);
        jobSubmission.FindJob("PREFIX JP*");
        jobSubmission.OpenJobDetails();
        jobSubmission.OpenSysPrint();

        mainApplication.Logoff();
    }
}
