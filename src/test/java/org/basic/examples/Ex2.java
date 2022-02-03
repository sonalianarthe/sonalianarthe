package org.basic.examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {

	public static void main(String[] args) {
		String path= System.getProperty("user.dir");
		System.out.println("path="+path);
		String browserName="FF";
		ChromeDriver driverCH=null;         //Initialise the object of ChromeDriver
		FirefoxDriver driverFF=null;        //Initialise the object of FirefoxDriver

		if(browserName.equalsIgnoreCase("CH")) {
			System.setProperty("webdriver.chrome.driver", "F:\\maven2\\selenium\\Driver\\chromedriver.exe");
			//ChromeDriver driverCH=new ChromeDriver();
			driverCH = new ChromeDriver();   //In driverCH object store the new chromedriver
			driverCH.get("https://www.youtube.com/");}

      	else if (browserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.chrome.driver", "F:\\maven2\\selenium\\Driver\\geckodriver.exe");
			driverFF  = new FirefoxDriver();
			driverFF.get("https://www.youtube.com/");
		}else
		{System.out.println( "Invalid browser name");

		}driverCH.manage().window().maximize();
		driverFF.manage().window().maximize();
		//driverFF.manage().window().minimize(); //also selenium 4.0 onwards
		System.out.println("Program ends");   
	}
}