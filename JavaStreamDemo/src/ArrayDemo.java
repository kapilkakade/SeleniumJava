import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[5];             // new will allocate memory for the array
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		int[] arr2 = {2,4,6,8,10};          // how to define an array
		//System.out.println(arr2[2]);   // It will print 6
		
		
		String[] name = {"Rahul","Shetty","Academy", "Selenium", "Course"};
		
		System.out.println("This is array arr1");
		
		//To print every element of arr1 array : 
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		
		System.out.println("***********************");
		
		
		//To print every element of arr2 array : 
		System.out.println("This is array arr2");
				for(int i=0;i<arr2.length;i++) {
					System.out.println(arr2[i]);
				}
				
				
		System.out.println("***********************");		
		
		
		//To print every element of name array : 
		System.out.println("This is array name");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		
		System.out.println("***********************");
		// another method to print an array
		
		System.out.println("This is another method to print array name");
		for (String s : name) {
			
			System.out.println(s);
		}
			
		
		System.out.println("***********************");
		
		// Convert an array to ArrayList
			
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Selenium"));
		
		
		
		
	}

}
