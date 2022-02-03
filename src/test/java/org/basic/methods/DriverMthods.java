package org.basic.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class DriverMthods {

	static WebDriver driver = null;
	public static void main(String[] args) {
		BaseUtilitise bu = new BaseUtilitise();
		String url= "https://demoqa.com/radio-button";
		driver=bu.startUp(url, "CH");
		WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		adv.click();
		String CurrentUrl=driver.getCurrentUrl(); //1st Driver Method getCurrentUrl()
		System.out.println("CurrentUrl="+CurrentUrl);
		
		String PageTitle=driver.getTitle();//2nd Driver Method getTitle()
		System.out.println("PageTitle="+PageTitle);
		
		 WebElement YesRadiolabel=driver.findElement(By.cssSelector("label[for='yesRadio']"));
		String text= YesRadiolabel.getText(); // 3rd method of webElement
		 System.out.println("text="+text); // use for give text of radio button
		 
		 
		  String YesRadiolabelClassName=YesRadiolabel.getAttribute("class"); //4th method give default page select
		System.out.println("YesRadiolabelClassName="+YesRadiolabelClassName); 
		
		String pageSource=driver.getPageSource();//5th Method of webElement
		System.out.println(pageSource);//give all Dom of html page
		
		WebElement NoRadioBtn=driver.findElement(By.id("noRadio"));//6th Method
		System.out.println("NoRadioBtn="+NoRadioBtn.isEnabled()); //use for enable or disable
		
		
		if(YesRadiolabel.isDisplayed()) {   //7th method
			YesRadiolabel.click();
			WebElement YesRadioBtn=driver.findElement(By.id("yesRadio"));
			if(YesRadioBtn.isSelected()) {//8th method
				System.out.println("Yes Radio Btn is selected");
			}else {
				System.out.println("Yes Radio Btn is not selected");

			}
		}
		
		 
		
		
		
	}}

