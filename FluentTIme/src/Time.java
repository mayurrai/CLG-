import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Time {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.navigate().refresh();

        
        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);

        WebElement visible = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='visibleAfter']")));
        
        boolean isVisible = visible.isDisplayed();
        System.out.println("Is the element visible: " + isVisible);

    }
}
