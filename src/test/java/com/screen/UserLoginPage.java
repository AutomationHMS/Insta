package com.screen;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libraries.JDBConnect;

public class UserLoginPage {
	WebDriver driver;
	protected JDBConnect r = new JDBConnect();
	protected ResultSet rs;
	
	public UserLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="hospital")
	private WebElement hospitalName;
	
	@FindBy(id="userId")
	private WebElement userNameTextBox;
	
	@FindBy(id="password")
	private WebElement pwdTextBox;
	
	@FindBy(id="button")
	private WebElement submitButton;
	
	/*public void login(String hospName,String usrName,String pwd) {
		hospitalName.clear();
		hospitalName.sendKeys(hospName);
		userNameTextBox.sendKeys(usrName);
		pwdTextBox.sendKeys(pwd);
		submitButton.click();
	}*/
	
	public void userLogin(int cNo) {
		rs = r.getData("logindata",cNo);
		try {
			if(rs.next()) {
				//login(rs.getString("hospital"),rs.getString("username"),rs.getString("password"));
				hospitalName.clear();
				hospitalName.sendKeys(rs.getString("hospital"));
				userNameTextBox.sendKeys(rs.getString("username"));
				pwdTextBox.sendKeys(rs.getString("password"));
				submitButton.click();
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
