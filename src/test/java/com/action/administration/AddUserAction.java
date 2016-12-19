package com.action.administration;

import org.testng.annotations.Test;

import com.action.UserLoginAction;
import com.screen.HomePage;
import com.screen.administration.AddUserPage;
import com.screen.administration.RolesAndUsersPage;

public class AddUserAction extends UserLoginAction {
	
	@Test
	public void cUser() throws InterruptedException {
		//userLogin(1);
		HomePage hp = new HomePage(driver);
		hp.goToScreen("Administration", "Roles and Users");
		RolesAndUsersPage r = new RolesAndUsersPage(driver);
		r.createNewUser();
		AddUserPage up =  new AddUserPage(driver);
		up.createUser(xl.getCellValue("src/test/resources/Data.xls","Users",1,0),
				      xl.getCellValue("src/test/resources/Data.xls","Users",1,1),
				      xl.getCellValue("src/test/resources/Data.xls","Users",1,2),
				      xl.getCellValue("src/test/resources/Data.xls","Users",1,3),
				      xl.getCellValue("src/test/resources/Data.xls","Users",1,9),
				      xl.getCellValue("src/test/resources/Data.xls","Users",1,11));
	}
}