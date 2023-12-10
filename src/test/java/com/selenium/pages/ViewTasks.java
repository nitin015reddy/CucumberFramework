package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewTasks {
	private WebDriver driver;

	public ViewTasks(WebDriver driver) {
		this.driver = driver;
	}

	public String getConfirmationMessage() {
		return driver.findElement(By.xpath("//div[contains(@title,'Bootcamp')]")).getText();
	       //Assertion
		// verify task message created successfully			

}
}
// 

//return driver.findElement(By.xpath()).getText();