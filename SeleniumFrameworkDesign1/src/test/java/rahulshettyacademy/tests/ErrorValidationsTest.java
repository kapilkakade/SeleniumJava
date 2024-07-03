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
import rahulshettyacademy.AbstractComponents.AbstractComponent;
import rahulshettyacademy.PageObjects.CartPage;
import rahulshettyacademy.PageObjects.CheckoutPage;
import rahulshettyacademy.PageObjects.ConfirmationPage;
import rahulshettyacademy.PageObjects.LandingPage;
import rahulshettyacademy.PageObjects.ProductCatalogue;
import rahulshettyacademy.TestComponents.BaseTest;

public class ErrorValidationsTest extends BaseTest {

	@Test(groups = {"ErrorHandling"})
	public void LoginErrorValidation() throws IOException, InterruptedException {

		String productName = "ZARA COAT 3";
		landingPage.loginApplication("ecommerce1@gmail.com", "Rahul@123");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());
		System.out.println("Pass");
	}
	
	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException {

		String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue = landingPage.loginApplication("anshika@gmail.com", "Iamking@000");
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();
		// validations on cartPage
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		
	}

}
