import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class SecondDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com/inputs");
		
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-number")).above(By.name("input-text"))).sendKeys("3");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-text")).below(By.name("input-number"))).sendKeys("three");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-password")).above(By.name("input-date"))).sendKeys("abcd123");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-date")).below(By.name("input-password"))).sendKeys("04-09-2024");
		driver.findElement(RelativeLocator.with(RelativeBy.cssSelector("#btn-display-inputs")).toLeftOf(By.xpath("//*[@id=\"btn-clear-inputs\"]"))).click();
		

	}
}
