package com.action.hospitalBillingMasters;

public class BaseRateSheet {
	public String rsName;
	public String disc;
	public String variation;
	public String rOff;
	public String priority;
	
	public BaseRateSheet(String rs,String d,String v,String r,String p) {
		rsName = rs;
		disc = d;
		variation = v;
		rOff = r;
		priority = p;
	}
}
