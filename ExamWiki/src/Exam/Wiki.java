package Exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiki {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		//Assertion To Get Title and url
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		
		System.out.println("Title: " + driver.getTitle());

		//ImplicitlyWait for Element to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to  English 
        WebElement englishLink = driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong"));
        englishLink.click();
        
        //Click on Search 
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"p-search\"]/a"));
        searchInput.click();
        
        //Write Artificial Intelligence 
        WebElement search= driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/div/div[1]/input"));
        search.sendKeys("Artificial Intelligence");
        
        //Click on search
        WebElement clicksearch= driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button"));
        clicksearch.click();
  
        //Click on first Link 
        WebElement firstArticle = driver.findElement(By.partialLinkText("AI"));
        firstArticle.click();         
        
        //Wait for 30 seconds
        Thread.sleep(3000);
        
        //Close Browser
        driver.close();
	}
	

}
