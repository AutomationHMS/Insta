package com.screen.hospitalAdminMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.screen.AppHeader;

public class AddInsuranceCompanyPage extends AppHeader{

	WebDriver driver;
	
	public AddInsuranceCompanyPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="insurance_co_name")
	private WebElement insuranceComName;
	
	@FindBy(name="default_rate_plan")
	private WebElement defaultRatePlan;
	
	@FindBy(xpath=".//button[@type='submit']")
	private WebElement saveBtn;

	public void createInsuranceCompany(String insuranceName) {
		insuranceComName.sendKeys(insuranceName);
		saveBtn.click();
	}
	
	public void createInsuranceCompany(String insuranceName, String rp) {
		insuranceComName.sendKeys(insuranceName);
		Select ratePlan = new Select(defaultRatePlan);
		ratePlan.selectByVisibleText(rp);
		saveBtn.click();
	}
}
