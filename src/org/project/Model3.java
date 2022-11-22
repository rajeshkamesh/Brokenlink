package org.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Model3 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement simple = driver.findElement(By.xpath("//button[contains(@id,'alertButton')]"));
		simple.click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		
		WebElement confirm = driver.findElement(By.xpath("//button[contains(@id,'confirmButton')]"));
		confirm.click();
		
		a.dismiss();
		
		Thread.sleep(3000);
		
		WebElement prompt = driver.findElement(By.xpath("//button[contains(@id,'promtButton')]"));
		
		
		String text = a.getText();
		System.out.println(text);
		
		a.sendKeys("selenium");
		a.accept();
		
		
		
		
		
		

}
}