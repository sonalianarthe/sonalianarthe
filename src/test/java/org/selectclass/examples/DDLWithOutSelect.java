package org.selectclass.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class DDLWithOutSelect {

	 static WebDriver driver = null;

		public static void main(String[] args) {
			BaseUtilitise bu = new BaseUtilitise();
			String url= "https://demoqa.com/select-menu";
			driver=bu.startUp(url, "FF");
			WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
			adv.click();
			WebElement DDL= driver.findElement(By.xpath("//*[text()='Select Option']"));
			DDL.click();
			driver.findElement(By.xpath("//*[text()='Group 2, option 1']")).click();
			WebElement DDL1= driver.findElement(By.xpath("//*[text()='Select Title']"));
			DDL1.click();
			driver.findElement(By.xpath("//*[text()='Mr.']")).click();
			// Note Refresh after every select xpath.
			// choose option 1st then check inspect
		}
}