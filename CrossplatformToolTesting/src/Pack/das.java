package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class das {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        // Test Case 1: Successful Login
        driver.get("http://example.com/login");
        driver.findElement(By.id("username")).sendKeys("test_user");
        driver.findElement(By.id("password")).sendKeys("password123");
        driver.findElement(By.id("loginButton")).click();
        
        // Verify login
        String expectedUrl = "http://example.com/dashboard";
        String actualUrl = driver.getCurrentUrl();
        assert actualUrl.equals(expectedUrl) : "Test Case 1 Failed: Login not successful";

        // Test Case 2: Login with Invalid Password
        driver.navigate().back();
        driver.findElement(By.id("username")).sendKeys("test_user");
        driver.findElement(By.id("password")).sendKeys("wrongpass");
        driver.findElement(By.id("loginButton")).click();
        
        // Verify error message
        String errorMessage = driver.findElement(By.id("error")).getText();
        assert errorMessage.equals("Invalid credentials") : "Test Case 2 Failed: Error message not displayed";

        // Test Case 3: Login with Empty Fields
        driver.navigate().back();
        driver.findElement(By.id("loginButton")).click();
        
        // Verify error message
        errorMessage = driver.findElement(By.id("error")).getText();
        assert errorMessage.equals("Fields cannot be empty") : "Test Case 3 Failed: Error message not displayed";

        // Close the browser
        driver.quit();
    }
}
