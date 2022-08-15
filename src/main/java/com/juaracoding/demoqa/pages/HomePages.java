package com.juaracoding.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.demoqa.drivers.DriverSingleton;

public class HomePages {

	private WebDriver driver;
	
	//membuat constractur page factory home pages
	public HomePages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//membuat objek menggunakan xpath
	@FindBy(xpath = "//a[normalize-space()='My Account']")
	private WebElement btnMyAccount;
	
	//method skenario
	public void home() {
		btnMyAccount.click();
	}
}
