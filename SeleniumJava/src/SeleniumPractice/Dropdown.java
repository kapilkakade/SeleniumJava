package SeleniumPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
		

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser

		driver.findElement(By.xpath("//input[@name=\"checkBoxOption1\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@name=\"checkBoxOption1\"]")).isSelected());
		
		
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());

	}

}
