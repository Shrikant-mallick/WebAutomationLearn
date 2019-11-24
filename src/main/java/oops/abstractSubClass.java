package oops;

public class abstractSubClass extends AbstractMethod
{
	// Method without body or no implementation is called as Method abstraction
	// If any class have abstract method then the class should also be declared as abstract.
	// Abstract class cannot be instantiated..(We are not allowed to create object of the abstract class.)
	// If any method is abstract then every sub-class need to implement the abstract method.
	
	public void a2()
	{
		System.out.println("A2 method");
	}
	
	public void a1()
	{
		System.out.println("A1 abstract method implementation");
	}
	
	public static void main (String [] args)
	{
		AbstractMethod abs = new abstractSubClass();
		
		abs.a1();
		
		//hello
		
		abstractSubClass ab = new abstractSubClass();
		
		ab.a2();
		
		ab.a3();
		
		ab.a1();
		
	}

}
