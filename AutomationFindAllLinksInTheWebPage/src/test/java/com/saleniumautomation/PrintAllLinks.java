package com.saleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int totalLinks = allLinks.size();
		System.out.println("Total Tags present in the web page are "+totalLinks);
		
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		
	
		for (WebElement link : allLinks) {
		
		if (link.isDisplayed()) {
		     visibleLinkCount++;
		System.out.println(visibleLinkCount+" --> "+link.getText());
		} 
		else{
		    hiddenLinkCount++;
		}
		}
		System.out.println("Total number of visible links :" + visibleLinkCount);
		System.out.println("Total number of hidden links :" + hiddenLinkCount);
		//driver.close();
	}

}
