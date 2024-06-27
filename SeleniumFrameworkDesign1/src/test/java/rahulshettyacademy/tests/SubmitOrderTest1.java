package rahulshettyacademy.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import myframework.AbstractComponents.AbstractComponent;
import myframework.PageObjects.CartPage;
import myframework.PageObjects.CheckoutPage;
import myframework.PageObjects.ConfirmationPage;
import myframework.PageObjects.LandingPage;
import myframework.PageObjects.ProductCatalogue;

public class SubmitOrderTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String productName = "ZARA COAT 3";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Login to page
		LandingPage landingPage = new LandingPage(driver); // This is done only for using driver in Landing page class
		landingPage.goTo();
		ProductCatalogue productCatalogue = landingPage.loginApplication("ecommerce1@gmail.com", "Rahul@123"); // We are using refactor method
																												

		// get all products in a list
		// ProductCatalogue productCatalogue = new ProductCatalogue(driver); // There is
		// no need to declare object for every class for that we can use alternate
		// method
		List<WebElement> products = productCatalogue.getProductList();

		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();

		// validations on cartPage
		// CartPage cartPage = new CartPage(driver);
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);

		CheckoutPage checkoutPage = cartPage.goTocheckout();

		checkoutPage.selectCountry("India");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();

		String confirmMessage = confirmationPage.getConfirmationMessage();

		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
		System.out.println("Flow passed successfully");

		driver.close();


	}

}
