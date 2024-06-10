package EcartAutomation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* This code is written by Kapil Kakade
 * 
 * Pre-requisites :
 * 
 * 1. Download the latest/suitable ChromeDriver.exe and put it in the path - C:\\Chromedriver
 *  
 * 
 * */


public class GreenCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		

		
		Thread.sleep(2000);
		//Go and click on to dropdown to see all 20 elements
		driver.findElement(By.xpath("//option[@value=\"20\"]")).click();
		Thread.sleep(2000);
		
		
		
		//prepare and be ready with a variable productNames to store the names of list in list		
		List<WebElement> productNames = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		
		//capture the list of product names in productNames named list	i.e. new original list
		List<String> originalList = productNames.stream().map(s->s.getText()).collect(Collectors.toList());
		/*  
		for (int i=0; i<originalList.size();i++) {                            //To print the originalList
			String original = originalList.get(i);
			System.out.println(original);
		}
		System.out.println("*****************************************");
		*/
		
		
		
		// sort on original list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());	
		/*
		for (int i=0; i<sortedList.size();i++) {                            //To print the sortedList
			String sorted = sortedList.get(i);
			System.out.println(sorted);
		}
		System.out.println("*****************************************");
		*/

		
		
		
		//Click on the column to sort the table on web page
		driver.findElement(By.xpath("//th[@aria-label=\"Veg/fruit name: activate to sort column ascending\"]")).click();
		Thread.sleep(2000);
		
		
		
		//capture the websorted list in List variable capturedList
		List<WebElement> capturedList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> afterWebSort = capturedList.stream().map(s->s.getText()).collect(Collectors.toList());
		/*
		for (int i=0; i<afterWebSort.size();i++) {                        //To print the afterWebSort
			String webSorted = afterWebSort.get(i);
			System.out.println(webSorted);
		}
		*/
		
		// compare sorted list vs webSorted list
		Assert.assertTrue(sortedList.equals(afterWebSort));
	}
}
