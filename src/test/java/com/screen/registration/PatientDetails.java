package com.screen.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.libraries.XlLibrary;
import com.screen.AppHeader;

public class PatientDetails extends AppHeader {
	WebDriver driver;
	protected XlLibrary xl = new XlLibrary();
	
	public PatientDetails(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="regTypenew")
	protected WebElement newPatient;
	
	@FindBy(id="regTyperegd")
	protected WebElement mrNo;
	
	@FindBy(id="salutation")
	protected WebElement salutation;
	
	@FindBy(id="patient_name")
	protected WebElement patientFirstName;
	
	@FindBy(id="middle_name")
	protected WebElement patientMiddleName;
	
	@FindBy(id="last_name")
	protected WebElement patientLastName;
	
	@FindBy(id="patient_phone")
	protected WebElement patientPhone;
	
	@FindBy(id="dobDay")
	protected WebElement day;
	
	@FindBy(id="dobMonth")
	protected WebElement month;
	
	@FindBy(id="dobYear")
	protected WebElement year;
	
	@FindBy(id="age")
	protected WebElement patientAge;
	
	@FindBy(id="ageIn")
	protected WebElement ageIn;
	
	@FindBy(id="patient_gender")
	protected WebElement gender;
	
	@FindBy(id="patient_phone2")
	protected WebElement patientPhone2;
	
	@FindBy(id="patient_category_id")
	protected WebElement patientCategory;
	
	@FindBy(id="bill_type")
	protected WebElement billType;
	
	@FindBy(id="organization")
	protected WebElement ratePlan;
	
	@FindBy(id="custom_list1_value")
	protected WebElement customList1;
	
	@FindBy(id="custom_list2_value")
	protected WebElement customList2;
	
	@FindBy(id="custom_list3_value")
	protected WebElement customList3;
	
	@FindBy(id="custom_list4_value")
	protected WebElement customList4;
	
	@FindBy(id="custom_list5_value")
	protected WebElement customList5;
	
	@FindBy(id="custom_list6_value")
	protected WebElement customList6;
	
	@FindBy(id="custom_list7_value")
	protected WebElement customList7;
	
	@FindBy(id="custom_list8_value")
	protected WebElement customList8;
	
	@FindBy(id="custom_list9_value")
	protected WebElement customList9;
	
	@FindBy(id="primary_sponsor")
	protected WebElement priSponsor;
	
	@FindBy(id="primary_insurance_co")
	protected WebElement priInsCompany;
	
	@FindBy(id="primary_sponsor_id")
	protected WebElement priTpa;
	
	@FindBy(id="primary_insurance_approval")
	protected WebElement priApprovalLimit;
	
	@FindBy(id="primary_plan_type")
	protected WebElement priNetworkPlan;
	
	@FindBy(id="primary_plan_id")
	protected WebElement priInsPlan;
	
	@FindBy(id="primary_member_id")
	protected WebElement priMembershipID;
	
	@FindBy(xpath=".//*[@id='primary_policy_validity_start']/../img")
	protected WebElement priPoliValStart;
	
	@FindBy(xpath=".//*[@id='primary_policy_validity_end']/../img")
	protected WebElement priPoliValEnd;
	
	@FindBy(id="primary_policy_number")
	protected WebElement priPolicyNo;
	
	@FindBy(id="primary_policy_holder_name")
	protected WebElement priPolicyHolder;
	
	@FindBy(id="primary_patient_relationship")
	protected WebElement priPolicyRelation;
	
	@FindBy(id="primary_prior_auth_id")
	protected WebElement priPriorAuth;
	
	@FindBy(id="primary_prior_auth_mode_id")
	protected WebElement priPriothAuthMode;
	
	@FindBy(id="primary_insurance_doc_content_bytea1")
	protected WebElement pTpaDoc;
	
	@FindBy(id="secondary_sponsor")
	protected WebElement secSponsor;
	
	@FindBy(id="secondary_insurance_co")
	protected WebElement secInsCompany;
	
	@FindBy(id="secondary_sponsor_id")
	protected WebElement secTpa;
	
	@FindBy(id="secondary_insurance_approval")
	protected WebElement secApprovalLimit;
	
