package java_basic_conversions;

import java.util.Scanner;

// To find factorial of a given number

public class Factorial 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a whole number");
		Scanner scan = new Scanner(System.in);
		int givenNumber = scan.nextInt();

		int fact =1;
		for(int i=2;i<=givenNumber;i++)
		{
			fact=fact*i;
		}

		System.out.println("Factorial of "+givenNumber+" is: "+ fact);

	}

}
