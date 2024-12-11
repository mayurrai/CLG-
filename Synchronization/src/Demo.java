import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {

	WebDriver driver= new ChromeDriver();
	driver.get("https://accounts.google.com/");
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abc1@gmail.com");
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	}
}