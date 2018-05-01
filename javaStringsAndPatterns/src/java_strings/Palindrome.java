package java_strings;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter word to check if it is a palindrome or not");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		StringBuffer s= new StringBuffer(word);
		// since rev of a word of type string buffer can not be stored n a string, we need to convert it to string
		String rev = s.reverse().toString();
		
		if(word.equals(rev))
		{
			System.out.println("Given word is palindrome");
		}
		else
		{
			System.out.println("Given word is NOT a palindrome");
		}
	}

}
