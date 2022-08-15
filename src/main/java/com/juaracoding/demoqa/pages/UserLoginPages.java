package com.juaracoding.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.demoqa.drivers.DriverSingleton;

public class UserLoginPages {
	
	private WebDriver driver;
	
	//membuat constractur page factory login pages
	public UserLoginPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//membuat objek menggunakan xpath
		@FindBy(xpath= "//input[@id='user_login']")
		private WebElement usernameUser;
		
		@FindBy(xpath= "//input[@id='user_pass']")
		private WebElement passwordUser;
		
		@FindBy(xpath= "//input[@id='wp-submit']")
		private WebElement btnLoginUser;
		
	//method scenario
	//parameter
	public void loginUser(String usernameUser, String passwordUser) {
		//step		
		this.usernameUser.sendKeys(usernameUser);
		this.passwordUser.sendKeys(passwordUser);
		btnLoginUser.click();;
	}
}
