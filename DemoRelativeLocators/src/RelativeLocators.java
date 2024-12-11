import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		
		driver.findElement(RelativeLocator.with(RelativeBy.name("email")).above(By.name("country"))).sendKeys("abc@gmail.com");
		driver.findElement(RelativeLocator.with(RelativeBy.name("city")).below(By.name("country"))).sendKeys("Nagpur");
		driver.findElement(RelativeLocator.with(RelativeBy.linkText("Signin")).toRightOf(By.xpath("//*[@id=\"load_form\"]/div[1]/div[1]/p/a"))).click();
	}
}
