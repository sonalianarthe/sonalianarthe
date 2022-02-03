package org.actionclass.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtilitise;

public class ToolTip {

	static WebDriver driver = null;
	 public static void main(String[] args) {
		 BaseUtilitise bu = new BaseUtilitise ();
		 String url="https://demoqa.com/tool-tips";
		 driver= bu.startUp(url, "CH");
		 WebElement adv= driver.findElement(By.cssSelector("[alt='adplus-dvertising']"));
		 adv.click();
	  WebElement button = driver.findElement(By.id("toolTipButton"));
	   Actions act = new Actions(driver);
	   act.moveToElement(button).perform();
	 String ToolTip = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
	   System.out.println(ToolTip);
}
}
