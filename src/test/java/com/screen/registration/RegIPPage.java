package com.screen.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegIPPage extends PatientDetails {
	
	public RegIPPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="id=dept_name")
    private WebElement Drdept;
	
	@FindBy(xpath=".//*[@id='doctor_name']")
	private WebElement doctor;
	
	@FindBy(id="bed_type")
	private WebElement bedType;
	
	@FindBy(id="ward_id")
	private WebElement ward;
	
	@FindBy(id="bed_id")
	private WebElement bed;
	
	@FindBy(name="duty_doctor_id")
	private WebElement dutyDoctor;
	
	@FindBy(id="registerBtn")
	private WebElement register;
	
	public void registerPatient(String sal, String fName,String mNo,String age, 
								String inAge,String gender, String nat, String consent, 
								String bType, String rPlan, String doc, String conType) {
		newPatient.click();
		Select salut = new Select(salutation);
		salut.selectByVisibleText(sal);
		patientFirstName.sendKeys(fName);
		patientPhone.sendKeys(mNo);
		patientAge.sendKeys(age);
		Select agein = new Select(ageIn);
		agein.selectByVisibleText(inAge);
		Select nationality = new Select(customList1);
		nationality.selectByVisibleText(nat);
		Select consen = new Select(customList7);
		consen.selectByVisibleText(consent);
		Select bt = new Select(billType);
		bt.selectByVisibleText(bType);
		Select rp = new Select(ratePlan);
		rp.selectByVisibleText(rPlan);
		regButton.click();
	}

	public void registerPatient(String sal, String fName,String mName, String mNo,String age, 
								String inAge,String gender, String nat, String consent, 
								String bType, String rPlan, String doc, String conType)	{
		newPatient.click();
		Select salut = new Select(salutation);
		salut.selectByVisibleText(sal);
		patientFirstName.sendKeys(fName);
		patientMiddleName.sendKeys(mName);
		patientPhone.sendKeys(mNo);
		patientAge.sendKeys(age);
		Select agein = new Select(ageIn);
		agein.selectByVisibleText(inAge);
		Select nationality = new Select(customList1);
		nationality.selectByVisibleText(nat);
		Select consen = new Select(customList7);
		consen.selectByVisibleText(consent);
		Select bt = new Select(billType);
		bt.selectByVisibleText(bType);
		Select rp = new Select(ratePlan);
		rp.selectByVisibleText(rPlan);
		regButton.click();
	}

	
	public void registerPatient(String sal, String fName, String mName, String lName, String mNo,String age, 
								String inAge,String gender, String nat, String consent, 
								String bType, String rPlan, String doc, String conType) {
		newPatient.click();
		Select salut = new Select(salutation);
		salut.selectByVisibleText(sal);
		patientFirstName.sendKeys(fName);
		patientMiddleName.sendKeys(mName);
		patientLastName.sendKeys(lName);
		patientPhone.sendKeys(mNo);
		patientAge.sendKeys(age);
		Select agein = new Select(ageIn);
		agein.selectByVisibleText(inAge);
		Select nationality = new Select(customList1);
		nationality.selectByVisibleText(nat);
		Select consen = new Select(customList7);
		consen.selectByVisibleText(consent);
		Select bt = new Select(billType);
		bt.selectByVisibleText(bType);
		Select rp = new Select(ratePlan);
		rp.selectByVisibleText(rPlan);
		regButton.click();
	}
		
	public void registerPatient(String bType, String rPlan, String doc, String conType) {
		mrNo.click();
		Select bt = new Select(billType);
		bt.selectByVisibleText(bType);
		Select rp = new Select(ratePlan);
		rp.selectByVisibleText(rPlan);
		regButton.click();
	}
	
	public void registerPatient(String sal, String fName, String mName, String lName, String mNo,String age, 
								String inAge,String gender, String nat, String consent, String pSponsor, String pInsuComp,
								String pTPA, String appAmt, String pPType, String pPlan, String pMID, 
								String pPolNo, String pPolHolder, String pRela, String pPriNo, String pPriMode, String pDoc, 
								String bType, String rPlan, String doc, String conType)	{
		newPatient.click();
		Select salut = new Select(salutation);
		salut.selectByVisibleText(sal);
		patientFirstName.sendKeys(fName);
		patientMiddleName.sendKeys(mName);
		patientLastName.sendKeys(lName);
		patientPhone.sendKeys(mNo);
		patientAge.sendKeys(age);
		Select agein = new Select(ageIn);
		agein.selectByVisibleText(inAge);
		Select nationality = new Select(customList1);
		nationality.selectByVisibleText(nat);
		Select consen = new Select(customList7);
		consen.selectByVisibleText(consent);
		priSponsorDetails(pSponsor,pInsuComp,pTPA,appAmt,pPType,pPlan,pMID,pPolNo,pPolHolder,pRela,pPriNo,pPriMode,pDoc);
		Select bt = new Select(billType);
		bt.selectByVisibleText(bType);
		Select rp = new Select(ratePlan);
		rp.selectByVisibleText(rPlan);
	}
}

