package com.action;

import java.sql.SQLException;
import org.testng.annotations.Test;

import com.libraries.LaunchBrowser;
import com.screen.UserLoginPage;

public class UserLoginAction extends LaunchBrowser {
	
	@Test
	/* Test Case ID : 1
	 * Verify able to login with InstaAdmin user
	 */
	public void userLogin() {
		int cNo=1;
		UserLoginPage lp = new UserLoginPage(driver);
		rs = r.getData("logindata",cNo);
		try {
			if(rs.next())	lp.userLogin(cNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	/* Test Case ID :
	 * Verify user is forced to change password in first login
	 */
	public void forceChagePassword() {
		//userLogin(1);
		
	}
}
