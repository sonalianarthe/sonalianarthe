package org.alteshandling.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtilitise;

public class Ex2 {
	 static WebDriver driver = null;
	 public static void main(String[] args) {
		 BaseUtilitise bu = new BaseUtilitise ();
		 String url="https://demoqa.com/alerts";
		 driver= bu.startUp(url, "CH");
		  driver.findElement(By.cssSelector("[alt='adplus-dvertising']")).click();
		
		 driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.alertIsPresent());
		Ex2 obj= new Ex2();
		if(obj.isAlertPresent(driver,10)) {
			 System.out.println("text="+driver.switchTo().alert().getText());
			 driver.switchTo().alert().accept();
           }else {
           	System.out.println("Display is alert in no present");}
           }
				 
		public boolean isAlertPresent(WebDriver driver,int time ) {
			try {
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
				wt.until(ExpectedConditions.alertIsPresent());
				return true;
			}catch(Exception e) {
	
				return false;
			}
	
		}
		}
	

