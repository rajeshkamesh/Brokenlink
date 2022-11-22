package org.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class debug {
	static WebDriver driver;
	
	public static void launch(String url) {
		try {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		}
}
