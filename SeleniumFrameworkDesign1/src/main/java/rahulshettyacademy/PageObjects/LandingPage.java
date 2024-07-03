package rahulshettyacademy.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		super(driver);                              // This is used to send a variable from child to parent
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	
	//PageFactory

	@FindBy(id="userEmail")            // another method of declaring
	WebElement userEmail;
	
	@FindBy(id="userPassword")          
	WebElement userPassword;
	
	@FindBy(id="login")          
	WebElement submit;
	
	
	
	public ProductCatalogue loginApplication(String email, String password) {
		
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		submit.click();
		ProductCatalogue productCatalogue = new ProductCatalogue(driver); 
		return productCatalogue;
	}
	
	public void goTo() {
		
		driver.get("https://rahulshettyacademy.com/client");
	}
	

	@FindBy(css="[class*='flyInOut']")          
	WebElement errorMessage;
	
	public String getErrorMessage() {
		
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();	
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

