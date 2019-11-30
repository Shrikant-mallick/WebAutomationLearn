package oops;

public class ArrayClass 
{
	public void array()
	{
		int[] A1  =  new int[] {1,2,3,4,5};
	
		for (int i =0 ; i<A1.length ; i++)
		{
			System.out.println("Aray printing:" + i + A1[i]);
			
			System.out.println("array : " + A1[i]);
		}
	}
	
	public static void main(String args[])
	{
		ArrayClass ac = new ArrayClass();
		
		ac.array();
	}
}
