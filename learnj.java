package helloworld;

// java source code files are officially known as a "compilation unit"

/*
 the "public" keyword is known as an access modifier
 access modifiers determine how other parts of the program can access members/instance 
 variables of the class
 
 public - member can be accessed by code outside of the class
 private - prevents member being used by code outside of the class
 
*/

public class learnj 
{

	public static void main(String[] args)
	{
		
		// start
		
		// this is known as a "member" or "instance variable"
		// methods are functions
		String myString = "this string";
		
		System.out.printf("%s\n", myString);
		
		// end
		
	}
}
