import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.WebElement;


public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.navigate().refresh();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(6));
		boolean visible= wait.until(ExpectedCondition.elementToBeCickable(By.xpath("//*[@id=\"visibleAfter\"]")));



	}

}
