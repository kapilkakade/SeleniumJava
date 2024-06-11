package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Home_Loan {
	
	@Parameters({"URL"})
	@Test
	public void WebHomeLoanLogin(String urlname) {
		System.out.println("This is Web login for Home Loan");	
		System.out.println(urlname);
	}
	
	@Test
	public void MobileHomeLoanLogin() {
		System.out.println("This is Mobile login for Home Loan");		
	}
	
	@Test
	public void APIHomeLoanLogin() {
		System.out.println("This is API login for Home Loan");		
	}
	
}
