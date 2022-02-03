package org.Wait.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class ImplicitWaitex1 {

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
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			driver.findElement(By.cssSelector(".logout")).click();
			
			
			
			
		}

}
