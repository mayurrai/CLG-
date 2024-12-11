import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.com/");
		
		driver.manage().window().setSize(new Dimension(1024,768));
		
		WebElement SearchBar= driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
		SearchBar.click();
		
		SearchBar.sendKeys("Google");
		
		WebElement SearchButton= driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button"));
		SearchButton.click();
		
		WebElement Link= driver.findElement(By.linkText("multinational corporation"));
		Link.click();
		
		WebElement partialLink= driver.findElement(By.partialLinkText("traded"));
		partialLink.click();

	}

}
