package com.screen.administration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.screen.AppHeader;

public class AddUserPage extends AppHeader {
	WebDriver driver;
	
	public AddUserPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="name")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="confirmPassword")
	private WebElement confirmPwd;
	
	@FindBy(name="fullname")
	private WebElement name;
	
	@FindBy(name="status")
	private WebElement status;
	
	@FindBy(name="hospitalRoleIds")
	private WebElement hospRoleId;
	
	@FindBy(name="sharedLogin")
	private WebElement sharedLogin;
	
	@FindBy(name="emailId")
	private WebElement emailId;
	
	@FindBy(name="mobileNo")
	private WebElement mobileNo;
	
	@FindBy(id="roleId")
	private WebElement roleId;
	
	@FindBy(name="roleRemarks")
	private WebElement roleRemarks;
	
	@FindBy(name="userCenter")
	private WebElement userCenter;
	
	@FindBy(name="doctorId")
	private WebElement doctorId;
	
	@FindBy(id="counterId")
	private WebElement bCounterId;
	
	@FindBy(name="multiStoreId")
	private WebElement multiStoreId;
	
	@FindBy(name="pharmacyStoreId")
	private WebElement defaultStore;
	
	@FindBy(id="pharmacycounterId")
	private WebElement pCounterId;
	
	@FindBy(name="specialization")
	private WebElement specialization;
	
	@FindBy(name="labDepartment")
	private WebElement labDepartment;
	
	@FindBy(name="schedulerDepartment")
	private WebElement schedulerDepartment;
	
	@FindBy(id="doctor_name")
	private WebElement dName;
	
	@FindBy(id="discAuthorizer")
	private WebElement discAuthorizer;
	
	@FindBy(name="prescription_note_taker")
	private WebElement pNT;
	
	@FindBy(name="bedViewDefaultWard")
	private WebElement defaultWard;
	
	@FindBy(id="poApprovalLimit")
	private WebElement poApprovalLimit;
	
	@FindBy(id="writeOffLimit")
	private WebElement writeOffLimit;
	
	@FindBy(id="sponsorWriteOffLimit")
	private WebElement sponsorWriteOffLimit;
	
	@FindBy(name="remarks")
	private WebElement remarks;
	
	@FindBy(id="userSignature")
	private WebElement userSignature;
	
	@FindBy(name="allow_sig_usage_by_others")
	private WebElement aSig;
	
	@FindBy(xpath=".//button[@type='button']")
	private WebElement saveBtn;
	
	@FindBy(linkText="User DashBoard")
	private WebElement userDashBoard;
	
	public void createUser(String uname, String pwd, String cPwd, String nme, String aR, String center) throws InterruptedException {
		userName.sendKeys(uname);
		password.sendKeys(pwd);
		confirmPwd.sendKeys(cPwd);
		name.sendKeys(nme);
		Select r = new Select(roleId);
		r.selectByVisibleText(aR);
		Select c = new Select(userCenter);
		c.selectByVisibleText(center);
		saveBtn.click();
	}	
}
