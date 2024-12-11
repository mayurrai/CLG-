import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Revise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement FirstName= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		FirstName.click();
		FirstName.sendKeys("Mayur");
		
		WebElement LastName= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		LastName.click();
		LastName.sendKeys("Rai");
		
		WebElement Address= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		Address.click();
		Address.sendKeys("Bh3 LPU");
		
		WebElement Email= driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		Email.click();
		Email.sendKeys("mayurrai2003@gmail.com");
		
		WebElement PhoneNumber= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		PhoneNumber.click();
		PhoneNumber.sendKeys("1234567890");
		
		WebElement Gender= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		Gender.click();
		
		WebElement Hobby= driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		Hobby.click();
		
		WebElement Hobby1= driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		Hobby1.click();
		
		WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
        uploadElement.sendKeys("C:\\Users\\mayur\\Pictures\\Wallpaper\\289.jpg");
		
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();  
		driver.findElement(By.xpath("//li/a[text()='English']")).click();  
		
		
        Select Skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
        Skill.selectByIndex(4);
        
        Select Country= new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
        Country.selectByIndex(0);
        
        
        WebElement Country1=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
        Country1.click(); 
      
        WebElement SelectCountry= driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]"));
        SelectCountry.click();
        
        Select Year= new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
        Year.selectByValue("2003");
        
        Select Month= new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
        Month.selectByValue("January");
        
        Select Date= new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
        Date.selectByValue("2");
        
        WebElement Password=driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
        Password.click(); 
      

        WebElement ConfPassword=driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
        ConfPassword.click(); 
      
        WebElement Submit=driver.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
        Submit.click(); 
        
        
        Thread.sleep(5000);
        
		driver.quit();


	}

}
