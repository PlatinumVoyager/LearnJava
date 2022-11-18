package helloworld;

public class BlockDemo {
	public static void main(String[] args)
	{
		int i, j, x;
		
		i = 5;
		j = 10;
		
		// ; is known as a separator
		
		if (i != 0) 
		{
			System.out.println("i does not equal zero");

			x = j / i;
			
			Object o = x;
			
			System.out.printf("j / i is %d\n", x);
			System.out.println(o.getClass());
		}
		
	}

}
