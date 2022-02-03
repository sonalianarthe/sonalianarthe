package org.Wait.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtilitise;

public class ExplicitWait {

	 static WebDriver driver = null;
		public static void main(String[] args) {
			
			BaseUtilitise bu = new BaseUtilitise();
			String url= "http://localhost/login.do";
			driver=bu.startUp(url, "CH");
			
			WebElement UserName=driver.findElement(By.cssSelector("[name='username']"));
			UserName.sendKeys("admin");
			WebElement Password=driver.findElement(By.cssSelector("[name='pwd']"));
			Password.sendKeys("manager");
			driver.findElement(By.cssSelector("#loginButton>div")).click();
			bu.explicitWait(driver, 50,By.cssSelector(".logout") );
			driver.findElement(By.cssSelector(".logout")).click();
			
			//WebDriverWait Wt = new WebDriverWait(driver,Duration.ofMinutes(1));
			//Wt.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".logout11")));//.click();
			//Wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".logout")));//.click();
			
}}
