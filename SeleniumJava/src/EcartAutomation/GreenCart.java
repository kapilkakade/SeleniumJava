package EcartAutomation;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		
		// here we are storing all the elements values in products list 
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		
		//Now suppose if we want to print the list on console
		
		for (int i=0;i<products.size();i++) {
			
			/*
			 If we want to print all the values on console
			  
			String name = products.get(i).getText();
			System.out.println(name);
			*/
			
			
			
			
		}
	}

}
