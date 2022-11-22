package org.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.xpath("//select[contains(@id,'first')]"));
		Select s= new Select(single);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByIndex(2);
		s.selectByValue("Google"); 
		s.selectByVisibleText("Yahoo");
		
		
		List<WebElement> options = s.getOptions();
		
		for(int i=0;i<options.size();i++) {
		WebElement option = options.get(i);
		System.out.println(option.getText());
		}
		WebElement multi = driver.findElement(By.xpath("//select[contains(@id,'second')]"));
		Select s1= new Select(multi);
		boolean multiple2 = s1.isMultiple();
		System.out.println(multiple2);
		
		s1.selectByIndex(0);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		
		
		
		List<WebElement> all = s1.getAllSelectedOptions();
		for(int i=0; i<all.size(); i++) {
		WebElement option = all.get(i);
		System.out.println(option.getText());
	}
		WebElement firstSelectedOption = s1.getFirstSelectedOption();	
		
		System.out.println(firstSelectedOption.getText());
	
	}

}
