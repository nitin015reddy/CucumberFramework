package com.selenium.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUserName(String uname) throws IOException {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;

	}

	public LoginPage enterPassword(String pwd) throws IOException {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;

	}

	public HomePage clickLoginButton() {
		driver.findElement(By.id("Login")).click();
		return new HomePage(driver);

	}

}
