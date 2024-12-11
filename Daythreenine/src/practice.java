import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		driver.manage().window().setSize(new Dimension(1024,768));
		
		WebElement UserName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
		UserName.click();
		
		UserName.sendKeys("practice");
		
		WebElement Password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		
		Password.sendKeys("SuperSecretPassword!");
		
		WebElement LoginButton= driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		LoginButton.click();
		

	}

}
