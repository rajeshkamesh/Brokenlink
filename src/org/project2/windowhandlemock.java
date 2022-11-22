package org.project2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowhandlemock {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Realme Mobiles");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		WebElement f = driver.findElement(By.xpath("//div[@class='_4rR01T'][1]"));
		f.click();
		String wh = driver.getWindowHandle();
		Set<String> wh2 = driver.getWindowHandles();
		List<String> wh3=new ArrayList<>(wh2);
		for(String x:wh3) {
			if(!wh.equals(wh3)) {
				driver.switchTo().window(x);
			}
		}

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement savefor = driver.findElement(By.xpath("(//div[@class='_3dsJAO'])[1]"));
		

		
		
	}

}
