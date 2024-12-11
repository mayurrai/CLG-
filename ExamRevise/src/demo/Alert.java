package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		System.out.println("Current URL:"+driver.getCurrentUrl());
		System.out.println("Title of the site: "+driver.getTitle());
		
		WebElement AlretWithOk=driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		AlretWithOk.click();
		
		String text=driver.switchTo().alert().getText();
		System.out.println("Alert Message: "+ text);
		driver.switchTo().alert().accept();
		
		WebElement AlretWithOkAndCancel=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		AlretWithOkAndCancel.click();
		
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		
		String text2= driver.switchTo().alert().getText();
		System.out.println("Alert Message: "+ text2);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Alert with Textbox'])[1]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='click the button to demonstrate the prompt box'])[1]")).click();
		
		String text3=driver.switchTo().alert().getText();
		System.out.println("Alert Message: "+ text3);
		driver.switchTo().alert().sendKeys("Mayur");
		driver.switchTo().alert().accept();
		
		}

}