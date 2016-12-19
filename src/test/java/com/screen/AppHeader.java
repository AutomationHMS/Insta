package com.screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppHeader {
	WebDriver driver;
	
	public AppHeader(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//img[@title='Logout']")
	protected WebElement logOut;
	
	@FindBy(xpath=".//img[@class='homeImg']")
	protected WebElement homeButton;
	
	@FindBy(xpath=".//img[@class='menuScrollerImgdown'")
	protected WebElement scrollHeaderDowm;
	
	@FindBy(xpath=".//img[@class='menuScrollerImgup'")
	protected WebElement scrollHeaderUp;
	
	public void goToScreen(String tabName, String screenName) {
		driver.findElement(By.xpath(".//a[text()='"+tabName+"']")).click();
		driver.findElement(By.xpath(".//a[text()='"+tabName+"']/..//a[text()='"+screenName+"']")).click();
	}
	
	public void logOut() {
		logOut.click();
		//driver.quit();
	}
	
	public void goToHome() {
		homeButton.click();
	}
}
