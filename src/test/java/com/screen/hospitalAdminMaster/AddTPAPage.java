package com.screen.hospitalAdminMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.screen.AppHeader;

public class AddTPAPage extends AppHeader {

	WebDriver driver;
	
	@FindBy(name="tpa_name")
	private WebElement spName;
	
	@FindBy(name="country")
	private WebElement cntry;
	
	@FindBy(name="state")
	private WebElement st;
	
	@FindBy(name="city")
	private WebElement cty;
	
	@FindBy(xpath=".//button[@type='submit']")
	private WebElement saveBtn;
	
	public AddTPAPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createNewTPA(String tpaName, String country, String state, String city) {
		spName.sendKeys(tpaName);
		cntry.sendKeys(country);
		st.sendKeys(state);
		cty.sendKeys(city);
		saveBtn.click();
	}
	
	
}
