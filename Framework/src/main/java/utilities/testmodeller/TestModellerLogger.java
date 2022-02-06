package utilities.testmodeller;

import ie.curiositysoftware.runresult.dto.TestPathRunStatusEnum;
import ie.curiositysoftware.runresult.dto.TestPathRunStep;
import org.openqa.selenium.WebDriver;
import utilities.Session;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestModellerLogger {
    public static List<TestPathRunStep> steps = new ArrayList<TestPathRunStep>();

    public static String LastNodeGuid;

    public static void LogMessage(String name, String description, TestPathRunStatusEnum status)
    {
        TestPathRunStep step = new TestPathRunStep();

        step.setStepName(name);
        step.setStepDescription(description);
        step.setTestStatus(status);
        step.setNodeGuid(LastNodeGuid);

        steps.add(step);
    }

    public static void LogMessageWithScreenshot(String name, String description, byte[] image, TestPathRunStatusEnum status)
    {
        TestPathRunStep step = new TestPathRunStep();

        step.setStepName(name);
        step.setStepDescription(description);
        step.setImage(image);
        step.setTestStatus(status);
        step.setNodeGuid(LastNodeGuid);

        steps.add(step);
    }

    public static void FailStep(String stepName, String details)
    {
        TestPathRunStep step = new TestPathRunStep();

        step.setStepName(stepName);
        step.setStepDescription(details);
        step.setTestStatus(TestPathRunStatusEnum.Failed);
        step.setNodeGuid(LastNodeGuid);

        steps.add(step);
    }

    public static void PassStep(String stepName)
    {
        TestPathRunStep step = new TestPathRunStep();

        step.setStepName(stepName);
        step.setTestStatus(TestPathRunStatusEnum.Passed);
        step.setNodeGuid(LastNodeGuid);

        steps.add(step);
    }


    public static void PassStepWithScreenshot(Session s, String stepName)
    {
        PassStepWithScreenshot(s, stepName, stepName);
    }

    public static void PassStepWithScreenshot(Session s, String stepName, String details)
    {
        TestPathRunStep step = new TestPathRunStep();

        step.setStepName(stepName);
        step.setStepDescription(details);
        step.setImage(getByteArray(s));
        step.setTestStatus(TestPathRunStatusEnum.Passed);
        step.setNodeGuid(LastNodeGuid);

        steps.add(step);
    }

    public static void FailStepWithScreenshot(Session s, String stepName)
    {
        FailStepWithScreenshot(s, stepName, stepName);
    }

    public static void FailStepWithScreenshot(Session s, String stepName, String details)
    {
        TestPathRunStep step = new TestPathRunStep();

        step.setStepName(stepName);
        step.setStepDescription(details);
        step.setImage(getByteArray(s));
        step.setTestStatus(TestPathRunStatusEnum.Failed);
        step.setNodeGuid(LastNodeGuid);

        steps.add(step);
    }

    public static void SetLastNodeGuid(String guid)
    {
        LastNodeGuid = guid;
    }

    public static void ClearMessages()
    {
        steps.clear();
    }

    public static byte[] getByteArray(Session s)
    {
        try {
            return s.getScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
