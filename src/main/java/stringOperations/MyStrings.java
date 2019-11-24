package stringOperations;

public class MyStrings
{
	//Instance variable
	String s3 = "ABCString3";
	
	public void indexsearch()
	{
		//local variable
		String Char = "This is a learning Program for CharAt String Operations.";
	
		System.out.println("CharAt : "+ Char.charAt(25));
	}
	
	public void compare()
	{
		String s1 = "This is String1.";
		
		String s2 = "This is String2";
		
		
		System.out.println("Comparing string : "+s1.compareTo(s2));
		
		System.out.println(s3.compareTo(s1));
	}
	
	//Static variable
	static int a = 10;
	String b2 = "HarshadaTendulkar";
	
	public void StringMethods(int a1)
	{
		
		String b1 =  "ABCDEFGH";
		
		a1 = this.a;
		
		int a2 = MyStrings.a;
		
		System.out.println("String Variable : " + a1);
		
		System.out.println("String Variable : " + a2);
		
		System.out.println("Concating String : " + b1.concat("IJKLMN"));
		
		System.out.println("Length of string: "+b1.length());
		
		System.out.println("IgnoreCase : "+ b1.equalsIgnoreCase("abcdefgh"));
		
		System.out.println("Ignore Case :" + b1.equalsIgnoreCase("abcd"));
		
		String b3 = "Shrikant Mallick";
		
		String b4 = "Shrikant  ";
		
		System.out.println("SubString with one parameter:"+ b1.substring(4));
		
		System.out.println("SubString2:"+ b1.substring(0,4));
		
		System.out.println("LowerCase" + b2.toLowerCase());
		
		System.out.println("LowerCase" + b2.toUpperCase());
		
		System.out.println("Trim : "+ b4.trim()+"..");
		
		System.out.println("StartWith:" + b3.startsWith("Sh") + "EndsWith:"+ b3.endsWith("ick"));
		
		System.out.println("StartWith:" + b3.startsWith("Sh",7));
		
		//Hello
		
		
	}
	
	
}
	
