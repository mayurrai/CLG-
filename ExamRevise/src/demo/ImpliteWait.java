package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliteWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"enableAfter\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"enableAfter\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"visibleAfter\"]")).click();
	}

}
