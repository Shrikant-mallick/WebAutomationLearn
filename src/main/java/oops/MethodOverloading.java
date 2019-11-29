package oops;

public class MethodOverloading 
{
	int x = 10;
	
	public void A1(int x)
	{
		System.out.println("A1 Method with 1 parameter");
		//x = 10;
		int a = this.x; 
		System.out.println("Value of a: "+ a);
	}
	
	public void A2()
	{
		System.out.println("A2 method");
	}

	public void A1()
	{
		System.out.println("A1 method with 0 parameters");
	}
	
	public void A1(int a, int b)
	{
		System.out.println("A1 method with 2 parameters");
		
		System.out.println("a : "+ a + "b : "+ b );
	}
	
}
