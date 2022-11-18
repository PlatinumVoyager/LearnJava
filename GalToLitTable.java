package helloworld;

public class GalToLitTable {
	public static void main(String[] args)
	{
		int gallons; double liters;
		
		int c;
		
		c = 0;
		for (gallons = 1; gallons <= 100; gallons++)
		{
			liters = gallons * 3.7854;
			
			System.out.printf("%d gallons is %.2f liters\n", gallons, liters);
			c++;
			
			// start loop
			if (c == 10)
			{
				System.out.println();
				
				c = 0;
			}
		}
	}
}
