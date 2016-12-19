package com.action.administration;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.libraries.LaunchBrowser;
import com.screen.HomePage;
import com.screen.UserLoginPage;
import com.screen.administration.PageStatsPage;
import com.screen.administration.RolePage;
import com.screen.administration.RolesAndUsersPage;

public class AddRoleAction extends LaunchBrowser {
	
	@Test
	/* Test Case Id : 4
	 * Verify able to create user role
	 */
	public void createRole() throws SQLException, InterruptedException {
		int cNo=4;
		UserLoginPage l = new UserLoginPage(driver);
		l.userLogin(cNo);
		HomePage hp = new HomePage(driver);
		hp.goToScreen("Administration", "Roles and Users");
		RolesAndUsersPage ru = new RolesAndUsersPage(driver);
		ru.createNewRole();
		RolePage rp =  new RolePage(driver);
		rs = r.getData("userrolescreenrights",cNo);
		while(rs.next())	rp.saveRole(rs.getString("rolename"),rp.getScreenRightValues(cNo),rp.getActionRightValues(cNo));
		if(driver.findElements(By.xpath(".//div[contains(text(),'This RoleName Already Exists')]")).size() > 0)
			r.setResult(cNo,getBuild(),"Fail","Role Exists");
		else {
			PageStatsPage ps = new PageStatsPage(driver);
			ps.savePageStat();
			r.setResult(cNo,getBuild(),"Pass","");
		}
		Assert.assertEquals("Roles and Users - Insta HMS",driver.getTitle());
	}
}
