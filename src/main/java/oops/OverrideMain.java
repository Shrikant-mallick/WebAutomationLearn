package oops;

public class OverrideMain extends MethodOverriding
{
	
	int a=10;
	
	public int b1(int x)
	{
		return x;
	}

	public static void main(String[] args) 
	{
		
		MethodOverriding mo = new OverrideMain();
		
		mo.a1();
		
		OverrideMain om = new OverrideMain();
		
		System.out.println(om.b1(10));
		
		System.out.println("Khaduuuuussssssssssssssssssss................");
		
		

	}

}
