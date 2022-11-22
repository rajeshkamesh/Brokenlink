package org.project;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Model2 {

public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement drag = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
	
	WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	
	Actions ac = new Actions(driver);
	ac.dragAndDrop(drag, drop).build().perform();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE); 			
	File desc = new File("F:\\Java\\screenshot\\Dragtest");
	FileUtils.copyFile(src, desc);
	


	
	WebElement drag2 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
	WebElement drop2 = driver.findElement(By.xpath("//li[contains(@class,'placeholder')][1]"));
	Actions ac2 = new Actions(driver);
	ac2.dragAndDrop(drag2, drop2).build().perform();
	
	File src2 = tk.getScreenshotAs(OutputType.FILE); 			
	File desc2 = new File("F:\\Java\\screenshot\\Dragtest2");
	FileUtils.copyFile(src2, desc2);
	
	
	WebElement drag3 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
	
	WebElement drop3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions ac3 = new Actions(driver);
	ac3.dragAndDrop(drag3, drop3).build().perform();
	
	File src3 = tk.getScreenshotAs(OutputType.FILE); 			
	File desc3 = new File("F:\\Java\\screenshot\\Dragtest3");
	FileUtils.copyFile(src3, desc3);
	
	

	WebElement drag4 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
	WebElement drop4 = driver.findElement(By.xpath("//li[@class='placeholder']"));
	
	Actions ac4= new Actions(driver);
	ac3.dragAndDrop(drag4, drop4).build().perform();
	
	
	File src4 = tk.getScreenshotAs(OutputType.FILE); 			
	File desc4 = new File("F:\\Java\\screenshot\\Dragtest4");
	FileUtils.copyFile(src4, desc4);
	
	
	
	
	
	
	
	
	
	

	

}
}