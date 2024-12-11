package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class way2automationLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		System.out.println("Current Tittle: "+ driver.getTitle());
		
		WebElement firstname= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[1]/input"));
		firstname.sendKeys("Mayur");
		
		driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[2]/input")).sendKeys("Rai");
		driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[3]/div/label[3]/input")).click();
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[4]/select")));
		dropdown.selectByIndex(1);
		Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[1]/select")));
		dropdown1.selectByIndex(1);
		Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[2]/select")));
		dropdown2.selectByIndex(1);
		Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[3]/select")));
	    dropdown3.selectByIndex(1);
	    
		WebElement files=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[9]/input"));
      String filePath = "C:\\Users\\mayur\\Downloads\\assertion.side";
      files.sendKeys(filePath);
		}

}
