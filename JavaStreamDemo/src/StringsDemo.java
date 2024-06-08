
public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is demo String and it is stored in s variable";       // String is nothing but an object represents sequence of characters           // This is literal method
		String s1 = "This is demo String and it is stored in s variable";       // it will not create a new memory for s1 because the content is same. it will still refer to s
			
		String s2 = new String("Welcome to the string");
		String s3 = new String("Welcome to the string");                        // This will create a new memory for s3 even though the content is same as s2
		
		
		String[] splittedString = s.split(" "); 					// here we are splitting the content of the whole string into mutiple strings
		for (int i=0; i<splittedString.length; i++) {
			System.out.println(splittedString[i].trim());          // trim is not necessary here. But there could be some whitespaces which will be removed using trim
		}
		
		System.out.println("*************************************************");
		
		// To print it in reverse order
		for (int i=splittedString.length-1; i>=0; i--) {
			System.out.println(splittedString[i].trim());          // trim is not necessary here. But there could be some whitespaces which will be removed using trim
		}
		
		
		System.out.println("*************************************************");
		
		
		String[] splittedString1 = s.split("and");     // cut the whole line in 2 parts at 'and'         1. before and      2. after and
		System.out.println(splittedString1[0]);        // 1. before and 
		System.out.println(splittedString1[1]);		   //  2. after and
		System.out.println(splittedString1[1].trim());	// removes white space before '  it is
		
		
		System.out.println("*************************************************");
		
		// to print every character by character of the string
		
		for(int i=0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		
		System.out.println("*************************************************");
		
		//  ********************************   print the string in reverse order  ************************
		
		for(int i=s.length()-1; i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
