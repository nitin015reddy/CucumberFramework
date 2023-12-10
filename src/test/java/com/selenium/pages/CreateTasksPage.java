package com.selenium.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class CreateTasksPage {
	private WebDriver driver;

	public CreateTasksPage(WebDriver driver) {
		this.driver = driver;
	}

	public CreateTasksPage clickDropdown() throws InterruptedException {
		// click on drop down and
		driver.findElement(By.xpath("//a[contains(@title,'Show one more action')]")).click();
		return this;
	}

	public CreateTasksPage clickNew() throws InterruptedException {
		// click on new task
		driver.findElement(By.xpath("//a[contains(@title,'New Task')]")).click();
		Thread.sleep(3000);
		return this;
	}
	
	public CreateTasksPage enterSubject(String sub) throws InterruptedException {
		// Enter subject as "Bootcamp"
				driver.findElement(By.xpath("//input[contains(@class,'slds-combobox__input slds-input')]")).sendKeys(sub);
				Thread.sleep(2000);
		return this;
	}
	
	
	public CreateTasksPage selectstatus() throws InterruptedException {
		// Select status as 'Waiting on someone else'
				driver.findElement(By.xpath("//div/a[contains(text(),'Not Started')]")).click();
				driver.findElement(By.xpath("//a[contains(@title,'Waiting on someone else')]")).click();
		return this;
	}
	
	
	public ViewTasks clicksave() throws InterruptedException {
		// click on Save
				driver.findElement(By.xpath("//div/button[3][contains(@title,'Save')]")).click();
				Thread.sleep(4000);
		return new ViewTasks(driver);
	}
	
	

}
