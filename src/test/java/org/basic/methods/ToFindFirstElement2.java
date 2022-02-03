package org.basic.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class ToFindFirstElement2 {
 static WebDriver driver = null;
	public static void main(String[] args) {
		BaseUtilitise bu = new BaseUtilitise();
		String Url="https://demoqa.com/webtables";
		driver=bu.startUp(Url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		List<WebElement>ListOfEle=driver.findElements
				(By.xpath("//div [@class='rt-tbody']//div[@class='rt-td'][text()][1]"));
		for(int i=0;i<ListOfEle.size();i++) {
			System.out.println(ListOfEle.get(i).getText());
		}//give 1 st name of all row

	}

}
