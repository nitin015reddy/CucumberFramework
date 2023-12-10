package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OppurtunityPage {

	
	private WebDriver driver;

	public OppurtunityPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public OppurtunityPage clickopportunity() throws InterruptedException {
		// click on opportunity tab
		System.out.println("Click on Opportunity tab");
		WebElement opportunity = driver.findElement(By.xpath("//span[(text()='Opportunities')][1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", opportunity);
		Thread.sleep(5000);
		return this;
	}
	
	
	public OppurtunityPage clickTableView() throws InterruptedException {
		System.out.println("Click on Table view");
		driver.findElement(By.xpath("//button[contains(@title,'Select list display')]")).click();
		driver.findElement(By.xpath("//a/span[text()='Table']")).click();
		Thread.sleep(2000);		
		return this;
	}
	
	

	
	
}
