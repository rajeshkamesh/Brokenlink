package org.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
//		TakesScreenshot ss = (TakesScreenshot)driver;
//		File fi = ss.getScreenshotAs(OutputType.FILE);
//		File save = new File("F:\\Java\\screenshot\\frame");
//		FileUtils.copyFile(fi, save);
//		driver.switchTo().parentFrame();
		
		String text = driver.findElement(By.xpath("//b[@id='topic']")).getText();
		System.out.println(text);
//		TakesScreenshot ss2 = (TakesScreenshot)driver;
//		File fi2 = ss.getScreenshotAs(OutputType.FILE);
//		File save2 = new File("F:\\Java\\screenshot\\frame2");
//		FileUtils.copyFile(fi, save);
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File fi4 = ts.getScreenshotAs(OutputType.FILE);
//		File save4= new File("F:\\Java\\screenshot\\frame6");
//		FileUtils.copyFile(fi4, save4);
//		
		
		
		
		
		
		
		
		
		
}		
}