package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesatCromeBrowser {
 static String app_url = "http://www.google.co.in";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//BrowserDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(app_url);
		
		
	}

}
