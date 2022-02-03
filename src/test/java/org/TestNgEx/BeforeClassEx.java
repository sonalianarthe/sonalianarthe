package org.TestNgEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.utilities.BaseUtilitise;

public class BeforeClassEx {
	WebDriver driver = null;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		String url="http://localhost/login.do";
		driver=BaseUtilitise.bu.startUp(url,"ch");}
	@BeforeMethod
	public void beforeMethod1() {
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
	} 
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	} 
	@Test
	public void testMethod1() {
		System.out.println("**Test Method1**");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	} 
	@AfterMethod
	public void afterMethod1() {
		driver.findElement(By.id("logoutLink")).click();
	} 
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		driver.quit();
	}
}
