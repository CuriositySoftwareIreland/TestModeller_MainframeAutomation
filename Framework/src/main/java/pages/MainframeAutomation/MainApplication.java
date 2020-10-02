package pages.MainframeAutomation;

import pages.BasePage;
import utilities.Session;

public class MainApplication extends BasePage
{
    private MainframeCommands mainframeCommands;

    public MainApplication(Session s)
    {
        super(s);

        mainframeCommands = new MainframeCommands(m_Session);
    }

    public void EnterApplication(String app)
    {
        mainframeCommands.EnterText(app);
        mainframeCommands.TypeEnter();
        mainframeCommands.TypeEnter();
        mainframeCommands.WaitForChange(12000);
        mainframeCommands.CaptureScreenshot("Load application");
    }


    public void Logoff()
    {
        while (!mainframeCommands.containsText("READY", 2))
            mainframeCommands.TypeF3();

        // logoff
        mainframeCommands.EnterText("LOGOFF");
        mainframeCommands.TypeEnter();
    }
}
