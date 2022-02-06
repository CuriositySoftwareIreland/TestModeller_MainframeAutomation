package pages.MainframeAutomation;

import com.jagacy.Field;
import com.jagacy.Key;
import com.jagacy.util.JagacyException;
import org.testng.Assert;
import pages.BasePage;
import utilities.Session;
import utilities.fields.EntryField;
import utilities.fields.LabelField;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

import java.util.function.Predicate;

public class MainframeCommands extends BasePage {

    public int DEFAULT_SECS = 60;

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
            m_Session.waitForChange(10);

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

    public void CommandPF(String fNumber)
    {
        try {
            m_Session.writeKey(convertToKey("PF" + fNumber));
            m_Session.waitForChange(2000);

        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Type F" + fNumber, e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Type F" + fNumber, e.getMessage());

            e.printStackTrace();

            Assert.fail("Type F1 failed");

        }


    }

    public void CommandPA(String paNumber)
    {
        try {
            m_Session.writeKey(convertToKey("PA" + paNumber));
            m_Session.waitForChange(2000);
        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Type PA" + paNumber, e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Type PA" + paNumber, e.getMessage());

            e.printStackTrace();

            Assert.fail("Type F12 failed");

        }
    }

    public void EnterKeyCommand(Key key)
    {
        try {
            m_Session.writeKey(key);
            m_Session.waitForChange(2000);
        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Type " + key.toString(), e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Type "  + key.toString(), e.getMessage());

            e.printStackTrace();

            Assert.fail("Type F12 failed");

        }
    }


    public void TypeEnter()
    {
        try {
            m_Session.writeKey(Key.ENTER);
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

    public void TypeClear()
    {
        try {
            m_Session.writeKey(Key.CLEAR);
        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Type enter", e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Type enter", e.getMessage());

            e.printStackTrace();

            Assert.fail("Type enter failed");
        }
    }

    public void TypeHome()
    {
        try {
            m_Session.writeKey(Key.HOME);
        } catch (JagacyException e) {
            ExtentReportManager.failStepWithScreenshot(m_Session, "Type enter", e.getMessage());

            TestModellerLogger.FailStepWithScreenshot(m_Session, "Type enter", e.getMessage());

            e.printStackTrace();

            Assert.fail("Type enter failed");
        }
    }

    public void CaptureScreenshot()
    {
        CaptureScreenshot("");
    }

    public void CaptureScreenshot(String message)
    {
        ExtentReportManager.passStepWithScreenshot(m_Session, message);

        TestModellerLogger.PassStepWithScreenshot(m_Session,message);
    }

    public void WaitKeyboardUnlocked() throws InterruptedException {
        this.waitKeyboardUnlocked(this.DEFAULT_SECS);
    }

    private void waitKeyboardUnlocked(int tries) throws InterruptedException {
        if (tries >= 1) {
            try {
                if (this.m_Session.isKeyboardUnlocked()) {
                    return;
                }
            } catch (Exception var3) {
            }
            this.wait(1);
            --tries;
            this.waitKeyboardUnlocked(tries);
        }
    }

    private Key convertToKey(String key)
    {
        switch (key)
        {
            case "PF1":
                return Key.PF1;
            case "PF2":
                return Key.PF2;
            case "PF3":
                return Key.PF3;
            case "PF4":
                return Key.PF4;
            case "PF5":
                return Key.PF5;
            case "PF6":
                return Key.PF6;
            case "PF7":
                return Key.PF7;
            case "PF8":
                return Key.PF8;
            case "PF9":
                return Key.PF9;
            case "PF10":
                return Key.PF10;
            case "PF11":
                return Key.PF11;
            case "PF12":
                return Key.PF12;
            case "PF13":
                return Key.PF13;
            case "PF14":
                return Key.PF14;
            case "PF15":
                return Key.PF15;
            case "PF16":
                return Key.PF16;
            case "PF17":
                return Key.PF17;
            case "PF18":
                return Key.PF18;
            case "PF19":
                return Key.PF19;
            case "PF20":
                return Key.PF20;
            case "PF21":
                return Key.PF21;
            case "PF22":
                return Key.PF22;
            case "PF23":
                return Key.PF23;
            case "PF24":
                return Key.PF24;
            case "PA1":
                return Key.PA1;
            case "PA2":
                return Key.PA2;
            case "PA3":
                return Key.PA3;
        }

        return null;
    }
}
