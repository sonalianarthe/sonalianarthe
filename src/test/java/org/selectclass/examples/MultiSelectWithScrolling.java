package org.selectclass.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtilitise;

public class MultiSelectWithScrolling {


	static WebDriver driver = null;
		public static void main(String[] args) {
			
			BaseUtilitise bu = new BaseUtilitise();
			String url= "https://demoqa.com/select-menu";
			driver=bu.startUp(url, "CH");
			WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
			adv.click();
		//driver.findElement(By.name("cars")).sendKeys(Keys.PAGE_DOWN);//Use For Page Down
		
	WebElement colorDDL=driver.findElement(By.id("cars"));
	// Java Script Use FOr Scrolling The Page
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",colorDDL);
	
			Select sel = new Select(colorDDL);
			 for(int i=0;i<sel.getOptions().size();i++) {//use for select all options 
				 sel.selectByIndex(i);
			 }
			
		}


}
