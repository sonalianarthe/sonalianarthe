package org.basic.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenricMethodEx3 {
    //Generic Method
	public static void main(String[] args) {
		String path= System.getProperty("user.dir");
		System.out.println("path="+path);
		String browserName="CH";
		WebDriver driver=null; // webDriver is interface then the driver like chrome, firefox is upcasted

		if(browserName.equalsIgnoreCase("CH")) {
			System.setProperty("webdriver.chrome.driver", "F:\\maven2\\selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();   
			}

      	else if (browserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.chrome.driver", "F:\\maven2\\selenium\\Driver\\geckodriver.exe");
			driver  = new FirefoxDriver();
		}else
		{System.out.println( "Invalid browser name");

		}driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		System.out.println("Program ends");   
	}
}