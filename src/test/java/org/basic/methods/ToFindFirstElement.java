package org.basic.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class ToFindFirstElement {
 static WebDriver driver = null;
	public static void main(String[] args) {
		BaseUtilitise bu = new BaseUtilitise();
		String Url="https://demoqa.com/webtables";
		driver=bu.startUp(Url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		List<WebElement>ListOfEle=driver.findElements(By.xpath("//*[text()='Kierra']"));
		System.out.println(ListOfEle.size());
		System.out.println(ListOfEle.isEmpty());
		if(!ListOfEle.isEmpty()) {
			//WebElement ele=ListOfEle.get(0);
			//ele.getText();
			ListOfEle.get(0).click();
			System.out.println(ListOfEle.get(0).getText()); // it give a single element using multiple elelment 
		}

	}

}
