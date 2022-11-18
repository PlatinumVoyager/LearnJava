package helloworld;

public class IfDemo 
{
	public static void main(String[] args)
	{
		int a, b, c;
		
		a = 2;
		b = 3;
		
		if (a < b)
		{
			System.out.println("a is less than b");
		}
		
		System.out.printf("\n");
		
		c = a - b;
		
		if (c >= 0)
		{
			System.out.println("C is non negative");
		
		} else if (c < 0) {
			System.out.println("C is negative");
		}
	}
}
