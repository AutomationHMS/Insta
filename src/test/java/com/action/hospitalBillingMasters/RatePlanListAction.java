package com.action.hospitalBillingMasters;

import org.testng.annotations.Test;

import com.action.UserLoginAction;
import com.screen.HomePage;
import com.screen.hospitalBillingMasters.NewRatePlanPage;
import com.screen.hospitalBillingMasters.RatePlanListPage;

public class RatePlanListAction extends UserLoginAction {

	@Test
	public void cRole() throws InterruptedException {
		//userLogin(1);
		HomePage hp = new HomePage(driver);
		hp.goToScreen("Hospital Billing Masters", "Rate Plans");
		RatePlanListPage rp = new RatePlanListPage(driver);
		rp.createNewRatePlan();
		NewRatePlanPage n = new NewRatePlanPage(driver);
		//n.saveRatePlan("TestRP", "Rate No Discount",1);
	}
	
	
}
