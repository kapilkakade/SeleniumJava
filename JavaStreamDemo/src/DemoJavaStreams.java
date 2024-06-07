
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoJavaStreams {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
			
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());

		
		List<String>sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
				
		Assert.assertTrue(originalList.equals(sortedList));
	}

}
