package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ums.lpu.in/LpuUms/LoginNew.aspx");
		driver.manage().window().maximize();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(StaleElementReferenceException.class);
		driver.findElement(By.id("txtU")).sendKeys("27942");
		driver.findElement(By.id("TxtpwdAutoId_8767")).click();
		driver.findElement(By.id("TxtpwdAutoId_8767")).sendKeys("easkfcbs");
		driver.findElement(By.id("iBtnLogins150203125")).click();
		wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector("#TxtpwdAutoId_8767")));

	}

}


