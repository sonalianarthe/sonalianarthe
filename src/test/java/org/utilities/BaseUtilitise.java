package org.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtilitise {
	public static BaseUtilitise bu  = new BaseUtilitise();
	public WebDriver startUp(String url,String browserName) {
		String path= System.getProperty("user.dir");
		System.out.println("path="+path);
     WebDriver driver=null;
       if(browserName.equalsIgnoreCase("CH")) {
			System.setProperty("webdriver.chrome.driver"
					, "F:\\maven2\\selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();}   
      else if (browserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.chrome.driver"
					, "F:\\maven2\\selenium\\Driver\\geckodriver.exe");
			driver  = new FirefoxDriver();}

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		return driver;}
		public void explicitWait(WebDriver driver,int time, By Webelement) {
			WebDriverWait Wt = new WebDriverWait(driver,Duration.ofMinutes(time));
			Wt.until(ExpectedConditions.presenceOfElementLocated(Webelement));
		}
		
		}
	
