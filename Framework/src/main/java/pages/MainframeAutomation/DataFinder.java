package pages.MainframeAutomation;

import pages.BasePage;
import utilities.Session;

public class DataFinder  extends BasePage
{
    private MainframeCommands mainframeCommands;

    public DataFinder(Session s)
    {
        super(s);

        mainframeCommands = new MainframeCommands(m_Session);
    }

    public void PerformDSNameSearch(String search)
    {
        mainframeCommands.TypeEnter();
        mainframeCommands.CaptureScreenshot("DS Search");
    }

    public void BrowseCatalog()
    {
        mainframeCommands.EnterText(8,1,"b");
        mainframeCommands.TypeEnter();
        mainframeCommands.CaptureScreenshot("Browse catalog");
        mainframeCommands.WaitForChange(2000);
    }

    public void FindDataSet(String dataset)
    {
        // find listcat
        mainframeCommands.EnterText("FIND " + dataset);
        mainframeCommands.TypeEnter();
        mainframeCommands.WaitForChange(2000);
        mainframeCommands.CaptureScreenshot("Find dataset " + dataset);
    }

    public void OpenDataSetBrowse()
    {
        mainframeCommands.EnterText(5,1,"b");
        mainframeCommands.TypeEnter();
        mainframeCommands.CaptureScreenshot("Open listcat");
        mainframeCommands.WaitForChange(2000);
    }

    public void SaveDataSet()
    {
        mainframeCommands.EnterText("save");
        mainframeCommands.TypeEnter();
        mainframeCommands.CaptureScreenshot("Save data");
        mainframeCommands.WaitForChange(2000);
    }

    public void SubmitDataSet()
    {
        mainframeCommands.EnterText("sub");
        mainframeCommands.TypeEnter();
        mainframeCommands.CaptureScreenshot("Submit job");
        mainframeCommands.WaitForChange(2000);
    }
}
