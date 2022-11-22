package org.project2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	
public static void main(String[] args) throws MalformedURLException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total links are : "+links.size());
	int count=0;
	int count2=0;
	for(WebElement link:links) {
			String url = link.getAttribute("href");
			
			if(url==null ||url.isEmpty())
			{
				System.out.println("empty url");
				count++;
				continue;
			}
			try {
			HttpURLConnection huc= (HttpURLConnection)(new URL(url).openConnection());
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println("Broken url");
				System.out.println(url);
				int code = huc.getResponseCode();
				System.out.println(code);
				String codemessage = huc.getResponseMessage();
				System.out.println(codemessage);
				
				count2++;
				
			}
			else {
				//System.out.println("valid url");
				count++;
			}
			}
			catch(IOException e){
				e.printStackTrace();
				
			}
			
			
	}
	
	
	driver.quit();
	System.out.println("Broken url: "+count2);
	System.out.println("Valid url: "+count);
	
	
}


}
