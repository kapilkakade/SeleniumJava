package myframework.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import myframework.AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {
	
	WebDriver driver;

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy (css = ".cartSection h3")
	private List<WebElement> productTitles;
	
	public Boolean VerifyProductDisplay(String productName) {
		Boolean match = productTitles.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}
	
	
	
	@FindBy (css = ".totalRow button")
	WebElement checkoutEle;
	
	public CheckoutPage goTocheckout() {
		checkoutEle.click();
		
		return new CheckoutPage(driver);
		
	}
	
	
	
	
	
	
	
	
}	


