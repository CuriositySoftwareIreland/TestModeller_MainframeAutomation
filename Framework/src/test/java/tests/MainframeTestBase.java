package tests;

import com.jagacy.util.JagacyException;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utilities.PropertiesLoader;
import utilities.Session;
import utilities.reports.ExtentReportManager;

import java.lang.reflect.Method;

public class MainframeTestBase extends TestBase {
    @BeforeMethod(alwaysRun = true)
    public void openDB2() throws JagacyException {
        session = new Session("JegacySession");

		session.getProperties().set("jagacy.host", PropertiesLoader.getProperties().getProperty("mainframe.host"));
		session.getProperties().set("jagacy.port", PropertiesLoader.getProperties().getProperty("mainframe.port"));

        session.open();
    }

    @AfterMethod(alwaysRun = true)
    public void closeDB2() throws JagacyException {
        session.close();
    }
}
