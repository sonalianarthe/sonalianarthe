package org.TestNgEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserManager {
	//	@BeforeTest
	//public void BeforeTest() {
	//	System.out.println("Before Test User ");
	//	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class :Load User Data");
	}
	@Test
	public void CreateUser() {
		System.out.println("Create User");
	}
	@Test
	public void UpdateUser() {
		System.out.println("Update User");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class:Load User Data");
	} 
}
