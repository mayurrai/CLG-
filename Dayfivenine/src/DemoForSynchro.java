import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import org.openqa.selenium.By;

public class DemoForSynchro {

	public static void main(String[] args)   {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 			// implicit wait
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sheisthe1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("12345678");

//		as after waiting for 30 sec the password entered, this means that all the element is not loaded and waiting for all the element to load up so for that we wrote the 
//		code 
//		Thread.sleep();
//		This is good for small but when we write a big code we cannot wait for that long for that we use Synchronization 
		
//		Explicit Wait
				
	}

}
