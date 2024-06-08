import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList();           // In Array, the memory allocation is fixed and we cannot add values further. But array list is dynamic and we can add values in it as per requirement.
				
		//a is object of the class ArrayList. And now we can access the method using a.jadfsj 
			
		// here what type of array is not mentioned
		
		
		// for string array
		ArrayList<String> b = new ArrayList<String>();
		b.add("Shetty");
		b.add("Academy");
		b.add("Selenium");
		b.add("Course");
		
		b.get(1);   // to extract the values from ArrayList
		
		System.out.println(b.get(1));
		
		System.out.println("***********************");
 		
		b.remove(2);  // it will remove 2nd index i.e. Selenium
		
		for(int i=0; i<b.size();i++) {     // array List hence Size otherwise length              // We use length() method to get size of an Array and size() method to get size of Array list.
			System.out.println(b.get(i)); 
		}
		
		System.out.println("***********************");
		
		
		// another method to print an arraylist
		
		for(String val: b) {
			System.out.println(val);
		}
		
		System.out.println("***********************");
		
		// to check whether any string is present or not in the array list
		
		System.out.println(b.contains("Shetty"));
		System.out.println(b.contains("Selenium"));
		
		System.out.println("***********************");
		
		
		
	}

}
