package helloworld;

import java.util.Date;
import java.util.Locale;

public class LocalFormat {
	public static void main(String[] args)
	{
		long bigNum = 1000000000;
		
		System.out.printf(Locale.US, "%,d%n", bigNum);
		
		// datetime
		Date d = new Date();
		
		System.out.printf("%tT\n", d);
	}
}
