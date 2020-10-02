package pages.MainframeAutomation;

import pages.BasePage;
import utilities.Session;

public class JobSubmission  extends BasePage
{
    private MainframeCommands mainframeCommands;

    public JobSubmission(Session s)
    {
        super(s);

        mainframeCommands = new MainframeCommands(m_Session);
    }

    // Find Job
    public void FindJob(String text)
    {
        mainframeCommands.EnterText("text");
        mainframeCommands.TypeEnter();
        mainframeCommands.CaptureScreenshot("View Jobs");
    }

    // Open Job details
    public void OpenJobDetails()
    {
        mainframeCommands.EnterText(10,1, "?");
        mainframeCommands.TypeEnter();
        mainframeCommands.CaptureScreenshot("Job Queue");
    }

    // Open sysprint
    public void OpenSysPrint()
    {
        mainframeCommands.EnterText(6,1, "s");
        mainframeCommands.TypeEnter();
        mainframeCommands.CaptureScreenshot("Open sysprint");
    }
}
