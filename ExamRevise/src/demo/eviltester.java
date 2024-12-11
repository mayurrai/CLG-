package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eviltester {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/reference/input.html");
		
		driver.manage().window().maximize();
		
		System.out.println("Current URL:"+ driver.getCurrentUrl());
		System.out.println("Page Title:"+ driver.getTitle());
		
		WebElement button= driver.findElement(By.xpath("//*[@id=\"button-input\"]"));
		button.click();
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"checkbox-input\"]"));
		checkbox.click();
		
		WebElement radio= driver.findElement(By.xpath("//*[@id=\"radio-input-2\"]"));
		radio.click();
		
		WebElement text=driver.findElement(By.xpath("//*[@id=\"text-input\"]"));
		text.sendKeys("Mayur");
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
		search.sendKeys("mayur");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
		password.sendKeys("3249sajf");
		
		WebElement email= driver.findElement(By.xpath("//*[@id=\"email-input\"]"));
		email.sendKeys("mayur@gmail.com");
		
		WebElement url= driver.findElement(By.xpath("//*[@id=\"url-input\"]"));
		url.sendKeys("https://testpages.eviltester.com/styled/reference/input.html");
		
		WebElement tel=driver.findElement(By.xpath("//*[@id=\"tel-input\"]"));
		tel.sendKeys("12345678");
		
		WebElement num= driver.findElement(By.xpath("//*[@id=\"number-input\"]"));
		num.sendKeys("7");
		
		WebElement color=driver.findElement(By.xpath("//*[@id=\"color-input\"]"));
		color.sendKeys("#ff0000");
		
		WebElement date=driver.findElement(By.xpath("//*[@id=\"date-input\"]"));
		date.sendKeys("12-10-2024");
		
		WebElement datetime=driver.findElement(By.xpath("//*[@id=\"datetime-local-input\"]"));
		datetime.sendKeys("2021-11-11T03:23");
		
//		WebElement files=driver.findElement(By.xpath("//*[@id=\"file-input-info\"]"));
//        String filePath = "C:\\path\\to\\your\\file.txt";
//        files.sendKeys(filePath);

		WebElement month=driver.findElement(By.xpath("(//input[@id='month-input'])[1]"));
        month.sendKeys("07-2024");



		
	}
}
