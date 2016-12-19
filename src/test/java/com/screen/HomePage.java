package com.screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AppHeader {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goToScreen(String tabName, String screenName) {
		driver.findElement(By.xpath(".//span[contains(text(),'"+tabName+"')]")).click();
		driver.findElement(By.xpath(".//span[contains(text(),'"+tabName+"')]/../..//a[text()='"+screenName+"']")).click();
	}
}
