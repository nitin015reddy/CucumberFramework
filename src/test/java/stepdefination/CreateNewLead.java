package stepdefination;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.selenium.pages.CreateLeadsPage;
import com.selenium.pages.CreateTasksPage;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;
import com.selenium.pages.ViewTasks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewLead {
	private static WebDriver driver=Hooks.driver;
	
	LoginPage lp;
	HomePage hp ;
	CreateLeadsPage cl;			
	
	@Given("Launch browser and enter salesforce url")
	public void launch_browser_and_enter_salesforce_url() {
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp= new LoginPage(driver);
		hp=new HomePage(driver);
		cl= new CreateLeadsPage(driver);
		
	}

	
	@And("Login with credentials {string} and {string}")
	public void login_with_credentials_and(String uname,String pwd) throws IOException, InterruptedException {
		lp.enterUserName(uname).enterPassword(pwd);
		lp.clickLoginButton();
		Thread.sleep(5000);
	}
	
	@And("Click on toggle menu from left corner")
	public void click_on_toggle_menu_from_left_corner() throws InterruptedException {
		hp.clickonAppLaunch();
		Thread.sleep(2000);	
	}
	
	@And("Click View All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() throws InterruptedException {
		   hp.clickOnViewAll();
	        Thread.sleep(2000);
	        
	        hp.clickSales();
	        Thread.sleep(3000);
	}
	
	@And("Click on the Leads tab")
	public void click_on_the_leads_tab() throws InterruptedException {
		  cl.clickLeads();
	        Thread.sleep(5000);
	}
	@And("Click New button under dropdown icon")
	public void click_new_button_under_dropdown_icon_lead() throws InterruptedException {
		 cl.clickNew();
	        System.out.println("Click new leads");
	}
	@When("select salutation")
	public void select_salutation() throws InterruptedException {
		 cl.salutation();
        Thread.sleep(3000);
	}
	@And("Enter firstname as {string}")
	public void enter_firstname_as(String fname) throws InterruptedException {
		 cl.enterFirstName(fname);
	}
	@And("Enter lastname as {string}")
	public void enter_lastname_as(String lname) throws InterruptedException {
		cl.enterLastName(lname);
	}
	@And("Enter company as {string}")
	public void enter_company_as(String cmp) throws InterruptedException {
		cl.enterCompany(cmp);
	}
	@And("Select status")
	public void select_status() throws InterruptedException {
		cl.status();
        Thread.sleep(1000);
	}
	@And("click on Save")
	public void click_on_save_lead() throws InterruptedException {
		cl.save();    
        Thread.sleep(5000);
	}
	@Then("verify the Leads created success message")
	public void verify_the_leads_created_success_message() {
		  //verify lead message created successfully
		Assert.assertEquals(cl.getConfirmationMessage(), "Lead");
		System.out.println("Lead created successfully");
       
        
	}
}
