package rahulshettyacademy.tests;

import java.io.IOException;
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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import myframework.AbstractComponents.AbstractComponent;
import myframework.PageObjects.CartPage;
import myframework.PageObjects.CheckoutPage;
import myframework.PageObjects.ConfirmationPage;
import myframework.PageObjects.LandingPage;
import myframework.PageObjects.OrderPage;
import myframework.PageObjects.ProductCatalogue;
import rahulshettyacademy.TestComponents.BaseTest;

public class SubmitOrderTest2 extends BaseTest {

	
	String productName = "ZARA COAT 3";
	
	
	@Test
	public void SubmitOrder() throws IOException, InterruptedException {

	

		ProductCatalogue productCatalogue = landingPage.loginApplication("ecommerce1@gmail.com", "Rahul@123");

		List<WebElement> products = productCatalogue.getProductList();

		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();

		// validations on cartPage
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goTocheckout();
		
		checkoutPage.selectCountry("India");
		
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		System.out.println("Flow passed successfully");

	}
	
	
	@Test(dependsOnMethods = {"SubmitOrder"})
	public void OrderHistoryTest() {
		
		ProductCatalogue productCatalogue = landingPage.loginApplication("ecommerce1@gmail.com", "Rahul@123");
		OrderPage orderPage = productCatalogue.goToOrdersPage();
		Assert.assertTrue(orderPage.VerifyOrderDisplay(productName));
		
	}
	

}
