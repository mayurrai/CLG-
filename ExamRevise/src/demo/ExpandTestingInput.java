package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpandTestingInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/inputs");
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		System.out.println("Page Title: "+ driver.getTitle());
		
		WebElement number=driver.findElement(By.xpath("//*[@id=\"input-number\"]"));
		number.sendKeys("2");
		
		WebElement text=driver.findElement(By.xpath("//*[@id=\"input-text\"]"));
		text.sendKeys("mayur");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("234wqas");
		
		WebElement Date=driver.findElement(By.xpath("//*[@id=\"input-date\"]"));
		Date.sendKeys("12-12-2024");
		
		WebElement displayinput= driver.findElement(By.xpath("//*[@id=\"btn-display-inputs\"]"));
		displayinput.click();
		
		Thread.sleep(3000);
		
		WebElement clear=driver.findElement(By.xpath("//*[@id=\"btn-clear-inputs\"]"));
		clear.click();
		
		driver.quit();
	}

}
