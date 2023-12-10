package stepdefination;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.selenium.pages.CreateTasksPage;
import com.selenium.pages.CreateWorkTypePage;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;
import com.selenium.pages.ViewTasks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertWorkType {

private static WebDriver driver=Hooks.driver;
	
	LoginPage lp= new LoginPage(driver);
	HomePage hp =new HomePage(driver);
	 CreateWorkTypePage cwt=new CreateWorkTypePage(driver);


	@And("select view all and Type {string} in App Luancher")
	public void select_view_all_and_type_in_app_luancher(String field) throws InterruptedException {
		hp.clickOnViewAll();
		Thread.sleep(3000);
	     hp.searchOnAppLaunch(field);

	}

	@And("work type link click")
	public void work_type_link_click() throws InterruptedException {
		hp.clickWorkTypesLink();
		Thread.sleep(4000);
	}

	@And("new button click")
	public void new_button_click() throws InterruptedException {
	cwt.New();
	}

	@When("Enter Work Type Name as {string}")
	public void enter_work_type_name_as(String sub) throws InterruptedException {
		cwt.enterworktypename(sub);
	}

	@And("save edit click")
	public void save_edit_click() throws InterruptedException {
		cwt.clicksave();
		Thread.sleep(3000);
	}

	@Then("verify the Alert message")
	public void verify_the_alert_message() {
		Assert.assertEquals(cwt.getConfirmationMessage(), "Complete this field.");
		System.out.println("Task created successfully");

		driver.close();
	}
}
