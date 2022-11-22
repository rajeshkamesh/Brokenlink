package org.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DiwaliTask {
	public static void main(String[] args) throws AWTException, InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		a.accept();
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		a.sendKeys("Yes");
		a.accept();
		
	}

}
