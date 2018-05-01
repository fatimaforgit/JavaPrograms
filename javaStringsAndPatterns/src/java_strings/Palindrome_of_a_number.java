package java_strings;
// check if a given number is a palindrome
import java.util.Scanner;

public class Palindrome_of_a_number 
{

	public static void main(String[] args) 
	{

		System.out.println("Enter a whole number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		StringBuffer numRev = new StringBuffer(num+"");

		System.out.println("reverse of a given number is: "+numRev.reverse());
	
		if(numRev.equals(numRev.reverse()))
				{
			System.out.println("Given number is a Palindrome");
				}
		else
		{
			System.out.println("Given number is Not a Palindrome");
		}

	}

}
