import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class registrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		
//		Maximum size
		driver.manage().window().fullscreen();
		
//		Set size
		driver.manage().window().setSize(new Dimension(1024, 1920));

		
		
		
		
		WebElement FirstName= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[1]/input"));
		FirstName.click();
		
		FirstName.sendKeys("Mayur");
		
		WebElement LastName= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[2]/input"));
		LastName.click();
		
		LastName.sendKeys("Rai");
		
		WebElement MartialStatus= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[2]/div/label[1]/input"));
		MartialStatus.click();
		
		WebElement Hobby= driver.findElement((By.xpath("//*[@id=\"register_form\"]/fieldset[3]/div/label[3]/input")));
		Hobby.click();
		
		Select Country = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")));
        Country.selectByIndex(1);
        Select Month = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[1]/select")));
        Month.selectByIndex(1);
        Select Day = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[2]/select")));
        Day.selectByIndex(1);
        Select Year = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[3]/select")));
        Year.selectByIndex(1);
		
		WebElement PhoneNumber= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[6]/input"));
		PhoneNumber.click();
		
		PhoneNumber.sendKeys("7067925208");
		
		WebElement UserName= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[7]/input"));
		UserName.click();
		
		UserName.sendKeys("mayuR");
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[8]/input"));
		Email.click();
		
		Email.sendKeys("sheisthe1@gmail.com");
		
		WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[9]/input"));

        uploadElement.sendKeys("C:\\Mayur\\LPU\\Semester 6\\QA\\Selenium\\Assignment4\\src\\test\\java");

		
		WebElement About=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[10]/textarea"));
		About.click();
		
		About.sendKeys("Testing");
		
		
		WebElement Pass= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[11]/input"));
		Pass.click();
		
		Pass.sendKeys("121mayur");
		
		
		WebElement ConfPass= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[12]/input"));
		ConfPass.click();
		
		ConfPass.sendKeys("121mayur");
		
//		added sleep time for the tester to view weather the data entered in that is done.
//		Thread.sleep(1000);
		
		WebElement Submit= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[13]/input"));
		Submit.click();
		
//		driver.close();	
//		driver.quit();
	}

}
