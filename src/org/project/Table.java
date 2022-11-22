package org.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table extends debug{
	public static void main(String[] args) {
		
		
	
		launch("https://www.amazon.in/");
		
		List<WebElement> iTable = driver.findElements(By.tagName("table"));
	
			for(int i=0; i<iTable.size(); i++) {
				WebElement table = iTable.get(i);
				WebElement tBody = table.findElement(By.tagName("tbody"));
				List<WebElement> iRow = tBody.findElements(By.tagName("tr"));
				for(int j=0; j<iRow.size(); j++) {
					WebElement row = iRow.get(i);
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

