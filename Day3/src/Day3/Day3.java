package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day3 {
	
	WebDriver driver;
	public void openBrowser() {
        driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        myClass obj = new myClass();
        obj.openBrowser();
	}

}
