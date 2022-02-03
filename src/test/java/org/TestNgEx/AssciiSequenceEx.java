package org.TestNgEx;

import org.testng.annotations.Test;

public class AssciiSequenceEx {//
	@Test     //it gives execution of program without using main method
	// in TestNg give o/p in assciivalue i.e alphabetical order
	public void login() {  
		System.out.println("login");
	}
	@Test
  public void CreateCustomer() {
	 System.out.println("Capital CreateCustomer");
  }
	@Test
	 public void createcustomer() {
		 System.out.println("small createcustomer");
	  }
	@Test
	public void DeleteCustomer() {
		System.out.println("Capital DeleteCustomer");
	}
	@Test
	public void deletedustomer() {
		System.out.println("small deletedustomer");
	}
}
