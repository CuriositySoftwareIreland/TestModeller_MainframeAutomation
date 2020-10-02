package pages.MainframeAutomation;

import pages.BasePage;
import utilities.Session;

public class Authentication extends BasePage
{
    private MainframeCommands mainframeCommands;

    public Authentication(Session s)
    {
        super(s);

        mainframeCommands = new MainframeCommands(m_Session);
    }

    public void EnterUsername(String user)
    {
        // Enter username
        mainframeCommands.EnterText(user);
        mainframeCommands.TypeEnter();
        mainframeCommands.WaitForChange(2000);
        mainframeCommands.CaptureScreenshot("Username");
    }

    public void EnterPassword(String pass)
    {
        mainframeCommands.EnterText(pass);
        mainframeCommands.TypeEnter();
        mainframeCommands.WaitForChange(2000);
        mainframeCommands.CaptureScreenshot("Logged in");
    }

    public void EnterTS0()
    {
        // Enter TS0
        mainframeCommands.TypeEnter();
        mainframeCommands.CaptureScreenshot("TS0");
    }

}
