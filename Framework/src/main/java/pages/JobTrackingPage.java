package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://mainframedemo.cloud.testinsights.io/app/#!/module-collection/guid/51acf04f-f7b4-4a1e-9bb7-04cde55cd0b2
@TestModellerModule(guid = "51acf04f-f7b4-4a1e-9bb7-04cde55cd0b2")
public class JobTrackingPage extends BasePage
{
	public JobTrackingPage (WebDriver driver)
	{
		super(driver);
	}


	
	private By OpenDataSearchJobElem = By.xpath("/html/body/main/div/div/div/table/tbody/tr[1]/td[3]/a[1]");

	private By DeleteJobElem = By.xpath("/html/body/main/div/div/div/table/tbody/tr[1]/td[3]/a[2]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://localhost/mainframeMigration/#/ResultsPage");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://localhost/mainframeMigration/#/ResultsPage");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://localhost/mainframeMigration/#/ResultsPage");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://localhost/mainframeMigration/#/ResultsPage";

        if (!currentUrl.equals("http://localhost/mainframeMigration/#/ResultsPage")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click OpenDataSearchJob
     * @name Click OpenDataSearchJob
     */
	public void Click_OpenDataSearchJob()
	{
        
		WebElement elem = getWebElement(OpenDataSearchJobElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_OpenDataSearchJob", "Click_OpenDataSearchJob failed. Unable to locate object: " + OpenDataSearchJobElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_OpenDataSearchJob", "Click_OpenDataSearchJob failed. Unable to locate object: " + OpenDataSearchJobElem.toString());

			Assert.fail("Unable to locate object: " + OpenDataSearchJobElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_OpenDataSearchJob");

		TestModellerLogger.PassStep(m_Driver, "Click_OpenDataSearchJob");
	}
     
	/**
 	 * Click DeleteJob
     * @name Click DeleteJob
     */
	public void Click_DeleteJob()
	{
        
		WebElement elem = getWebElement(DeleteJobElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DeleteJob", "Click_DeleteJob failed. Unable to locate object: " + DeleteJobElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DeleteJob", "Click_DeleteJob failed. Unable to locate object: " + DeleteJobElem.toString());

			Assert.fail("Unable to locate object: " + DeleteJobElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_DeleteJob");

		TestModellerLogger.PassStep(m_Driver, "Click_DeleteJob");
	}}