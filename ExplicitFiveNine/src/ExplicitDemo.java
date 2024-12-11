import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitDemo {

	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("https://ums.lpu.in/lpuums/LoginNew.aspx");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
////		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
//		driver.findElement(By.xpath("//*[@id=\"txtU\"]")).sendKeys("12115953");
//		
//		wait.until(ExpectedConditions
//				.elementSelectionStateToBe(By.id("#TxtpedAutold_8767"), false));
//		
////		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"TxtpwdAutoId_8767\"]")).sendKeys("dwsfsf");
////		some time it can be solved by easiest way to by applying thread wait
		
	}

}



public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

	ChromeDriver driver= new ChromeDriver();
driver.get("https://ums.lpu.in/LpuUms/LoginNew.aspx");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30L))
.pollingEvery(Duration.ofSeconds(5L))
.ignoring(StaleElementReferenceException.class);*/
//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
//driver.findElement(By.id("txtU")).clear();
driver.findElement(By.id("txtU")).sendKeys("27942");
driver.findElement(By.id("TxtpwdAutoId_8767")).click();
Thread.sleep(20000);
//wait.until(ExpectedConditions
// .elementToBeSelected(By.cssSelector("#TxtpwdAutoId_8767")));


driver.findElement(By.id("TxtpwdAutoId_8767")).sendKeys("easkfcbs");
driver.findElement(By.id("iBtnLogins150203125")).click();
}
