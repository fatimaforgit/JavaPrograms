package class_1.FirstProgram;

public class Palindrome_using_StringBuffer_class 
{
	public static void main(String args[])
	{
		String s1 = "malam";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println("printing value of s2 " + s2);

// reversing given string and converting this String buffer value to string
		String reverse_of_s1 = s2.reverse().toString();
		
//Finding if s1 palindrome or not
		if(s1.equals(reverse_of_s1))
		{
			System.out.println("Given string is a palindrome");
		}

		else
		{
			System.out.println("Given string is not a plaindrome");
		}
	}

}