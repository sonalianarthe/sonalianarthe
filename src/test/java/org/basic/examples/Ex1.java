package org.basic.examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {

	public static void main(String[] args) {
    String path= System.getProperty("user.dir");
     System.out.println("path="+path);
    
	System.setProperty("webdriver.chrome.driver", "F:\\maven2\\selenium\\Driver\\chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     
     
     System.setProperty("webdriver.chrome.driver", "F:\\maven2\\selenium\\Driver\\geckodriver.exe");
      FirefoxDriver driver1 = new FirefoxDriver();
     
	}

  }
