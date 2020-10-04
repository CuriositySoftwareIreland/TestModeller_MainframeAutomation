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

// http://mainframedemo.cloud.testinsights.io/app/#!/module-collection/guid/9af8f605-7c1b-4bc6-8d75-eb7f94d3ecf7
@TestModellerModule(guid = "9af8f605-7c1b-4bc6-8d75-eb7f94d3ecf7")
public class TasksPage extends BasePage
{
	public TasksPage (WebDriver driver)
	{
		super(driver);
	}


	
	private By DataByUserElem = By.xpath("//A[@id='dataByUserButton']/SPAN[@class='fa fa-play']");

	private By MaskDataSetElem = By.xpath("//*[@id=\"maskDataSetButton\"]");

	private By ProcessPaymentsElem = By.xpath("//*[@id=\"processPaymentsButton\"]");

	private By BackupDataElem = By.xpath("//*[@id=\"backupDataButton\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://localhost/mainframeMigration/#/Tasks");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://localhost/mainframeMigration/#/Tasks");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://localhost/mainframeMigration/#/Tasks");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://localhost/mainframeMigration/#/Tasks";

        if (!currentUrl.equals("http://localhost/mainframeMigration/#/Tasks")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click DataByUser
     * @name Click DataByUser
     */
	public void Click_DataByUser()
	{
        
		WebElement elem = getWebElement(DataByUserElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DataByUser", "Click_DataByUser failed. Unable to locate object: " + DataByUserElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DataByUser", "Click_DataByUser failed. Unable to locate object: " + DataByUserElem.toString());

			Assert.fail("Unable to locate object: " + DataByUserElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_DataByUser");

		TestModellerLogger.PassStep(m_Driver, "Click_DataByUser");
	}
     
	/**
 	 * Click MaskDataSet
     * @name Click MaskDataSet
     */
	public void Click_MaskDataSet()
	{
        
		WebElement elem = getWebElement(MaskDataSetElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_MaskDataSet", "Click_MaskDataSet failed. Unable to locate object: " + MaskDataSetElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_MaskDataSet", "Click_MaskDataSet failed. Unable to locate object: " + MaskDataSetElem.toString());

			Assert.fail("Unable to locate object: " + MaskDataSetElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_MaskDataSet");

		TestModellerLogger.PassStep(m_Driver, "Click_MaskDataSet");
	}
     
	/**
 	 * Click ProcessPayments
     * @name Click ProcessPayments
     */
	public void Click_ProcessPayments()
	{
        
		WebElement elem = getWebElement(ProcessPaymentsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ProcessPayments", "Click_ProcessPayments failed. Unable to locate object: " + ProcessPaymentsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ProcessPayments", "Click_ProcessPayments failed. Unable to locate object: " + ProcessPaymentsElem.toString());

			Assert.fail("Unable to locate object: " + ProcessPaymentsElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_ProcessPayments");

		TestModellerLogger.PassStep(m_Driver, "Click_ProcessPayments");
	}
     
	/**
 	 * Click BackupData
     * @name Click BackupData
     */
	public void Click_BackupData()
	{
        
		WebElement elem = getWebElement(BackupDataElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BackupData", "Click_BackupData failed. Unable to locate object: " + BackupDataElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BackupData", "Click_BackupData failed. Unable to locate object: " + BackupDataElem.toString());

			Assert.fail("Unable to locate object: " + BackupDataElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_BackupData");

		TestModellerLogger.PassStep(m_Driver, "Click_BackupData");
	}}