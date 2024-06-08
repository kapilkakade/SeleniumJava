package TestngDemo;

import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void login() {
		System.out.println("I am login module");
		
	}
	
	@Test
	public void webloginCarLoan() {
		System.out.println("I am Weblogin module");
	}

	@Test
	public void MobileLogincarLoan() {
		System.out.println("I am Mobilelogin module");
	}
	
	@Test
	public void LoginAPILoan() {
		System.out.println("I am RestAPI module module");
	}
}
