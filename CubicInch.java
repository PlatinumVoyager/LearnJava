package helloworld;

import java.util.Locale;

public class CubicInch 
{
	public static void main(String[] args)
	{
		long ci, im;
		
		im = 5280 * 12; ci = im * im * im;
		
		System.out.printf(Locale.US, "There are %,d cubic inches in a cubic mile%n", ci);
	}
}
