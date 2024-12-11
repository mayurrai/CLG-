import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOpen {
	WebDriver driver;
	
	public void openBrowser() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleOpen obj=new GoogleOpen();
		obj.openBrowser();
	}
}