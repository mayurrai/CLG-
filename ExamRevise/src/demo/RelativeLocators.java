package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(RelativeLocator.with(RelativeBy.name("name")).above(By.name("phone"))).sendKeys("Mayur");
		driver.findElement(RelativeLocator.with(RelativeBy.name("phone")).below(By.name("name"))).sendKeys("54637829");
		driver.findElement(RelativeLocator.with(RelativeBy.name("email")).below(By.name("phone"))).sendKeys("mayur@gmail.com");
		driver.findElement(RelativeLocator.with(RelativeBy.name("city")).below(By.name("country"))).sendKeys("Delhi");
		driver.findElement(RelativeLocator.with(RelativeBy.name("username")).below(By.name("city"))).sendKeys("mayur23");
		driver.findElement(RelativeLocator.with(RelativeBy.name("password")).below(By.name("username"))).sendKeys("31jri3j");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[1]/div[2]/input")).submit();

		
	}

}
