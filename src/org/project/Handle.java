package org.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Realme Mobiles");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		String wh = driver.getWindowHandle();
		Thread.sleep(1000);
							
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(1000);		
		driver.switchTo().window(wh);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		driver.switchTo().window(wh);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
		driver.switchTo().window(wh);
		Thread.sleep(3000);
		
		Set<String> Wh = driver.getWindowHandles();
		List<String> ch1 = new ArrayList<>(Wh);
		for(int i = 1; i<4;i++) {
			driver.switchTo().window(ch1.get(i));
			String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
			System.out.println(text);
			driver.close();
			
			
		
			
			
		
		}
		
	

}}
