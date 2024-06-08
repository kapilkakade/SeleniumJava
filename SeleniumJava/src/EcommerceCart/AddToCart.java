package EcommerceCart;

import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		List<WebElement> productNames = driver.findElements(By.xpath("//h4[@class=\"product-name\"]")); // The xpath represents the name of the item. As long as we have multiple names we can take all the names in a list
			
		for(int i=0; i<productNames.size();i++) {                                                         // This for loop will iterate through the n number of items where n = productNames.size()
			
			String[] names = productNames.get(i).getText().split("-");              // productNames.get(i) will navigate to i th element from there we are doing getText and further splitting the name to remove 1 kg
			String itemName = names[0].trim();                                        // after splitting we are storing name by trimming it and taking 0 th index of name means in a name remove further spaces 
			//System.out.println(itemName);                                            // printing the name, and this whole process is looping means it will print all the names through iteration.
			
			// We need to to convert our itemsNeeded array into a list
			
			/*Arrays: An array is a group of like-typed variables that are referred to by a common name. 
			 * An array can contain primitives data types as well as objects of a class depending on the definition of the array. 
			 * In the case of primitives data types, the actual values are stored in contiguous memory locations. 
			 * In the case of objects of a class, the actual objects are stored in a heap segment.

			List: The Java.util.List is a child interface of Collection. 
			It is an ordered collection of objects in which duplicate values can be stored. 
			Since List preserves the insertion order, it allows positional access and insertion of elements. 
			List Interface is implemented by ArrayList, LinkedList, Vector, and Stack classes.*/
			
			List itemNeededList = Arrays.asList(itemsNeeded);                            // Converted array into a list
			
			int j = 0;
			if(itemNeededList.contains(itemName)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click(); // click on Add to Cart button. here we are using driver.findElements because this is generic xpath of Add to cart
																										 // it will highlight all the add to cart buttons. but when we are using get(i) under if condition 
																										// so it will click add to cart only when itemNeededList contains the itemName
				
				if(j==itemsNeeded.length) {                                   // We use length() method to get size of an Array and size() method to get size of Array list.
					break;
				}				
			}
		}
		//Thread.sleep(5000);
		//driver.close();
	}
}
