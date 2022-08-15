package com.juaracoding.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.demoqa.drivers.DriverSingleton;

public class RegistrasiPages {
	
	private WebDriver driver;
	
	//membuat constractur page factory registrasi pages
	public RegistrasiPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//membuat objek menggunakan xpath
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement regisUsername;
	
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement regisEmail;
	
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement regisPassword;

	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnRegister;
	
	//skenario
	public void register(String regisUsername, String regisEmail, String regisPassword) {
		this.regisUsername.sendKeys(regisUsername);
		this.regisEmail.sendKeys(regisEmail);
		this.regisPassword.sendKeys(regisPassword);
		btnRegister.click();
	}
}
