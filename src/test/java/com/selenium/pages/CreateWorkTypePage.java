package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateWorkTypePage {

	private WebDriver driver;

	public CreateWorkTypePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public CreateWorkTypePage New() throws InterruptedException {
		// click on new 
		driver.findElement(By.xpath("//div[(text()='New')]")).click();
		Thread.sleep(3000);
		return this;
	}
	
	public CreateWorkTypePage enterworktypename(String sub) throws InterruptedException {
		// Enter subject as "Bootcamp"
				driver.findElement(By.xpath("//input[contains(@maxlength,'255')]")).sendKeys(sub);
				Thread.sleep(2000);
		return this;
	}
	
	public CreateWorkTypePage clicksave() throws InterruptedException {
		// click on Save
				driver.findElement(By.xpath("//div/button[3][contains(@title,'Save')]")).click();
				Thread.sleep(4000);
				System.out.println("Saved new worktype");
		return this;		

	}


	public String getConfirmationMessage() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//li[contains(text(),'Complete this field.')]")).getText();
	}
}
