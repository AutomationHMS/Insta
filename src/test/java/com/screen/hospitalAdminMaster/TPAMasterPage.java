package com.screen.hospitalAdminMaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.screen.AppHeader;

public class TPAMasterPage extends AppHeader{
	
	WebDriver driver;
	
	@FindBy(id="tpa_name")
	private WebElement tpaSearch;
	
	@FindBy(id="Search")
	private WebElement searchButton;
	
	@FindBy(linkText="Add New TPA/Sponsor")
	private WebElement addNewTpa;
	
	public TPAMasterPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addNewTPA(String tpaName, String country, String state, String city) {
		addNewTpa.click();
		AddTPAPage ant = new AddTPAPage(driver);
		ant.createNewTPA(tpaName,country,state,city);
	}

}
