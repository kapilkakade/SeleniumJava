
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name = d.getData();															// This is a method of get Data
		System.out.println("This is a returned string from getData method: " + name );      // This is a returned string from getData method: Kapil Kakade
		
		
		
		System.out.println("******************************************");
		
		
		
		MethodsDemo2 m = new MethodsDemo2();												// This data is coming from another class named as MethodsDemo2
		String name2 = m.getData();
		System.out.println("This is a returned string from another class method: " + name2 ); //This is a returned string from another class method: Another class
		
		
		System.out.println("******************************************");
		
		
		String name3 = putData();															// This is a static method data which can be accessed without any object by the demo class
		System.out.println("This is a returned string from static method: " + name3);       // This is a returned string from static method: I am put Data returned value

		
		
		
	}
	
	//define getData method
	public String getData() {
		
		System.out.println("This is a method of get Data");
		return "Kapil Kakade";
	}
	
	
	//define putData method
	public static String putData() {
		
		System.out.println("This is a static method data which can be accessed without any object by the demo class");
		
		return "I am put Data returned value";
		
	}

}




























