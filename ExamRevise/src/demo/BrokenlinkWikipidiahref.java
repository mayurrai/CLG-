package demo;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BrokenlinkWikipidiahref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https:wikipedia.com");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
    	System.out.println("Total No. of Link: " + links.size());

		for(WebElement link:links) {
			System.out.println(link.getText()+" "+link.getAttribute("href"));
		}
	}

}
