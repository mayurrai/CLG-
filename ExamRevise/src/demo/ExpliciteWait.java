package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		
		driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement enableButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        enableButton.click();
        
        WebElement colorchange = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"colorChange\"]")));
        colorchange.click();
        
        WebElement visiblebutton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"visibleAfter\"]")));
        visiblebutton.click();
        

	}

}
