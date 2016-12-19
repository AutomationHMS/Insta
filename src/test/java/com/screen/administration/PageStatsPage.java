package com.screen.administration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.screen.AppHeader;

public class PageStatsPage extends AppHeader {
	
	WebDriver driver;
	
	public PageStatsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//input[@type='submit']")
	private WebElement saveBtn;
	
	public void savePageStat() {
		saveBtn.click();
	}
}
