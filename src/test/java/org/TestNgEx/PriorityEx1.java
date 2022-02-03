package org.TestNgEx;

import org.testng.annotations.Test;

public class PriorityEx1 {//
	@Test (priority=-11)//default consider 0  priority
	//0 priority test case execute according to ascci value 
	public void login() {  
		System.out.println("login");
	}
	@Test (priority=1)
  public void CreateCustomer() {
	 System.out.println("Capital CreateCustomer");
  }
	@Test(priority=2)
	 public void createcustomer() {
		 System.out.println("small createcustomer");
	  }
	@Test(priority=3)
	public void DeleteCustomer() {
		System.out.println("Capital DeleteCustomer");
	}
	@Test//default consider 0 priority
	public void deletedustomer() {
		System.out.println("small deletedustomer");
	}
}
