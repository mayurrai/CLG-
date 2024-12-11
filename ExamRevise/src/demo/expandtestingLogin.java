package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class expandtestingLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		driver.manage().window().maximize();
		
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		System.out.println("Page Title: "+ driver.getTitle());
		
		WebElement username= driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.sendKeys("practice");
		
        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("SuperSecretPassword!");
        
        WebElement loginButton= driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
        loginButton.click();
		
		
	}

}
