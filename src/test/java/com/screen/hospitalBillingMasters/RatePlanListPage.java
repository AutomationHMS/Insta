package com.screen.hospitalBillingMasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.screen.AppHeader;

public class RatePlanListPage extends AppHeader {
	WebDriver driver;
	
	public RatePlanListPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Add New Rate Plan")
	private WebElement addNewRp;
	
	public void createNewRatePlan() throws InterruptedException {
		addNewRp.click();
	}
}
