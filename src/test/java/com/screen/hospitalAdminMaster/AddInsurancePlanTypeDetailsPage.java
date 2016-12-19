package com.screen.hospitalAdminMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.screen.AppHeader;

public class AddInsurancePlanTypeDetailsPage extends AppHeader{

	WebDriver driver;
	
	public AddInsurancePlanTypeDetailsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="category_name")
	WebElement netTypeName;
	
	@FindBy(id="insurance_co_id")
	WebElement insCompName;
	
	@FindBy(name="status")
	WebElement status;
	
	@FindBy(xpath=".//button[@type='submit']")
	private WebElement saveBtn;
	
	public void addNetworkType(String planTypeName, String insCompanyName, String state) {
		netTypeName.sendKeys(planTypeName);
		Select icn = new Select(insCompName);
		icn.selectByVisibleText(insCompanyName);
		Select st = new Select(status);
		st.selectByVisibleText(state);
		saveBtn.click();
	}
}
