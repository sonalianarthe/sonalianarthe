package org.windowhandling.methods;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class GenricMethodWindowhandleEx2 {
	 static WebDriver driver = null;
		public static void main(String[] args) {
			
			BaseUtilitise bu = new BaseUtilitise();
			String url= "https://demoqa.com/browser-windows";
			driver=bu.startUp(url, "FF");
			WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
			adv.click();
			
			String ParentId=driver.getWindowHandle();
			 System.out.println("ParId1="+ParentId);
			driver.findElement(By.id("tabButton")).click();
           Set<String> allWindows=driver.getWindowHandles();
			Iterator<String>itr= allWindows.iterator();
			while(itr.hasNext());{
				String id1=itr.next();
				if(!id1.equals(ParentId)) {
					driver.switchTo().window(id1);
				}
				try{System.out.println("curent url="+driver.getCurrentUrl());
				String text=driver.findElement(By.id("sampleHeading")).getText();
				System.out.println("text="+text);
				
					
				}catch(Exception e) {
				System.out.println("trying to switch to another window");	
				}
			}
			//driver.close();close the parent windows
			driver.quit();
		
			
			
		}

}
