package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public ChromeDriver driver;
	
	@Given("Open the Chrome Browser")
	public void openTheChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximise the Browser")
	public void maximiseTheBrowser() {
		driver.manage().window().maximize();
	}

	@Given("Load the URL")
	public void loadTheURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Set the Timeouts")
	public void setTheTimeouts() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Given("Enter the User Name")
	public void enterTheUserName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	@Given("Enter the Password")
	public void enterThePassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("click on the Login Button")
	public void clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify login Successful")
	public void verifyLoginSuccessful() {
	    System.out.println("Login Successful");
	}
	
	@Given("Click on the CRMSFA")
	public void clickOnTheCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@When("click on the Lead button")
	public void clickOnTheLeadButton() {
		driver.findElementByLinkText("Leads").click();
	}

	@Then("Verify Lead page Open Successful")
	public void verifyLeadPageOpenSuccessful() {
	    System.out.println("LeadPage Opened");
	}

	@Given("Click on the Create Lead button")
	public void clickOnTheCreateLeadButton() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the Company Name")
	public void enterTheCompanyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
	}

	@Given("Enter the First Name")
	public void enterTheFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
	}

	@Given("Enter the Last Name")
	public void enterTheLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
	}

	@When("click on the Submit button")
	public void clickOnTheSubmitButton() {
		driver.findElementByName("submitButton").click();
	}

	@Then("Verify Create Successful")
	public void verifyCreateSuccessful() {
	    System.out.println("Created Successfully");
	}

}
