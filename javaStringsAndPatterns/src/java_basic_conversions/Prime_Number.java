package java_basic_conversions;
/*
 Steps to find if a given number is a prime number:
 1. take mod of the given number by each number beginning from 1 to the number itself. Example if number if 5 then take 5%1 then 5%2.... 5%5
 2. Count the number of zeroes obtained as a result of the above mod
 3. For a prime number, result of this mod will yield only two zeros
 4. count number of zeros. If count <= 2 then given number is a whole number. If count is greater than 2 then its not a prime number
 */
import java.util.Scanner;

public class Prime_Number 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int givenNumber= scan.nextInt();
		System.out.println("You entered: "+givenNumber);

		int count=0;
		
		for(int i=1;i<=givenNumber;i++)
		{
			double mod = givenNumber%i;
			//checking if above mod is yeilding zero
			if(mod==0)
			{
				count=count+1;
			}
		}
		
		//checking if number of whole numbers is 2. If yes then its a prime number
		if(count<=2)
		{
			System.out.println(givenNumber+" is a prime number");
		}
		else
		{
			System.out.println(givenNumber+" is not a prime number");
		}
			
	}

}
