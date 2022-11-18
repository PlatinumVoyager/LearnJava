package helloworld;

public class GalToLit 
{
	public static void main(String[] args)
	{
		double gallons, liters;
		
		gallons = 10;
		liters = gallons * 3.7854;
		
		System.out.printf("%.1f gallons = %.3f liters\n", gallons, liters);
	}
	
}
