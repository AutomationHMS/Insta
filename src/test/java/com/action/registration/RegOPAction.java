package com.action.registration;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.action.UserLoginAction;
import com.screen.HomePage;
import com.screen.registration.RegOPPage;

public class RegOPAction extends UserLoginAction {
	
	@Test
	public void testRegOP() throws InterruptedException {
		//userLogin(1);
		HomePage hp = new HomePage(driver);
		hp.goToScreen("Registration", "OP Registration");
		RegOPPage rop = new RegOPPage(driver);
		hp.logOut();
		rop.registerPatient("Mr.", "Vinay Kumar", "12345678", "14", "Years", "Male", "American", "Yes", "Bill Later", "VRP1", "Bulbin", "Consultation GP-(9)");
		Assert.assertEquals("Registration Success" , "Registration Success");
	}
}