package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class RelativeLocators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com/inputs");
		
		
		
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-number")).above(By.name("input-text"))).sendKeys("3");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-text")).below(By.name("input-number"))).sendKeys("Three");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-password")).below(By.name("input-text"))).sendKeys("2141sadd");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-date")).below(By.name("input-password"))).sendKeys("2024-11-27");
		driver.findElement(By.xpath("//*[@id=\"input-date\"]")).sendKeys("12-12-2023");
		driver.findElement(By.xpath("//*[@id=\"btn-display-inputs\"]")).click();
	}

}
