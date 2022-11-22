package org.project;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javascript2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
				
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		
		js.executeScript("arguments[0].setAttribute('value','Rajesh')",user );//sendkeys on username
		js.executeScript("arguments[0].setAttribute('value','kumar')",pass );//sendkeys on password
		Object get = js.executeScript("return arguments[0].getAttribute('value')",pass );// get password text
		System.out.println(get);

		//driver.findElement(By.xpath("//button[@value='1']")).click();//click login button
		
		WebElement messenger = driver.findElement(By.linkText("Messenger"));//down page link
		
		js.executeScript("arguments[0].scrollIntoView(true);",messenger);//scroll to click below link
		messenger.click();

		
		
	}
}
