package TestngDemo;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {

	
	@Test
	public void Run() {
		
		System.out.println("Will I execute before method ?");
		doThis();
		System.out.println("Will I execute after After method ?");
		
		int a=5;
		
		//Here we want to write code of operations in another class & giving parameter from this class
		OperationOnChild ops = new OperationOnChild(a);   //passing parameterized constructor
		
		
		
		
		
		System.out.println(ops.Increment());      // Here we can write or give parameter as Increment(a) and in OperationOnChild class see there
		System.out.println(ops.Decrement());
		
		//MultiplyChild mul = new MultiplyChild(a);
		
		System.out.println(ops.MultiplyThree());
		
	}

}
