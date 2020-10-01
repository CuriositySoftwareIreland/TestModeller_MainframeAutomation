package pages;

import com.jagacy.util.JagacyException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import utilities.Session;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage
{
    protected Session m_Session;

    protected String m_BaseImageFolder;

    public BasePage(Session session)
    {
        m_Session = session;
    }

    protected Boolean containsText(String text, int maxTime)  {
        waitForChange(2000);

        for (int i = 0; i < maxTime; i++) {
            if (m_Session.getScreenText().toString().contains(text))
                return true;

            waitForChange(1000);
        }

        System.out.println(m_Session.getScreenText().toString());
        return false;
    }

    protected void sleep (Integer milliSeconds) {
        long secondsLong = (long) milliSeconds;
        try {
            Thread.sleep(secondsLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void waitForChange(int time)
    {
        try {
            m_Session.waitForChange(time);
        } catch (JagacyException e) {

        }
    }

    protected String getBaseImageFolder()
    {
        return "";
    }
}
