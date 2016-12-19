package com.action;

import org.testng.annotations.Test;

import com.screen.HomePage;
import com.screen.UserLoginPage;
import com.libraries.LaunchBrowser;

public class HomePageAction extends LaunchBrowser {
	
	@Test
	/*Test Case Id :
	Verify able to load OP registration screen*/
	public void testGoToScreen() {
		UserLoginPage lp = new UserLoginPage(driver);
		lp.userLogin(1);
		HomePage hp = new HomePage(driver);
		hp.goToScreen("Registration", "OP Registration");
	}
}