	@FindBy(id="secondary_plan_type")
	protected WebElement secNetworkPlan;
	
	@FindBy(id="secondary_plan_id")
	protected WebElement secInsPlan;
	
	@FindBy(id="secondary_member_id")
	protected WebElement secMembershipID;
	
	@FindBy(xpath=".//*[@id='secondary_policy_validity_start']/../img")
	protected WebElement secPoliValStart;
	
	@FindBy(xpath=".//*[@id='secondary_policy_validity_end']/../img")
	protected WebElement secPoliValEnd;
	
	@FindBy(id="secondary_policy_number")
	protected WebElement secPolicyNo;
	
	@FindBy(id="secondary_policy_holder_name")
	protected WebElement secPolicyHolder;
	
	@FindBy(id="secondary_patient_relationship")
	protected WebElement secPolicyRelation;
	
	@FindBy(id="secondary_prior_auth_id")
	protected WebElement secPriorAuth;
	
	@FindBy(id="secondary_prior_auth_mode_id")
	protected WebElement secPriothAuthMode;
	
	@FindBy(id="registerBtn")
	protected WebElement regButton;

	/*
	 * protected void selectCalenderDate(String date, String month, String year) {
	 * driver.findElement(By.linkText(date)).click();
	 * }
	 */
	
	protected void priSponsorDetails(String pSponsor, String pInsuComp, String pTPA, String appAmt, 
									String pPType, String pPlan, String pMID, String pPolNo, 
									String pPolHolder, String pRela, String pPriNo, String pPriMode, String pDoc) {
		Select pSpr = new Select(priSponsor);
		pSpr.selectByVisibleText(pSponsor);
		Select pInsu = new Select(priInsCompany);
		pInsu.selectByVisibleText(pInsuComp);
		Select pTpa = new Select(priTpa);
		pTpa.selectByVisibleText(pTPA);
		priApprovalLimit.sendKeys(appAmt);
		Select pT = new Select(priNetworkPlan);
		pT.selectByVisibleText(pPType);
		Select Ppl = new Select(priInsPlan);
		Ppl.selectByVisibleText(pPlan);
		priMembershipID.sendKeys(pMID);
		priPolicyNo.sendKeys(pPolNo);
		priPolicyHolder.sendKeys(pPolHolder);
		priPolicyRelation.sendKeys(pRela);
		priPriorAuth.sendKeys(pPriNo);
		Select pPmod = new Select(priPriothAuthMode);
		pPmod.selectByVisibleText(pPriMode);
		pTpaDoc.sendKeys(pDoc);
		//pTpaDoc.sendKeys("C:\\\\Users\\Vivekanand\\Desktop\\beach-vector-wallpaper.jpg");		
	}
	
	protected void secSponsorDetails(String sSponsor, String sInsuComp, String sTPA, String sappAmt, 
									String sPType, String sPlan, String sMID, String sPolNo, 
									String sPolHolder, String sRela, String sPriNo, String sPriMode, String sDoc) {
		Select sSpr = new Select(secSponsor);
		sSpr.selectByVisibleText(sSponsor);
		Select sInsu = new Select(secInsCompany);
		sInsu.selectByVisibleText(sInsuComp);
		Select sTpa = new Select(secTpa);
		sTpa.selectByVisibleText(sTPA);
		secApprovalLimit.sendKeys(sappAmt);
		Select sT = new Select(secNetworkPlan);
		sT.selectByVisibleText(sPType);
		Select spl = new Select(secInsPlan);
		spl.selectByVisibleText(sPlan);
		secMembershipID.sendKeys(sMID);
		secPolicyNo.sendKeys(sPolNo);
		secPolicyHolder.sendKeys(sPolHolder);
		secPolicyRelation.sendKeys(sRela);
		secPriorAuth.sendKeys(sPriNo);
		Select sPmod = new Select(secPriothAuthMode);
		sPmod.selectByVisibleText(sPriMode);
		//pTpaDoc.sendKeys(sDoc);
		//pTpaDoc.sendKeys("C:\\\\Users\\Vivekanand\\Desktop\\beach-vector-wallpaper.jpg");		
	}

}