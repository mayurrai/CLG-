package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stealmylogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.stealmylogin.com/demo.html");
		
        driver.manage().window().maximize();
        
		System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Title: " + driver.getTitle());
		
		//Username
		WebElement username= driver.findElement(By.xpath("/html/body/form/input[1]"));
		username.sendKeys("Mayur");
		
		//Password
		WebElement password= driver.findElement(By.xpath("/html/body/form/input[2]"));
		password.sendKeys("mayur");
		
		//Login
		WebElement Login=driver.findElement(By.xpath("/html/body/form/input[3]"));
		Login.click();
		
		//alert
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert Message: " + text);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		driver.quit();
	}

}
