package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Car_Loan {
	 
	@Parameters({"URL"})                                          // actual URL is given in testng.xml and that variable is given here
	@Test
	public void WebCarLoanLogin(String urlname) {                // String urlname and passed URL value in urlname
		System.out.println("This is Web login for Car Loan");
		System.out.println(urlname);
	}
	
	@Test
	public void MobileCarLoanLogin() {
		System.out.println("This is Mobile login for Car Loan");		
	}
	
	@Test
	public void APICarLoanLogin() {
		System.out.println("This is API login for Car Loan");		
	}

}
