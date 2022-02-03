package org.selectclass.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtilitise;

public class MultiselectEx1 {
    static WebDriver driver = null;

	public static void main(String[] args) {
		BaseUtilitise bu = new BaseUtilitise();
		String url= "https://demoqa.com/select-menu";
		driver=bu.startUp(url, "CH");
		WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		adv.click();
		
		WebElement colorDDL=driver.findElement(By.id("cars")); //step 1
		 Select sel = new Select(colorDDL);
		//sel.selectByVisibleText("Volvo"); // 3 way to deselect option
		// sel.selectByIndex(2);
		// sel.selectByValue("3");
		 for(int i=0;i<sel.getOptions().size();i++) {//use for select all options 
			 sel.selectByIndex(i);
		 }
		 //sel.deselectAll();
		// sel.deselectByVisibleText("Volvo");//use for perticular deselect options
		 
		 //use for verifying the selected option to be print.
		List <WebElement> SelectedOptions= sel.getAllSelectedOptions();
		for(int i =0;i<SelectedOptions.size();i++) {
			System.out.println(SelectedOptions.get(i).getText());
		}
	}
}
