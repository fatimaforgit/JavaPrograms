package java_strings;

public class Palindrome_string_without_reverse_method 
{

	public static void main(String[] args) 
	{
		String s = "hoeooh";
		int count = 0;

		for (int i = 0; i < s.length()/2; i++) 
		{
			if(s.charAt(i)==s.charAt(s.length()-(i+1)))
			{
				count=count+1;
			}

		}

		if(count==s.length()/2)
		{
			System.out.println("given string is a palindrome");
		}
		else
			System.out.println("given string is NOT a palindrome");

	}

}
