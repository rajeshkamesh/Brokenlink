package org.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Model {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			//WebElement Click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			//Click.click();
			Thread.sleep(1000);
			WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			user.sendKeys("selenium");
			Thread.sleep(1000);
			Actions ac = new Actions(driver);
			ac.doubleClick(user).build().perform();
			ac.contextClick(user).build().perform();
			
			Robot r = new Robot();
			for(int i=0; i<2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);   // pressing two times down button
			r.keyRelease(KeyEvent.VK_DOWN);
			}
			
			r.keyPress(KeyEvent.VK_ENTER);	//Enter 
			r.keyRelease(KeyEvent.VK_ENTER); // Release enter
			
			r.keyPress(KeyEvent.VK_TAB);	//copy
			r.keyRelease(KeyEvent.VK_TAB);
			
			
			r.keyPress(KeyEvent.VK_CONTROL);	
			r.keyRelease(KeyEvent.VK_V);
			
			
			
			
			
			
			
			
			
			
	}

}
