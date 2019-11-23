package stringOperations;

public class MyStrings
{
	public void indexsearch()
	{
		String Char = "This is a learning Program for CharAt String Operations.";
	
		System.out.println("CharAt : "+ Char.charAt(25));
	}
	
	public void compare()
	{
		String s1 = "This is String1.";
		
		String s2 = "This is String2";
		
		String s3 = "ABCString3";
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s3.compareTo(s1));
	}
}
	
