package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		System.out.println("Current Tittle: "+ driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("valorant");
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
		driver.findElement(By.linkText("Riot Games")).click();
		driver.findElement(By.partialLinkText("spin-off")).click();


	}

}
