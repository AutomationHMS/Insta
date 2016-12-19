package com.screen.administration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.screen.AppHeader;

public class RolesAndUsersPage extends AppHeader {
	WebDriver driver;
	
	public RolesAndUsersPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create New Role")
	private WebElement createRole;
	
	@FindBy(linkText="Create New User")
	private WebElement createUser;
	
	public void createNewRole() throws InterruptedException {
		createRole.click();
	}
	
	public void createNewUser() throws InterruptedException {
		createUser.click();
	}

}