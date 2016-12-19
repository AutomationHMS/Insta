package com.screen.hospitalAdminMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.screen.AppHeader;

public class AddInsurancePlanPage extends AppHeader {
	
	WebDriver driver;
	
	public AddInsurancePlanPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="plan_name")
	private WebElement planName;
	
	@FindBy(name="default_rate_plan")
	private WebElement drp;
	
	@FindBy(name="insurance_co_id")
	private WebElement insCompId;
	
	@FindBy(xpath=".//button[@type='submit']")
	private WebElement saveBtn;
	
	public void addInsurPlan(String pName, String rp, String iName, String nType, String ipApp, String opApp) {
		
	}
}
