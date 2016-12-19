package com.screen.hospitalAdminMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.screen.AppHeader;

public class InsuranceCompanyMasterPage extends AppHeader {

	WebDriver driver;
	
	@FindBy(name="insurance_co_name")
	private WebElement insuCompSearch;
	
	@FindBy(id="Search")
	private WebElement searchButton;
	
	@FindBy(linkText="Add New Insurance Company")
	private WebElement addNewInsuComp;
	
	public InsuranceCompanyMasterPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addNewInsuranceCompany(String insuranceName) {
		addNewInsuComp.click();
		AddInsuranceCompanyPage ant = new AddInsuranceCompanyPage(driver);
		ant.createInsuranceCompany(insuranceName);
	}
	
	public void addNewInsuranceCompany(String insuranceName, String rp) {
		addNewInsuComp.click();
		AddInsuranceCompanyPage ant = new AddInsuranceCompanyPage(driver);
		ant.createInsuranceCompany(insuranceName,rp);
	}

}
