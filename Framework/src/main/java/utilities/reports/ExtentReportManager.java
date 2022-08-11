package utilities.reports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import utilities.Session;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Base64;
import java.util.HashMap;

public class ExtentReportManager {
    public static ExtentReports extentReport;

    public static HashMap<Long, ExtentTest> extentTestHash;

    public static ExtentTest extentTest;

    public static String currentTestGuid;

    public static String currentTestName;

    public static String extentDir = System.getProperty("user.dir") +"/report";

    public static void setupReporter()
    {
        ExtentSparkReporter avent = new ExtentSparkReporter(extentDir +  "/index.html");

        extentTestHash = new HashMap<Long, ExtentTest>();

        System.out.println("Report location - " + extentDir +  "/index.html");
        if (extentReport == null) {
            extentReport = new ExtentReports();
            extentReport.attachReporter(avent);
        }
    }

    public static ExtentTest getCurrentTest()
    {
        long id = Thread.currentThread().getId();

        return extentTestHash.get(id);
    }

    public static void closeReporter()
    {
        extentReport.flush();
    }

    public static void createNewTest(Method method)
    {
        extentTest = extentReport.createTest(method.getName());

        long id = Thread.currentThread().getId();
        extentTestHash.put(id, extentTest);

        currentTestName = method.getName();
    }

    public static void passStep(Session s, String stepName)
    {
        long id = Thread.currentThread().getId();

        extentTestHash.get(id).log(Status.PASS, stepName);
    }

    public static void failStep(Session s, String stepName)
    {
        long id = Thread.currentThread().getId();

        extentTestHash.get(id).log(Status.FAIL, stepName);
    }

    public static void passStepWithScreenshot(Session s, String stepName)
    {
        passStepWithScreenshot(s, stepName, stepName);
    }

    public static void passStepWithScreenshot(Session s, String stepName, String details)
    {
        long id = Thread.currentThread().getId();

        try {
//            String capture = captureScreenshot(s, stepName);

//            if (capture != null) {
            String base64 = Base64.getEncoder().encodeToString(s.getScreenshot());
            if (!base64.startsWith("data:")) {
                base64 = "data:image/png;base64," + base64;
            }

            Media m = ScreenCapture.builder().base64(base64).title(stepName).build();

            extentTestHash.get(id).log(Status.PASS, m);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void failStepWithScreenshot(Session s, String stepName)
    {
        failStepWithScreenshot(s, stepName, stepName);
    }

    public static void failStepWithScreenshot(Session s, String stepName, String details)
    {
        long id = Thread.currentThread().getId();

//        try {
//            String capture = captureScreenshot(s, stepName);

//            if (capture != null) {
                try {
                    extentTestHash.get(id).log(Status.FAIL, details).addScreenCaptureFromBase64String(Base64.getEncoder().encodeToString(s.getScreenshot()), stepName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static String captureScreenshot(Session s, String stepName)
    {
        try {
            byte[] screenshot = s.getScreenshot();

            long id = Thread.currentThread().getId();

            String output =  extentDir + "/" + extentTestHash.get(id).getModel().getName() + "_" + stepName  + ".png";

            FileOutputStream fos = new FileOutputStream(output);
            try {
                fos.write(screenshot);
            }
            finally {
                fos.close();
            }

            return output;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
