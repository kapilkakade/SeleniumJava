package TestngDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {
	
	public void doThis() {
		System.out.println("I am here");
	}
	
	@BeforeMethod
	public void Before() {
		System.out.println("I should run before method");
	}
	
	@AfterMethod
	public void After() {
		System.out.println("I should run After method");
	}

}
