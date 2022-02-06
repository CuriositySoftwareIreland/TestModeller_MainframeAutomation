package tests;

import com.jagacy.util.JagacyException;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.MainframeAutomation.MainframeCommands;
import utilities.PropertiesLoader;
import utilities.Session;
import utilities.reports.ExtentReportManager;

import java.lang.reflect.Method;

public class MainframeTestBase extends TestBase {
    @BeforeMethod(alwaysRun = true)
    public void openMainframe() throws JagacyException {
        session = new Session("JegacySession");

		session.getProperties().set("jagacy.host", PropertiesLoader.getProperties().getProperty("mainframe.host"));
		session.getProperties().set("jagacy.port", PropertiesLoader.getProperties().getProperty("mainframe.port"));

        session.open();
        new MainframeCommands(session).WaitForChange(2000);
    }

    @AfterMethod(alwaysRun = true)
    public void closeMainframe() throws JagacyException {
        session.close();
    }
}
