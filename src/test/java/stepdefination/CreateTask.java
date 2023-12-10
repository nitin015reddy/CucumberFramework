package stepdefination;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
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

public class CreateTask {
private static WebDriver driver=Hooks.driver;
	
	LoginPage lp;
	HomePage hp ;
	CreateTasksPage ct;	
	ViewTasks vt;

	@Given("Launched web and hit url")
	public void launched_web_and_hit_url() {
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp= new LoginPage(driver);
		hp=new HomePage(driver);
		ct= new CreateTasksPage(driver);
        vt = new ViewTasks(driver);
	}

	@And("enter credentials {string} and {string}")
	public void enter_credentials_and(String uname, String pwd) throws IOException, InterruptedException {
		lp.enterUserName(uname).enterPassword(pwd);
		lp.clickLoginButton();
		Thread.sleep(5000);
	}

	@And("App launcher menu click")
	public void app_launcher_menu_click() throws InterruptedException {
		hp.clickonAppLaunch();
		Thread.sleep(2000);	
	}

	@And("view all and Type {string} in App Luancher")
	public void view_all_and_type_in_app_luancher(String string) throws InterruptedException {
		hp.clickOnViewAll();
        Thread.sleep(2000);
        hp.searchOnAppLaunch(string);
	}

	@Given("click on task link")
	public void click_on_task_link() throws InterruptedException {
		hp.clickTasksLink();
	}

	@And("New button click under dropdown icon")
	public void new_button_click_under_dropdown_icon() throws InterruptedException {
		ct.clickDropdown();
		ct.clickNew();
	}

	@When("Enter subject as {string}")
	public void enter_subject_as(String sub) throws InterruptedException {
		ct.enterSubject(sub);
	}

	@And("Select status as Waiting on someone else")
	public void select_status_as_waiting_on_someone_else() throws InterruptedException {
		ct.selectstatus();
	}

	@And("Save the task")
	public void save_the_task() throws InterruptedException {
		ct.clicksave();
	}

	@Then("verify the Task created message")
	public void verify_the_task_created_message() {
		Assert.assertEquals(vt.getConfirmationMessage(), "Lead");
		System.out.println("Lead created successfully");
	}
}
