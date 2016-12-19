package com.screen.administration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libraries.JDBConnect;
import com.screen.AppHeader;

public class RolePage extends AppHeader {
	WebDriver driver;
	protected JDBConnect r = new JDBConnect();
	protected ResultSet rs;
	
	public RolePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="name")
	private WebElement roleName;
	
	@FindBy(xpath=".//button[@type='button']")
	private WebElement saveBtn;
	
	public void saveRole(String rName,LinkedList<String> sR,LinkedList<ActionRightPair> aR) {
		roleName.sendKeys(rName);
		LinkedList<String> rs = sR;
		ListIterator<String> itr=rs.listIterator();
		while(itr.hasNext()) {
			driver.findElement(By.xpath(".//span[contains(text(),'"+itr.next()+"')]")).click();
		}
		LinkedList<ActionRightPair> ra = aR;
		ListIterator<ActionRightPair> itr1=ra.listIterator();
		ActionRightPair a;
		while(itr1.hasNext()) {
			a=itr1.next();
			driver.findElement(By.xpath(".//td[contains(text(),'"+a.aRN+"')]/../td/input[@type='radio'][@value='"+a.aRV+"']")).click();
		}
		saveBtn.click();
	}
	
	public LinkedList<String> getScreenRightValues(int cNo) throws SQLException {
		LinkedList<String> sRP = new LinkedList<String>();
		rs = r.getData("userrolescreenrights",cNo);
		while(rs.next()) {
			if(rs.getString("patientsearch").equals("Y"))		
				sRP.add("Patient Search");
			if(rs.getString("registration").equals("Y"))			
				sRP.add("Registration");
			if(rs.getString("billing").equals("Y"))				
				sRP.add("Billing");
			if(rs.getString("dischargesummary").equals("Y"))		
				sRP.add("Discharge Summary");
			if(rs.getString("canceractivities").equals("Y"))		
				sRP.add("Cancer Activities");
			if(rs.getString("payments").equals("Y"))				
				sRP.add("Payments");
			if(rs.getString("services").equals("Y"))				
				sRP.add("Services");
			if(rs.getString("otservices").equals("Y"))				
				sRP.add("OT Services");
			if(rs.getString("otmanagement").equals("Y"))			
				sRP.add("OT Management");
			if(rs.getString("laboratory").equals("Y"))				
				sRP.add("Laboratory");
			if(rs.getString("radiology").equals("Y"))				
				sRP.add("Radiology");
			if(rs.getString("scheduler").equals("Y"))				
				sRP.add("Scheduler");
			if(rs.getString("inpatient").equals("Y"))				
				sRP.add("In Patient");
			if(rs.getString("dialysis").equals("Y"))				
				sRP.add("Dialysis");
			if(rs.getString("clinicaldata").equals("Y"))			
				sRP.add("Clinical Data");
			if(rs.getString("doctorconsultation").equals("Y"))		
				sRP.add("Doctor Consultation");
			if(rs.getString("outpatient").equals("Y"))				
				sRP.add("Out Patient");
			if(rs.getString("medicalrecords").equals("Y"))			
				sRP.add("Medical Records");
			if(rs.getString("salesissues").equals("Y"))			
				sRP.add("Sales / Issues");
			if(rs.getString("procurement").equals("Y"))			
				sRP.add("Procurement");
			if(rs.getString("storemgmt").equals("Y"))				
				sRP.add("Store Mgmt");
			if(rs.getString("insurance").equals("Y"))				
				sRP.add("Insurance");
			if(rs.getString("erxauthorization").equals("Y"))		
				sRP.add("ERx Authorization");
			if(rs.getString("maintcontracts").equals("Y"))			
				sRP.add("Maint. & Contracts");
			if(rs.getString("patientstatsreports").equals("Y"))	
				sRP.add("Patient Stats Reports");
			if(rs.getString("patientfeedbackreports").equals("Y"))	
				sRP.add("Patient Feedback Reports");
			if(rs.getString("rosterreports").equals("Y"))			
				sRP.add("Roster Reports");
			if(rs.getString("cssd").equals("Y"))					
				sRP.add("CSSD");
			if(rs.getString("advancedpackages").equals("Y"))		
				sRP.add("Advanced Packages");
			if(rs.getString("maintcontractsreports").equals("Y"))	
				sRP.add("Maint. & Contracts Reports");
			if(rs.getString("financialreports").equals("Y"))		
				sRP.add("Financial Reports");
			if(rs.getString("billingreports").equals("Y"))			
				sRP.add("Billing Reports");
			if(rs.getString("salesissuesreports").equals("Y"))		
				sRP.add("Sales/Issues Reports");
			if(rs.getString("procurementreports").equals("Y"))		
				sRP.add("Procurement Reports");
			if(rs.getString("storemgmtreports").equals("Y"))		
				sRP.add("Store Mgmt Reports");
			if(rs.getString("diagnosticsreports").equals("Y"))		
				sRP.add("Diagnostics Reports");
			if(rs.getString("patientpackagereports").equals("Y"))	
				sRP.add("Patient Package Reports");
			if(rs.getString("dialysisreports").equals("Y"))		
				sRP.add("Dialysis Reports");
			if(rs.getString("clinicaldatareports").equals("Y"))	
				sRP.add("Clinical Data Reports");
			if(rs.getString("servicereports").equals("Y"))			
				sRP.add("Service Reports");
			if(rs.getString("consultationreports").equals("Y"))	
				sRP.add("Consultation Reports");
			if(rs.getString("schedulerreports").equals("Y"))		
				sRP.add("Scheduler Reports");
			if(rs.getString("otreports").equals("Y"))				
				sRP.add("OT Reports");
			if(rs.getString("bedutilreports").equals("Y"))			
				sRP.add("Bed Util Reports");
			if(rs.getString("dentalreports").equals("Y"))			
				sRP.add("Dental Reports");
			if(rs.getString("wardactivitiesreports").equals("Y"))	
				sRP.add("Ward Activities Reports");
			if(rs.getString("insurancereports").equals("Y"))		
				sRP.add("Insurance Reports");
			if(rs.getString("dietaryreports").equals("Y"))			
				sRP.add("Dietary Reports");
			if(rs.getString("mrdreports").equals("Y"))				
				sRP.add("MRD Reports");
			if(rs.getString("masterreports").equals("Y"))			
				sRP.add("Master Reports");
			if(rs.getString("customreports").equals("Y"))			
				sRP.add("Custom Reports");
			if(rs.getString("favouritereports").equals("Y"))		
				sRP.add("Favourite Reports");
			if(rs.getString("preferences").equals("Y"))			
				sRP.add("Preferences");
			if(rs.getString("billingpreferences").equals("Y"))		
				sRP.add("Billing Preferences");
			if(rs.getString("printtemplates").equals("Y"))			
				sRP.add("Print Templates");
			if(rs.getString("documenttemplates").equals("Y"))		
				sRP.add("Document Templates");
			if(rs.getString("generalmasters").equals("Y"))			
				sRP.add("General Masters");
			if(rs.getString("hospitaladminmasters").equals("Y"))	
				sRP.add("Hospital Admin Masters");
			if(rs.getString("hospitalbillingmasters").equals("Y"))	
				sRP.add("Hospital Billing Masters");
			if(rs.getString("dentalmasters").equals("Y"))			
				sRP.add("Dental Masters");
			if(rs.getString("roster").equals("Y"))					
				sRP.add("Roster");
			if(rs.getString("storesmasters").equals("Y"))			
				sRP.add("Stores Masters");
			if(rs.getString("messagingmasters").equals("Y"))		
				sRP.add("Messaging Masters");
			if(rs.getString("administration").equals("Y"))			
				sRP.add("Administration");
			if(rs.getString("dietary").equals("Y"))				
				sRP.add("Dietary");
			if(rs.getString("patientfeedback").equals("Y"))		
				sRP.add("Patient Feedback");
			if(rs.getString("common").equals("Y"))					
				sRP.add("Common");
		}
		return sRP;
	}
	
	public LinkedList<ActionRightPair> getActionRightValues(int cNo) throws SQLException {
		LinkedList<ActionRightPair> aRP = new LinkedList<ActionRightPair>();
		rs = r.getData("userroleactionrights",cNo);
		while(rs.next()) {
			if(rs.getString("reopen_bill").equals("A"))
				aRP.add(new ActionRightPair("Reopen Bill","A"));
			else	
				aRP.add(new ActionRightPair("Reopen Bill","N"));
			if(rs.getString("direct_billing").equals("A"))
				aRP.add(new ActionRightPair("Direct Billing (without using Order)","A"));
			else	
				aRP.add(new ActionRightPair("Direct Billing (without using Order)","N"));
			if(rs.getString("add_items_to_bill").equals("A"))
				aRP.add(new ActionRightPair("Add Items to Bill/Edit Bill Amounts","A"));
			else	
				aRP.add(new ActionRightPair("Add Items to Bill/Edit Bill Amounts","N"));
			if(rs.getString("create_bill_for_closed_visit").equals("A"))
				aRP.add(new ActionRightPair("Create Bill for Closed Visit","A"));
			else	
				aRP.add(new ActionRightPair("Create Bill for Closed Visit","N"));
			if(rs.getString("cancel_bill").equals("A"))
				aRP.add(new ActionRightPair("Cancel Bill","A"));
			else	
				aRP.add(new ActionRightPair("Cancel Bill","N"));
			if(rs.getString("cancel_items_in_bill").equals("A"))
				aRP.add(new ActionRightPair("Cancel Items in Bill","A"));
			else	
				aRP.add(new ActionRightPair("Cancel Items in Bill","N"));
			if(rs.getString("allow_refunds").equals("A"))
				aRP.add(new ActionRightPair("Allow Refunds","A"));
			else	
				aRP.add(new ActionRightPair("Allow Refunds","N"));
			if(rs.getString("allow_discounts").equals("A"))
				aRP.add(new ActionRightPair("Allow Discounts","A"));
			else	
				aRP.add(new ActionRightPair("Allow Discounts","N"));
			if(rs.getString("allow_all_rate_increase").equals("A"))
				aRP.add(new ActionRightPair("Allow All Rate Increase","A"));
			else	
				aRP.add(new ActionRightPair("Allow All Rate Increase","N"));
			if(rs.getString("allow_all_rate_decrease").equals("A"))
				aRP.add(new ActionRightPair("Allow All Rate Decrease","A"));
			else	
				aRP.add(new ActionRightPair("Allow All Rate Decrease","N"));
			if(rs.getString("view_all_rates_in_order").equals("A"))
				aRP.add(new ActionRightPair("View All Rates in Order/Prescription","A"));
			else	
				aRP.add(new ActionRightPair("View All Rates in Order/Prescription","N"));
			if(rs.getString("view_general_rates_in_order").equals("A"))
				aRP.add(new ActionRightPair("View General Rates in Order/Prescription","A"));
			else	
				aRP.add(new ActionRightPair("View General Rates in Order/Prescription","N"));
			if(rs.getString("allow_back_date").equals("A"))
				aRP.add(new ActionRightPair("Allow Back Date","A"));
			else	
				aRP.add(new ActionRightPair("Allow Back Date","N"));
			if(rs.getString("allow_receipt_back_date").equals("A"))
				aRP.add(new ActionRightPair("Allow Receipt Back Date","A"));
			else	
				aRP.add(new ActionRightPair("Allow Receipt Back Date","N"));
			if(rs.getString("allocate_shift_bed").equals("A"))
				aRP.add(new ActionRightPair("Allocate/Shift Bed","A"));
			else	
				aRP.add(new ActionRightPair("Allocate/Shift Bed","N"));
			if(rs.getString("allow_set_charges_bed_type").equals("A"))
				aRP.add(new ActionRightPair("Allow Set Charged Bed Type","A"));
			else	
				aRP.add(new ActionRightPair("Allow Set Charged Bed Type","N"));
			if(rs.getString("edit_inactive_visit_discharge_summary").equals("A"))
				aRP.add(new ActionRightPair("Edit Inactive Visit Discharge Summary","A"));
			else	
				aRP.add(new ActionRightPair("Edit Inactive Visit Discharge Summary","N"));
			if(rs.getString("edit_reg_first_name").equals("A"))
				aRP.add(new ActionRightPair("Edit Regn. Fields(First Name)","A"));
			else	
				aRP.add(new ActionRightPair("Edit Regn. Fields(First Name)","N"));
			if(rs.getString("edit_reg_custom_fields").equals("A"))
				aRP.add(new ActionRightPair("Edit Regn. Fields(Custom Fields)","A"));
			else	
				aRP.add(new ActionRightPair("Edit Regn. Fields(Custom Fields)","N"));
			if(rs.getString("patient_category_change").equals("A"))
				aRP.add(new ActionRightPair("Patient Category Change","A"));
			else	
				aRP.add(new ActionRightPair("Patient Category Change","N"));
			if(rs.getString("signoff_labser_reports").equals("A"))
				aRP.add(new ActionRightPair("Sign-off Lab / Service Reports","A"));
			else	
				aRP.add(new ActionRightPair("Sign-off Lab / Service Reports","N"));
			if(rs.getString("allow_new_reg").equals("A"))
				aRP.add(new ActionRightPair("Allow New Registration","A"));
			else	
				aRP.add(new ActionRightPair("Allow New Registration","N"));
			if(rs.getString("cancel_test").equals("A"))
				aRP.add(new ActionRightPair("Cancel Test (After Sample Collection)","A"));
			else	
				aRP.add(new ActionRightPair("Cancel Test (After Sample Collection)","N"));
			if(rs.getString("allow_retail_credit_sales").equals("A"))
				aRP.add(new ActionRightPair("Allow Retail Credit Sales","A"));
			else	
				aRP.add(new ActionRightPair("Allow Retail Credit Sales","N"));
			if(rs.getString("allow_max_cost_price_change").equals("A"))
				aRP.add(new ActionRightPair("Allow Max Costprice Change","A"));
			else	
				aRP.add(new ActionRightPair("Allow Max Costprice Change","N"));
			if(rs.getString("show_avble_qty_on_raiseindent").equals("A"))
				aRP.add(new ActionRightPair("Show Avbl Qty On Raise Indent","A"));
			else	
				aRP.add(new ActionRightPair("Show Avbl Qty On Raise Indent","N"));
			if(rs.getString("reopen_codification").equals("A"))
				aRP.add(new ActionRightPair("Reopen Codification","A"));
			else	
				aRP.add(new ActionRightPair("Reopen Codification","N"));
			if(rs.getString("allow_direct_stock_entry").equals("A"))
				aRP.add(new ActionRightPair("Allow Direct Stock Entry","A"));
			else	
				aRP.add(new ActionRightPair("Allow Direct Stock Entry","N"));
			if(rs.getString("user_counter_day_book").equals("A"))
				aRP.add(new ActionRightPair("User / Counter Day Book Access","A"));
			else	
				aRP.add(new ActionRightPair("User / Counter Day Book Access","N"));
			if(rs.getString("edit_receipt_amount").equals("A"))
				aRP.add(new ActionRightPair("Edit Receipt Amounts","A"));
			else	
				aRP.add(new ActionRightPair("Edit Receipt Amounts","N"));
			if(rs.getString("cancel_app").equals("A"))
				aRP.add(new ActionRightPair("Cancel Appointment","A"));
			else	
				aRP.add(new ActionRightPair("Cancel Appointment","N"));
			if(rs.getString("new_bill_for_order").equals("A"))
				aRP.add(new ActionRightPair("New Bill For Order Screen","A"));
			else	
				aRP.add(new ActionRightPair("New Bill For Order Screen","N"));
			if(rs.getString("validate_test_result").equals("A"))
				aRP.add(new ActionRightPair("Validate test results","A"));
			else	
				aRP.add(new ActionRightPair("Validate test results","N"));
			if(rs.getString("revert_signoff").equals("A"))
				aRP.add(new ActionRightPair("Revert Signoff","A"));
			else	
				aRP.add(new ActionRightPair("Revert Signoff","N"));
			if(rs.getString("amend_test_result").equals("A"))
				aRP.add(new ActionRightPair("Amend test results","A"));
			else	
				aRP.add(new ActionRightPair("Amend test results","N"));
			if(rs.getString("amend_score_card_values").equals("A"))
				aRP.add(new ActionRightPair("Amend Score Card Values","A"));
			else	
				aRP.add(new ActionRightPair("Amend Score Card Values","N"));
			if(rs.getString("reopen_cons_after_time_limit").equals("A"))
				aRP.add(new ActionRightPair("Reopen Consultation After Time Limit","A"));
			else	
				aRP.add(new ActionRightPair("Reopen Consultation After Time Limit","N"));
			if(rs.getString("return_ph_item_after_validity").equals("A"))
				aRP.add(new ActionRightPair("Return Pharmacy Items After Validity Days","A"));
			else	
				aRP.add(new ActionRightPair("Return Pharmacy Items After Validity Days","N"));
			if(rs.getString("package_approval").equals("A"))
				aRP.add(new ActionRightPair("Package Approval","A"));
			else	
				aRP.add(new ActionRightPair("Package Approval","N"));
			if(rs.getString("pbm_prescription_finalize").equals("A"))
				aRP.add(new ActionRightPair("PBM Prescription Finalize","A"));
			else	
				aRP.add(new ActionRightPair("PBM Prescription Finalize","N"));
			if(rs.getString("erx_consultation_access").equals("A"))
				aRP.add(new ActionRightPair("ERx Consultation Access","A"));
			else	
				aRP.add(new ActionRightPair("ERx Consultation Access","N"));
			if(rs.getString("erx_dis_medication").equals("A"))
				aRP.add(new ActionRightPair("ERx Dis. Medication Access","A"));
			else	
				aRP.add(new ActionRightPair("ERx Dis. Medication Access","N"));
			if(rs.getString("allow_prior_auth_presc_edit").equals("A"))
				aRP.add(new ActionRightPair("Allow Prior Auth Prescription Edit","A"));
			else	
				aRP.add(new ActionRightPair("Allow Prior Auth Prescription Edit","N"));
			if(rs.getString("reg_charge_appl").equals("A"))
				aRP.add(new ActionRightPair("Registration Charge Applicability","A"));
			else	
				aRP.add(new ActionRightPair("Registration Charge Applicability","N"));
			if(rs.getString("patient_header_edit").equals("A"))
				aRP.add(new ActionRightPair("Patient Header Editability","A"));
			else	
				aRP.add(new ActionRightPair("Patient Header Editability","N"));
			if(rs.getString("allow_back_date_app").equals("A"))
				aRP.add(new ActionRightPair("Allow Back Dated Appointments","A"));
			else	
				aRP.add(new ActionRightPair("Allow Back Dated Appointments","N"));
			if(rs.getString("del_pat_gen_doc").equals("A"))
				aRP.add(new ActionRightPair("Delete Patient General Documents","A"));
			else	
				aRP.add(new ActionRightPair("Delete Patient General Documents","N"));
			if(rs.getString("allow_denial_accept").equals("A"))
				aRP.add(new ActionRightPair("Allow Denial Acceptance","A"));
			else	
				aRP.add(new ActionRightPair("Allow Denial Acceptance","N"));
			if(rs.getString("val_discharge_summary_report").equals("A"))
				aRP.add(new ActionRightPair("Validate Discharge Summary Report","A"));
			else	
				aRP.add(new ActionRightPair("Validate Discharge Summary Report","N"));
			if(rs.getString("del_discharge_summary_report").equals("A"))
				aRP.add(new ActionRightPair("Delete Discharge Summary Report","A"));
			else	
				aRP.add(new ActionRightPair("Delete Discharge Summary Report","N"));
			if(rs.getString("reopen_discharge_summary_report").equals("A"))
				aRP.add(new ActionRightPair("Reopen Discharge Summary Report","A"));
			else	
				aRP.add(new ActionRightPair("Reopen Discharge Summary Report","N"));
			if(rs.getString("signoff_blood_trans").equals("A"))
				aRP.add(new ActionRightPair("Sign-off Blood Transfusion Investigation Reports","A"));
			else	
				aRP.add(new ActionRightPair("Sign-off Blood Transfusion Investigation Reports","N"));
			if(rs.getString("allow_view_off_clinical_alerts").equals("A"))
				aRP.add(new ActionRightPair("Allow View Of Clinical Alerts","A"));
			else	
				aRP.add(new ActionRightPair("Allow View Of Clinical Alerts","N"));
			if(rs.getString("birth_reg").equals("A"))
				aRP.add(new ActionRightPair("Birth Register","A"));
			else	
				aRP.add(new ActionRightPair("Birth Register","N"));
		}
		return aRP;
	}

	
	/*public void saveRole(String rName,ScreenRightPair[] sR,ActionRightPair[] aR) {
		roleName.sendKeys(rName);
		for(int i=0;i<67;i++) {
			if (sR[i].sRV=="Yes")
				driver.findElement(By.xpath(".//span[contains(text(),'"+sR[i].sRN+"')]")).click();
		}
		for(int j=0;j<54;j++) {
			driver.findElement(By.xpath(".//td[contains(text(),'"+aR[j].aRN+"')]/../td/input[@type='radio'][@value='"+aR[j].aRV+"']")).click();
		}
		saveBtn.click();
	}*/
}