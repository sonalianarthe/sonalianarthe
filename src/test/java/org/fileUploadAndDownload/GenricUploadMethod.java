package org.fileUploadAndDownload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class GenricUploadMethod {

	static WebDriver driver = null;
	public static void main(String[] args) {
                BaseUtilitise bu = new BaseUtilitise();
				String url= "https://demoqa.com/automation-practice-form";
				driver=bu.startUp(url, "CH");
			driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement ele=driver.findElement(By.id("uploadPicture"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		js.executeScript("arguments[0].click()",ele);
		String path= System.getProperty("user.dir");

       
			try {
				Thread.sleep(2000);

				Runtime.getRuntime().exec(path+"\\AutoitFiles\\genricUpload.exe");
			
			} catch (Exception e) {
				e.printStackTrace();
			} 				
		}  
			
	
		
}
