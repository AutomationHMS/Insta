package com.screen.hospitalAdminMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.screen.AppHeader;

public class InsurancePlanMasterPage extends AppHeader{

	WebDriver driver;
	
	public InsurancePlanMasterPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="plan_name")
	private WebElement planName;
	
	@FindBy(id="Search")
	private WebElement searchBtn;
	
	@FindBy(linkText="Add New Plan")
	private WebElement addNewPlan;
	
	public void addInsurancePlan(String pName, String rp, String iName, String nType, String ipApp, String opApp) {
		addNewPlan.click();
		AddInsurancePlanPage aip = new AddInsurancePlanPage(driver);
		aip.addInsurPlan(pName,rp,iName,nType,ipApp,opApp);
	}
}
