package com.libraries;

import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class LaunchBrowser {

	protected WebDriver driver = new FirefoxDriver();
	protected XlLibrary xl = new XlLibrary();
	protected JDBConnect r = new JDBConnect();
	protected ResultSet rs;
	
	@BeforeClass
	public void launch() {
		driver.get("http://"+xl.getCellValue("src/test/resources/Data.xls","TestSvr",1,0)+"/"+
				    xl.getCellValue("src/test/resources/Data.xls","TestSvr",1,1)+"/loginForm.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public String getBuild(){
		String build = driver.findElement(By.xpath(".//div[@class='foottertxt']/table/tbody/tr/td[1]")).getText();
		String bNo=null;
		Pattern p = Pattern.compile("(([0-9].[0-9].[0-9]-[0-9]))");
		//System.out.println(build);
		String[] parts = build.split(" ");
		for(String temp:parts) {
				Matcher m = p.matcher(temp);
				boolean b = m.find();
				if(b) {
					bNo = temp;
					break;
				}
		}
		//System.out.println(bNo);
		return bNo;
	}
}
