import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class DropDownLang {

	public static void main(String[] args) {
		
	    WebDriver driver = new ChromeDriver();
        driver.get("https:wikipedia.com");
                
        List<WebElement> links= driver.findElements(By.tagName("option"));
    	System.out.println("Total No. of Link: " + links.size());

    	
        for(WebElement link:links) {
        	
        	System.out.println(link.getText()+" "+link.getAttribute("lang"));
        	
        }

	}

}
