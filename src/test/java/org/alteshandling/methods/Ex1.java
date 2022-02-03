package org.alteshandling.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class Ex1 {
 static WebDriver driver = null;
 public static void main(String[] args) {
	 BaseUtilitise bu = new BaseUtilitise ();
	 String url="https://demoqa.com/alerts";
	 driver= bu.startUp(url, "CH");
	 WebElement adv= driver.findElement(By.cssSelector("[alt='adplus-dvertising']"));
	 adv.click();
	 driver.findElement(By.id("promtButton")).click();
	 System.out.println("text="+driver.switchTo().alert().getText());
	 driver.switchTo().alert().sendKeys("Hello i am acceleration student");
	 driver.switchTo().alert().accept();
	}

}
