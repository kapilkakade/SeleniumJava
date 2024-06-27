package myframework.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import myframework.PageObjects.CartPage;
import myframework.PageObjects.OrderPage;

public class AbstractComponent {

	WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	By productVisibility = By.cssSelector(".mb-3");

	public void waitForElementToAppear(By findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy)); // wait until the products
																							// are loaded completely

	}
	
	public void waitForWebElementToAppear(WebElement findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOf(findBy)); // wait until the products
																							// are loaded completely

	}

	public void waitForElementToDisappear(WebElement ele) throws InterruptedException {

		Thread.sleep(1000); // for faster run because further method will take more time
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		// wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
	}

	
	@FindBy(css = "[routerlink*='cart']")
	WebElement cartHeader;
	public CartPage goToCartPage() {
		
		cartHeader.click();
		
		CartPage cartPage = new CartPage(driver);
		return cartPage;
		
	}
	
	
	@FindBy(css = "[routerlink*='myorders']")
	WebElement orderHeader;
	public OrderPage goToOrdersPage() {
		
		orderHeader.click();
		
		OrderPage orderPage = new OrderPage(driver);
		return orderPage;
		
	}
	
	
	
	
	
	
	
	
	
	
}
