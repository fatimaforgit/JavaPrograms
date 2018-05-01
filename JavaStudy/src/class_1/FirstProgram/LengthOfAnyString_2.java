package class_1.FirstProgram;

// Program to find length of any string using methods

public class LengthOfAnyString_2
{

	public static void main(String[] args) 
	{
		
		somestring();
		System.out.println("The given string is " + somestring());
		System.out.println("Length of given string is " +somestring().length());
	

	}
	public static String somestring()
	{
		String str = "abc123456" ;
		return str ;
		
	}


}

