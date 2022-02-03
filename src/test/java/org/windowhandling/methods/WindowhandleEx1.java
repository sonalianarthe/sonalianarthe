package org.windowhandling.methods;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class WindowhandleEx1 {
	 static WebDriver driver = null;
		public static void main(String[] args) {
			
			BaseUtilitise bu = new BaseUtilitise();
			String url= "https://demoqa.com/browser-windows";
			driver=bu.startUp(url, "CH");
			WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
			adv.click();
			
			String ParId1=driver.getWindowHandle();
			String ParId2=driver.getWindowHandle();

			driver.findElement(By.id("tabButton")).click();
            System.out.println("ParId1="+ParId1);
            System.out.println("ParId2="+ParId2);
			Set<String> allWindows=driver.getWindowHandles();
			Iterator<String>itr= allWindows.iterator();
			String id1=itr.next();
			System.out.println(id1);
			String id2=itr.next();
			System.out.println(id2);
			driver.switchTo().window(id2);
			System.out.println("curent url="+driver.getCurrentUrl());
			String text=driver.findElement(By.id("sampleHeading")).getText();
			System.out.println("text="+text);
			
 
		}

}
