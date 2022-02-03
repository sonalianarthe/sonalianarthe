package org.framehandling.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtilitise;

public class FrameHandling {
	static WebDriver driver = null;
	public static void main(String[] args) {
                BaseUtilitise bu = new BaseUtilitise();
				String url= "https://demoqa.com/frames";
				driver=bu.startUp(url, "CH");
				WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
				adv.click();
				WebElement Frame1=driver.findElement(By.id("frame1"));
				driver.switchTo().frame(Frame1); // switch to frame
				String text = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println("text="+text);
				driver.switchTo().defaultContent();//switch to child or root html
			}
	}


