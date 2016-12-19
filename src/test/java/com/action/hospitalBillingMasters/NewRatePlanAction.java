package com.action.hospitalBillingMasters;

import java.util.LinkedList;

import org.testng.annotations.Test;

import com.action.UserLoginAction;
import com.screen.HomePage;
import com.screen.hospitalBillingMasters.NewRatePlanPage;
import com.screen.hospitalBillingMasters.RatePlanListPage;

public class NewRatePlanAction extends UserLoginAction {
	
	@Test
	public void cRole() throws InterruptedException {
		//userLogin(1);
		HomePage hp = new HomePage(driver);
		hp.goToScreen("Hospital Billing Masters", "Rate Plans");
		RatePlanListPage rp = new RatePlanListPage(driver);
		rp.createNewRatePlan();
		NewRatePlanPage n = new NewRatePlanPage(driver);
		n.saveRatePlan(xl.getCellValue("src/test/resources/Data.xls","RatePlan",1,1),
				       xl.getCellValue("src/test/resources/Data.xls","RatePlan",1,2),getBaseRateSheets(3),3);
	}
	
	LinkedList<BaseRateSheet> getBaseRateSheets(int n) {
		LinkedList<BaseRateSheet> bRs = new LinkedList<BaseRateSheet>();
		for(int i=0;i<n;i++){
			bRs.add(new BaseRateSheet(xl.getCellValue("src/test/resources/Data.xls","BaseRateSheet",i+1,1),
					                  xl.getCellValue("src/test/resources/Data.xls","BaseRateSheet",i+1,2),
					                  xl.getCellValue("src/test/resources/Data.xls","BaseRateSheet",i+1,3),
					                  xl.getCellValue("src/test/resources/Data.xls","BaseRateSheet",i+1,4),
					                  xl.getCellValue("src/test/resources/Data.xls","BaseRateSheet",i+1,5)));
		}
		return bRs;
	}
}
