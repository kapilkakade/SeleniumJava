package TestngDemo;

public class OperationOnChild extends MultiplyChild {
	
	int a;
	
	
	//default constructor
	public OperationOnChild(int a) {            // scope of a in this bracket will be only for this method
		// TODO Auto-generated constructor stub
		
		super(a);
		this.a=a;                         // this class's variable a written in 5th class will get the value of a written in 7th line.
	}

	public int Increment() {  // if we want to perform using parameters we can write Increment(int a) so that value of a will go and sit here.
		a=a+1;
		return a;
	}

	public int Decrement() {
		a=a-1;
		return a;
	}
	
}
