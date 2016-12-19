package com.screen.hospitalBillingMasters;

import java.util.Iterator;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.action.hospitalBillingMasters.BaseRateSheet;
import com.libraries.XlLibrary;
import com.screen.AppHeader;

public class NewRatePlanPage extends AppHeader {
	WebDriver driver;
	protected XlLibrary xl = new XlLibrary();
	int i;
	
	public NewRatePlanPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy (id ="org_name")
	private WebElement rPName;
	
	@FindBy (id ="status")
	private WebElement status;
	
	@FindBy (id ="org_address")
	private WebElement address;
	
	@FindBy (id ="org_contact_person")
	private WebElement contatct;
	
	@FindBy (id ="org_phone")
	private WebElement phNo;
	
	@FindBy (id ="org_mailid")
	private WebElement eMail;
	
	@FindBy (name ="store_rate_plan_id")
	private WebElement sTariff;
	
	@FindBy (id ="pharmacy_discount_percentage")
	private WebElement pDiscount;
	
	@FindBy (id ="consumable_factor")
	private WebElement cFactor;

	@FindBy (id ="eligible_to_earn_points")
	private WebElement eEpoints;
	
	@FindBy (id ="has_date_validity")
	private WebElement hasValidity;
	
	@FindBy (id ="fromDate")
	private WebElement fromDate;
	
	@FindBy (id ="toDate")
	private WebElement toDate;
	
	@FindBy (id ="addresults")
	private WebElement addRateSheetButton;
	
	@FindBy (linkText ="Rate Plan List")
	private WebElement rPList;
	
	@FindBy(name="Save")
	private WebElement saveBtn;
	
	public void saveRatePlan(String rp,LinkedList<BaseRateSheet> r,int n) {
		rPName.sendKeys(rp);
		enterBaseRateSheets(r,n);
		saveBtn.click();
	}
	
	public void saveRatePlan(String rp,String st,LinkedList<BaseRateSheet> r,int n) {
		rPName.sendKeys(rp);
		Select tariff = new Select(sTariff);
		tariff.selectByVisibleText(st);
		enterBaseRateSheets(r,n);
		saveBtn.click();
	}
	
	void enterBaseRateSheets(LinkedList<BaseRateSheet> r,int n) {
		LinkedList<BaseRateSheet> rs = r;
		Iterator<BaseRateSheet> itr=rs.iterator();
		for(i=0;itr.hasNext();i++) {
			addRateSheetButton.click();
			BaseRateSheet b = itr.next();
			Select rateSheet = new Select(driver.findElement(By.id("ratesheet"+i)));
			rateSheet.selectByVisibleText(b.rsName);	
			Select disc = new Select(driver.findElement(By.id("discORmarkup"+i)));
			disc.selectByVisibleText(b.disc);
			driver.findElement(By.id("rateVariation"+i)).sendKeys(b.variation);
			Select roundOff = new Select(driver.findElement(By.id("roundOff"+i)));
			roundOff.selectByVisibleText(b.rOff);
			driver.findElement(By.id("priority"+i)).sendKeys(b.priority);
		}		
	}
	

}
