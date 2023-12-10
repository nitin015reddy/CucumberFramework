package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage clickonAppLaunch() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(@class,'slds-icon-waffle')]")).click();
		Thread.sleep(2000);
		return this;
	}

	public HomePage clickOnViewAll() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(@aria-label,'View All Applications')]")).click();
		Thread.sleep(5000);
		return this;
	}

	// enter Tasks in search bar
	public HomePage searchOnAppLaunch(String field) throws InterruptedException {
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search apps or items...')]")).sendKeys(field);
		return this;
	}

	public CreateTasksPage clickTasksLink() throws InterruptedException {
		// click on Tasks link
		WebElement task = driver.findElement(By.xpath("//a[contains(@data-label,'Tasks')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", task);
		Thread.sleep(4000);
		return new CreateTasksPage(driver);
	}

	public CreateWorkTypePage clickWorkTypesLink() throws InterruptedException {
		// click on work types link
		WebElement worktype = driver.findElement(By.xpath("//a[contains(@data-label,'Work Types')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", worktype);
		Thread.sleep(4000);
		return new CreateWorkTypePage(driver);

	}
	
	public CreateLeadsPage clickSales() throws InterruptedException {
		// click on sales link
		driver.findElement(By.xpath("//p[(text()='Sales')]")).click();
		Thread.sleep(4000);
		return new CreateLeadsPage(driver);
	}
	
	public OppurtunityPage clickSalesop() throws InterruptedException {
		// click on sales link
		driver.findElement(By.xpath("//p[(text()='Sales')]")).click();
		Thread.sleep(4000);
		return new OppurtunityPage(driver);
	}

}