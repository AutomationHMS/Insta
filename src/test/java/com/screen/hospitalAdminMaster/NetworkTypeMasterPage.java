package com.screen.hospitalAdminMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.screen.AppHeader;

public class NetworkTypeMasterPage extends AppHeader {

	WebDriver driver;
	
	public NetworkTypeMasterPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="insu_comp_tbox")
	private WebElement insuCompName;
	
	@FindBy(id="Search")
	private WebElement searchBtn;
	
	@FindBy(linkText="Add New Network/Plan Type")
	private WebElement addNetworkType;
	
	public void addNetworkType(String planTypeName, String insCompName, String status) {
		addNetworkType.click();
		AddInsurancePlanTypeDetailsPage aiptd = new AddInsurancePlanTypeDetailsPage(driver);
		aiptd.addNetworkType(planTypeName,insCompName,status);
	}

}
