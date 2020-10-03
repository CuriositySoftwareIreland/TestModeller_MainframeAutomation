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

// http://mainframedemo.cloud.testinsights.io/app/#!/module-collection/guid/e3e13336-3bc6-4aab-b4ef-ce8ae50b8da7
@TestModellerModule(guid = "e3e13336-3bc6-4aab-b4ef-ce8ae50b8da7")
public class AdminPortal extends BasePage
{
	public AdminPortal (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//*[@id=\"username\"]");

	private By HomeElem = By.xpath("/html/body/nav/div/ul/li[1]/a");

	private By TasksElem = By.xpath("/html/body/nav/div/ul/li[2]/a");

	private By ResultsElem = By.xpath("/html/body/nav/div/ul/li[3]/a");

	private By Sign_inElem = By.xpath("//*[@id=\"signInButton\"]");

	private By PasswordElem = By.xpath("//*[@id=\"password\"]");

	private By Incorrect_username_or_passwordElem = By.xpath("//B[@class='ng-binding']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://localhost/mainframeMigration/#/Login");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://localhost/mainframeMigration/#/Login");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://localhost/mainframeMigration/#/Login");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://localhost/mainframeMigration/#/Login";

        if (!currentUrl.equals("http://localhost/mainframeMigration/#/Login")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Username
     * @name Enter Username
     */
 	public void Enter_Username(String Username)
 	{
 	    
 		WebElement elem = getWebElement(UsernameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

 			Assert.fail("Unable to locate object: " + UsernameElem.toString());
         }

 		elem.sendKeys(Username);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Username " + Username);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Username " + Username);
 	}
     
	/**
 	 * Click Home
     * @name Click Home
     */
	public void Click_Home()
	{
        
		WebElement elem = getWebElement(HomeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Home", "Click_Home failed. Unable to locate object: " + HomeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Home", "Click_Home failed. Unable to locate object: " + HomeElem.toString());

			Assert.fail("Unable to locate object: " + HomeElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Home");

		TestModellerLogger.PassStep(m_Driver, "Click_Home");
	}
     
	/**
 	 * Click Tasks
     * @name Click Tasks
     */
	public void Click_Tasks()
	{
        
		WebElement elem = getWebElement(TasksElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tasks", "Click_Tasks failed. Unable to locate object: " + TasksElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tasks", "Click_Tasks failed. Unable to locate object: " + TasksElem.toString());

			Assert.fail("Unable to locate object: " + TasksElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Tasks");

		TestModellerLogger.PassStep(m_Driver, "Click_Tasks");
	}
     
	/**
 	 * Click Results
     * @name Click Results
     */
	public void Click_Results()
	{
        
		WebElement elem = getWebElement(ResultsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Results", "Click_Results failed. Unable to locate object: " + ResultsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Results", "Click_Results failed. Unable to locate object: " + ResultsElem.toString());

			Assert.fail("Unable to locate object: " + ResultsElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Results");

		TestModellerLogger.PassStep(m_Driver, "Click_Results");
	}
     
	/**
 	 * Click Sign in
     * @name Click Sign in
     */
	public void Click_Sign_in()
	{
        
		WebElement elem = getWebElement(Sign_inElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sign_in", "Click_Sign_in failed. Unable to locate object: " + Sign_inElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sign_in", "Click_Sign_in failed. Unable to locate object: " + Sign_inElem.toString());

			Assert.fail("Unable to locate object: " + Sign_inElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Sign_in");

		TestModellerLogger.PassStep(m_Driver, "Click_Sign_in");
	}
      
	/**
 	 * Enter Password
     * @name Enter Password
     */
 	public void Enter_Password(String Password)
 	{
 	    
 		WebElement elem = getWebElement(PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + PasswordElem.toString());
         }

 		elem.sendKeys(Password);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
 	}
     
	/**
 	 * Assert Incorrect username or password
     * @name Assert Incorrect username or password
     */
	public void Assert_Incorrect_username_or_password()
	{
	    
		WebElement elem = getWebElement(Incorrect_username_or_passwordElem);

		if (elem == null) {
			Assert.fail("Unable to locate object: " + Incorrect_username_or_passwordElem.toString());
        }
        
	}}