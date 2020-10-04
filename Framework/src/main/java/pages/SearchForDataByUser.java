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

// http://mainframedemo.cloud.testinsights.io/app/#!/module-collection/guid/858f8e24-f397-43bc-bad7-faf5eafef43a
@TestModellerModule(guid = "858f8e24-f397-43bc-bad7-faf5eafef43a")
public class SearchForDataByUser extends BasePage
{
	public SearchForDataByUser (WebDriver driver)
	{
		super(driver);
	}


	
	private By User_IDElem = By.xpath("//*[@id=\"userID\"]");

	private By SearchElem = By.xpath("//*[@id=\"submitSearchButton\"]");

	private By UserID_not_recognisedElem = By.xpath("//SPAN[@id='searchError']/B[@class='ng-binding']");

	private By JobCreatedElem = By.xpath("//SPAN[@id='searchSuccess']/B[@class='ng-binding']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://localhost/mainframeMigration/#/SubmitDataSearch");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://localhost/mainframeMigration/#/SubmitDataSearch");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://localhost/mainframeMigration/#/SubmitDataSearch");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://localhost/mainframeMigration/#/SubmitDataSearch";

        if (!currentUrl.equals("http://localhost/mainframeMigration/#/SubmitDataSearch")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter User ID
     * @name Enter User ID
     */
 	public void Enter_User_ID(String User_ID)
 	{
 	    
 		WebElement elem = getWebElement(User_IDElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_User_ID", "Enter_User_ID failed. Unable to locate object: " + User_IDElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_User_ID", "Enter_User_ID failed. Unable to locate object: " + User_IDElem.toString());

 			Assert.fail("Unable to locate object: " + User_IDElem.toString());
         }

 		elem.sendKeys(User_ID);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_User_ID " + User_ID);

  		TestModellerLogger.PassStep(m_Driver, "Enter_User_ID " + User_ID);
 	}
     
	/**
 	 * Click Search
     * @name Click Search
     */
	public void Click_Search()
	{
        
		WebElement elem = getWebElement(SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

			Assert.fail("Unable to locate object: " + SearchElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}
     
	/**
 	 * Assert UserID not recognised
     * @name Assert UserID not recognised
     */
	public void Assert_UserID_not_recognised()
	{
	    
		WebElement elem = getWebElement(UserID_not_recognisedElem);

		if (elem == null) {
			Assert.fail("Unable to locate object: " + UserID_not_recognisedElem.toString());
        }
        
	}
     
	/**
 	 * Assert JobCreated
     * @name Assert JobCreated
     */
	public void Assert_JobCreated()
	{
	    
		WebElement elem = getWebElement(JobCreatedElem);

		if (elem == null) {
			Assert.fail("Unable to locate object: " + JobCreatedElem.toString());
        }
        
	}}