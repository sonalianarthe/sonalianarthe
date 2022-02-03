package org.selectclass.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtilitise;

public class Selectex1 {
      static WebDriver driver = null;
	public static void main(String[] args) {
		BaseUtilitise bu = new BaseUtilitise();
		String url= "https://demoqa.com/select-menu";
		driver=bu.startUp(url, "CH");
		WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		adv.click();
		
		WebElement colorDDL=driver.findElement(By.id("sel.getFirstSelectedOption()oldSelectMenu")); //step 1
		 Select sel = new Select(colorDDL);//step 2
		 WebElement selectedOption =sel.getFirstSelectedOption();  //calling by object through ie sel.
		 System.out.println("Default  Selected Color= "+selectedOption.getText());//return text default color name
		 
		  sel.selectByVisibleText("Black"); //select the color
		  System.out.println("User selected color="+sel.getFirstSelectedOption().getText());//retun text black 
		 
	}

}
