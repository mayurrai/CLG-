import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class demo {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		
		WebElement Login= driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Login.click();
		
		WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys("practice");
		
//		Second way to write the code
//		driver.findElement(By.xptah("")).sendkeys("");		

		WebElement PassWord=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		PassWord.click();
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");
		
		WebElement LoginButton= driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		LoginButton.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		

	}

}
