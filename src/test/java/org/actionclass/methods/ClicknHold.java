package org.actionclass.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtilitise;

public class ClicknHold {
	static WebDriver driver = null;
	public static void main(String[] args) {
                BaseUtilitise bu = new BaseUtilitise();
				String url= "https://demoqa.com/droppable";
				driver=bu.startUp(url, "CH");
				WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
				adv.click();
			WebElement	src=driver.findElement(By.id("draggable"));
			WebElement des=driver.findElement(By.cssSelector("[class='simple-drop-container']>#droppable"));
			Actions act = new Actions(driver);
			act.moveToElement(src).clickAndHold().moveToElement(des).release(des).build().perform();//3rd way
}}
