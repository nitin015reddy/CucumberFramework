package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateLeadsPage {

	private WebDriver driver;
	
	public CreateLeadsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public CreateLeadsPage clickLeads() throws InterruptedException {
		// click on work types link
		System.out.println("Click on Leads tab");
		WebElement leads = driver.findElement(By.xpath("//span[(text()='Leads')][1]"));	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", leads);
		Thread.sleep(5000);
		return this;
	}
	

	public CreateLeadsPage clickNew() throws InterruptedException {
		// click on new button on leads page
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		Thread.sleep(3000);
		return this;
	}
	
	public CreateLeadsPage salutation() throws InterruptedException {
	
		// click on salutation dropdown and select value
				driver.findElement(By.xpath("//button[contains(@aria-label,'Salutation')]")).click();
				driver.findElement(By.xpath("//span[contains(@title,'Mr.')]")).click();
				Thread.sleep(3000);
		Thread.sleep(3000);
		return this;
	}
	
	public CreateLeadsPage enterFirstName(String fname) throws InterruptedException {
		// Enter first name
				driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys(fname);	
				Thread.sleep(2000);
		return this;
	}
	
	
	public CreateLeadsPage enterLastName(String lname) throws InterruptedException {
		// Enter first name
				driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys(lname);	
				Thread.sleep(2000);
		return this;
	}
	
	public CreateLeadsPage enterCompany(String com) throws InterruptedException {
		// Enter first name
				driver.findElement(By.xpath("//input[contains(@name,'Company')]")).sendKeys(com);	
				Thread.sleep(2000);
		return this;
	}
	
	public CreateLeadsPage status() throws InterruptedException {
		// Select status 
		WebElement elem = driver.findElement(By.xpath("//button[contains(@aria-label,'Open - Not')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", elem);
		// click on lead status dropdown and select value
		elem.click();
		driver.findElement(By.xpath("//span/span[contains(@title,'Working - Contacted')]")).click();
		Thread.sleep(1000);
		return this;
	}
	
	
	
	public CreateLeadsPage save() throws InterruptedException {
		// click on Save
				driver.findElement(By.xpath("//button[contains(@name,'SaveEdit')]")).click();
				Thread.sleep(4000);
				System.out.println("created new lead");
		return this;
	}
	
	public String getConfirmationMessage() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//div[contains(@title,'Lead')]")).getText();
	}
	
}
