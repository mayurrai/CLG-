import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement Alert1= driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']"));
		Alert1.click();
		
		WebElement ClickButtonForAlert1= driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		ClickButtonForAlert1.click();
		
		
        String alertText1 = driver.switchTo().alert().getText();
        System.out.println("Alert Message 1 : " + alertText1);
		
		driver.switchTo().alert().accept();
		
		WebElement Alert2= driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		Alert2.click();
		
		WebElement ClickButtonForAlert2= driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']"));
		ClickButtonForAlert2.click();
		
		
        String alertText2 = driver.switchTo().alert().getText();
        System.out.println("Alert Message 2 : " + alertText2);
		
		driver.switchTo().alert().dismiss();
		
		WebElement Alert3= driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
		Alert3.click();
		
		WebElement ClickButtonForAlert3= driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		ClickButtonForAlert3.click();
		
		
        String alertText3 = driver.switchTo().alert().getText();
        System.out.println("Alert Message 3 : " + alertText3);
		driver.switchTo().alert().sendKeys("Demo Alert");
		driver.switchTo().alert().accept();
		
			
	}

}
