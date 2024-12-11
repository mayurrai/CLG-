import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");		

		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().fullscreen();
		//Point dim = driver.manage().window().getPosition();
		//System.out.println(dim);
		WebElement text = driver.findElement(By.cssSelector("#searchInput"));
		text.sendKeys("google");
		driver.findElement(By.cssSelector("#search-form > fieldset > button > i")).click();
		driver.findElement(By.linkText("multinational corporation")).click();
		driver.findElement(By.partialLinkText("Forbes")).click();
		driver.manage().window().maximize();
		//driver.findElement(By.id("APjFqb")).sendKeys("google");

		
//		How to create X-path?
//		//[@ID="Write ID"]

	}

}
