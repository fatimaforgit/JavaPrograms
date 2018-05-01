package java_strings;

public class Palindrome_number_without_reverse_method 
{

	public static void main(String[] args) 
	{
		int num=1234321;
		String s = num+"";
		int length = s.length();
		char left;
		char right;
		
		int notPalindromeCount = 0;
		
		for (int i = 0; i <= s.length()/2; i++) 
		{
			left = s.charAt(i);
			right = s.charAt(length-1-i);
			if(left!=right)
			{
				notPalindromeCount = notPalindromeCount +1;
			}
									
		}
		
		if(notPalindromeCount>0)
			System.out.println("Given string is NOT a palindrom");
		else
			System.out.println("Given string is a palindrom");
	}

}
