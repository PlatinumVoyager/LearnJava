package helloworld;

public class HelloWorld
{
	// static allows global access
	static String randomString = "String to print";
	
	// final = constant
	static final double PI = 3.1459;
	
	public static void main(String[] args)
	{	
		
		byte bigB = 120;
		
		int one = 22;
		int two = one += 1;
		
		System.out.printf("%s\n%d\n", randomString, two);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		
		int i = 10;
		boolean x = true;
		
		if (x == true)
		{
			System.out.println("True");
		}
		
		switch (i)
		{
			case 10:
				System.out.println("10");
				break;
				
			default:
				System.out.println("None");
			
		}
		
		// java supports character codes
		char c_code = 44;
		System.out.printf("%c\n", c_code);
		
		String rand = "Random string";
		String another = "Stuff";
		
		// combine two strings
		String a = rand + another;
		
		System.out.println(a);
		
		// convert other data types to type String
		String byteString = Byte.toString(bigB);
		
		System.out.printf("%s\n", byteString);
	}
}
