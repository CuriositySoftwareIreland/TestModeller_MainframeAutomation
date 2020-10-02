package pages.MainframeAutomation;

import pages.BasePage;
import utilities.Session;

public class TS0Menu extends BasePage
{
    private MainframeCommands mainframeCommands;

    public TS0Menu(Session s)
    {
        super(s);

        mainframeCommands = new MainframeCommands(m_Session);
    }

    public void OpenDataView()
    {
        mainframeCommands.EnterText("3.4");
        mainframeCommands.TypeEnter();
        mainframeCommands.WaitForChange(2000);
        mainframeCommands.CaptureScreenshot("Data");
    }

    public void OpenJobQueue()
    {
        mainframeCommands.EnterText("s");
        mainframeCommands.TypeEnter();
        mainframeCommands.EnterText("h");
        mainframeCommands.TypeEnter();
        mainframeCommands.EnterText("o");
        mainframeCommands.TypeEnter();
    }

    public void BackToTS0()
    {
        while (!mainframeCommands.containsText("ISPF Primary Option Menu", 2))
            mainframeCommands.TypeF3();

        mainframeCommands.CaptureScreenshot("TS0");
    }

}
