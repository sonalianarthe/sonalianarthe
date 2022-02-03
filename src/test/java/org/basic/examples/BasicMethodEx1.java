package org.basic.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class BasicMethodEx1 {
	 static WebDriver driver = null;
	public static void main(String[] args) {
		
		BaseUtilitise bu = new BaseUtilitise();
		String url= "https://demoqa.com/select-menu";
		driver=bu.startUp(url, "CH");
		WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		adv.click();
	}

}
