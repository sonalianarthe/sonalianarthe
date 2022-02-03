package org.selectclass.examples;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtilitise;

public class Selectex2 {
      static WebDriver driver = null;
	public static void main(String[] args) {
		BaseUtilitise bu = new BaseUtilitise();
		String url= "https://demoqa.com/select-menu";
		driver=bu.startUp(url, "CH");
		WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		adv.click();
		
		WebElement colorDDL=driver.findElement(By.id("oldSelectMenu")); //step 1
		 Select sel = new Select(colorDDL);//step 2
		List<WebElement> allOptions = sel.getOptions();
		 int numberOfOptions = allOptions.size();
		 System.out.println(" Number of color present ="+numberOfOptions);//give size=11 
		 
			ArrayList<String> ar = new ArrayList<String>(); 
           for(int i =0;i<numberOfOptions;i++){
			ar.add(allOptions.get(i).getText());
		System.out.println(allOptions.get(i).getText()); //use for all option name list
		 }
	    System.out.println("--------------------------------------------");
        System.out.println(ar);// [RED,BLUE,]....Array list
	   if(ar.contains("Purple")){
		   sel.selectByVisibleText("Purple");//use any color present or not then print
	   }
	} //Generic Method
       public  ArrayList<String> getListOfTextFromSelect (WebElement ddlEle,int value){
    	ArrayList<String> ar = new ArrayList<String>();
    	Select sel = new Select(ddlEle);
       int size=sel.getOptions().size();
       for (int i =0;i<size;i++) {
    	  ar.add( sel.getOptions().get(i).getText());
       }return ar;
   }
 } 