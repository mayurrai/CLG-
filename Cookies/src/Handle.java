import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Handle {
    public static void main(String[] args) {
        // Set the path to your chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Initialize the Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.immoweb.be/en/search/house/for-sale?countries=BE&page=1&orderBy=relevance");

        // Wait for the accept banner button to be clickable and click it
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='uc-btn-accept-banner']")));
        acceptButton.click();

        // Optionally, close the driver after execution
        driver.quit();
    }

	public static void main(String[] args) {
	    // Set the path to your chromedriver
	    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	
	    // Initialize the Chrome WebDriver
	    WebDriver driver = new ChromeDriver();
	
	    // Open the website
	    driver.get("https://www.immoweb.be/en/search/house/for-sale?countries=BE&page=1&orderBy=relevance");
	
	    // Wait for the accept banner button to be clickable and click it
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='uc-btn-accept-banner']")));
	    acceptButton.click();
	
	    // Optionally, close the driver after execution
	    driver.quit();
	}
}
