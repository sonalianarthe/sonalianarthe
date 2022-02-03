package org.TestNgEx2;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountManager {
	@BeforeTest
	public void BeforeTest() {
		//System.out.println("Before Test- Accounts ");
		Reporter.log("Before Test- Accounts ");
		//use Reporter for sysout
}
	@BeforeClass
	public void beforeClass() {
		//System.out.println("Before Class :Load Accounts Data");
		Reporter.log("Before Class :Load Accounts Data");
	}
	@Test
	public void CreateAccount() {
		//System.out.println("Create Account");
		Reporter.log("Create Account");
	}
	@Test
	public void UpdateAccount() {
		//System.out.println("Update Account");
		Reporter.log("Update Account");
	}
	@AfterClass
	public void afterClass() {
		//System.out.println("After Class:Load Accounts Data");
		Reporter.log("After Class:Load Accounts Data");
	} 
}
