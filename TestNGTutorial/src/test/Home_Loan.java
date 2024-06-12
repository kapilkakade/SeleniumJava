package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Home_Loan {
	
	@Parameters({"URL", "username"})                                          // actual URL is given in testng.xml and that variable is given here
	@Test
	public void WebHomeLoanLogin(String url, String username) {
		System.out.println("This is Web login for Home Loan");	
		System.out.println(url);
		System.out.println(username);
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
