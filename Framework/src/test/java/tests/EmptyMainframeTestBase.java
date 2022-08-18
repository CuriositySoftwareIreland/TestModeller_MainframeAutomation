package tests;

import com.jagacy.util.JagacyException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Session;

public class EmptyMainframeTestBase extends MainframeTestBase {
    @BeforeMethod(alwaysRun = true)
    public void openMainframe() throws JagacyException {
        session = new Session("JegacySession");
    }

    @AfterMethod(alwaysRun = true)
    public void closeMainframe() throws JagacyException {
        if (session != null)
            session.close();
    }
}
