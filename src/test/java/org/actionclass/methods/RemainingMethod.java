package org.actionclass.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class RemainingMethod {
	static WebDriver driver = null;
	public static void main(String[] args) {
                BaseUtilitise bu = new BaseUtilitise();
				String url= "https://demoqa.com/droppable";
				driver=bu.startUp(url, "CH");
				WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
				adv.click();
		WebElement ele = driver.findElement(By.id("simpleLink"));
}
}