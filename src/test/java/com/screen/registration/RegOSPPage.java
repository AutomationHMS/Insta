package com.screen.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegOSPPage extends PatientDetails {

	public RegOSPPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="referaldoctorNameo")
	private WebElement referdDoctor;

	public void registerPatient(String sal, String fName,String mNo,String age,	String inAge, 
								String gender, String nat, String consent,	String rPlan) {
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
		Select rp = new Select(ratePlan);
		rp.selectByVisibleText(rPlan);
		regButton.click();
	}

	public void registerPatient(String sal, String fName,String mName, String mNo,String age, 
								String inAge,String gender, String nat, String consent, 
								String bType, String rPlan)	{
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
		Select rp = new Select(ratePlan);
		rp.selectByVisibleText(rPlan);
		regButton.click();
	}

	public void registerPatient(String sal, String fName, String mName, String lName, String mNo,String age, 
								String inAge,String gender, String nat, String consent, 
								String bType, String rPlan) {
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

	public void registerPatient(String rPlan) {
		mrNo.click();
		Select rp = new Select(ratePlan);
		rp.selectByVisibleText(rPlan);
		regButton.click();
	}
}
