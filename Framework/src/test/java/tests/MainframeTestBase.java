package tests;

import com.jagacy.util.JagacyException;
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

		if ((!PropertiesLoader.getProperties().getProperty("mainframe.ssl").equals("")) && (!PropertiesLoader.getProperties().getProperty("mainframe.ssl").equals("Off"))) {
			session.getProperties().set("jagacy.ssl.context", PropertiesLoader.getProperties().getProperty("mainframe.ssl"));
			session.getProperties().set("jagacy.ssl", "true");
		}

		if (!PropertiesLoader.getProperties().getProperty("mainframe.terminal").equals("")) {
			session.getProperties().set("jagacy.terminal", PropertiesLoader.getProperties().getProperty("mainframe.terminal"));
		}
		
		if (!PropertiesLoader.getProperties().getProperty("mainframe.deviceName").equals("")) {
			session.getProperties().set("deviceName", PropertiesLoader.getProperties().getProperty("mainframe.deviceName"));
		}

        session.open();
        new MainframeCommands(session).WaitForChange(2000);
    }

    @AfterMethod(alwaysRun = true)
    public void closeMainframe() throws JagacyException {
		if (session != null)
	        session.close();
    }
}
