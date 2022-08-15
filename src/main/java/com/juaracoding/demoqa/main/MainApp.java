package com.juaracoding.demoqa.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.demoqa.drivers.DriverSingleton;
import com.juaracoding.demoqa.pages.HomePages;
import com.juaracoding.demoqa.pages.LoginPages;
import com.juaracoding.demoqa.pages.RegistrasiPages;
import com.juaracoding.demoqa.pages.UserLoginPages;

public class MainApp {

	public static void main(String[] args) {
		
		//memanggil web browser
		//misalnya chrome
		DriverSingleton.getInstance("Chrome");
		WebDriver driver = DriverSingleton.getDriver();
		
		//membuat variavel yang menampung url
		String url = "https://shop.demoqa.com/";
		driver.get(url);
		
		//mendapatkan judul diconsole
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		//Home Pages
		HomePages homepages = new HomePages();
		homepages.home();
		
		js.executeScript("window.scrollBy(0,900)", "");
		
		//Registrasi Pages
		RegistrasiPages regispages = new RegistrasiPages();
		regispages.register("erbinaselvia14", "erbinaselvia14@gmail.com", "Admin@12345");
		
		//Login User Pages
		UserLoginPages loginpages = new UserLoginPages();
		loginpages.loginUser("erbinaselvia14","Admin@12345");
		
		delay(10);
		driver.quit();

	}
	
	static void delay(int detik){
		try {
			Thread.sleep(1000*detik);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
