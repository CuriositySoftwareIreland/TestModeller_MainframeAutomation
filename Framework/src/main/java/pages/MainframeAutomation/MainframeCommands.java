package pages.MainframeAutomation;

import com.jagacy.Key;
import com.jagacy.util.JagacyException;
import org.junit.Assert;
import pages.BasePage;
import utilities.Session;
import utilities.fields.EntryField;
import utilities.fields.LabelField;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class MainframeCommands extends BasePage {

    public MainframeCommands(Session s)
    {
        super(s);
    }

    public void WaitForText(String text)
    {
        containsText(text, 10);
    }

    public void WaitForChange(int length)
    {
        try {
            m_Session.waitForChange(2000);
        } catch (JagacyException e) {
            e.printStackTrace();
        }
    }

    public void WaitForText(int row, int col, String text)
    {
        try {
            m_Session.waitForTextLabel(new LabelField(row, col, text));
        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Wait for Text " + text, e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Wait for Text " + text, e.getMessage());

            e.printStackTrace();

            Assert.fail("Wait for text failed");
        }

    }

    public void EnterText(int row, int col, String text)
    {
        try {
            m_Session.setEntryFieldValue( new EntryField(row, col), text);
        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Enter Text " + text, e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Enter Text " + text, e.getMessage());

            e.printStackTrace();

            Assert.fail("Enter text failed");
        }
    }


    public void EnterText(String text)
    {
        try {
            m_Session.writeString(text);

            m_Session.waitForChange(2000);

        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Enter Text " + text, e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Enter Text " + text, e.getMessage());

            e.printStackTrace();

            Assert.fail("Enter text failed");
        }
    }

    public void AssertTextPresent(int row, int col, String text)
    {
        if (!containsText(text, 5)) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Assert screen contains text " + text);

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Assert screen contains text " + text);

            Assert.fail("Assert test present");
        }
    }

    public void AssertTextPresent(String text)
    {
        if (!containsText(text, 5)) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Assert screen contains text " + text);

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Assert screen contains text " + text);

            Assert.fail("Assert test present");
        }
    }

    public void TypeEnter()
    {
        try {
            m_Session.writeKey(Key.ENTER);

            m_Session.waitForChange(2000);
            m_Session.waitForChange(2000);

        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Type enter", e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Type enter", e.getMessage());

            e.printStackTrace();

            Assert.fail("Type enter failed");
        }
    }

    public void TypeTab()
    {
        try {
            m_Session.writeKey(Key.TAB);
        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Type enter", e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Type enter", e.getMessage());

            e.printStackTrace();

            Assert.fail("Type enter failed");
        }
    }

    public void CaptureScreenshot(String message)
    {
        ExtentReportManager.passStepWithScreenshot(m_Session, message);

        TestModellerLogger.PassStepWithScreenshot(m_Session,message);
    }

    public void AddStepPass(String message)
    {
        ExtentReportManager.passStep(m_Session, message);

        TestModellerLogger.PassStep(message);
    }
}
