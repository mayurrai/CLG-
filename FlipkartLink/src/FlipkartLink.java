import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://flipkart.com/");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		for (int i=0; i<links.size(); i++) {
			//System.out.println("------------");
			//System.out.println(link.getText()+ " " + link.getAttribute("href"));
			WebElement e1 = links.get(i);
			String url = e1.getAttribute("href");
			verifyLinks(url);
			}
			driver.quit();
			}

			public static void verifyLinks(String linkUrl)
			{
			try
			{
			URL url = new URL(linkUrl);


			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(1000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()>=400)
			{
			System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
			}

			//Fetching and Printing the response code obtained
			else{
			//System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
			System.out.println(linkUrl+" "+ httpURLConnect.getResponseCode());
			}
			}catch (Exception e) {
			}

			}

			}