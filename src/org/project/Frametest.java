package org.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frametest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html#:~:text=Practice%20Exercise%20with%20Solution%20Code%20-%20How%20to,the%20tallest%20structure%20in%20the%20table%20with%20Selenium");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> iTable = driver.findElements(By.tagName("table"));
		
		for(int i=0; i<iTable.size(); i++) {
			WebElement table = iTable.get(i);
			WebElement tBody = driver.findElement(By.tagName("tbody"));
			List<WebElement> iRow = tBody.findElements(By.tagName("tr"));
			
			for(int j=0; j<iRow.size()/2; j++) {
				WebElement row = iRow.get(j);
				List<WebElement> iData = row.findElements(By.tagName("td"));
				
				for(int k=0; k<iData.size(); k++) {
					WebElement data = iData.get(k);
					String text = data.getText();
					System.out.println(text);
				}
				
			}
		}
		
	}
}
