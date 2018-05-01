package java_strings;

import java.util.Scanner;

public class Reverse_digits_of_number 
{

	public static void main(String[] args) 
	{
		// way 1
		System.out.println("Enter a whole number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		StringBuffer numRev = new StringBuffer(num+"");
		
		System.out.println(numRev.reverse());
		System.out.println();

		
		//way 2
		
		System.out.print("Reverse by way 2:  \n");
		//condition : continue till num is not equal to zero. 0/10=infinity hence condition is num!=0
		while(num!=0)
		{
			//taking reverse by 10 1234%10 = 4
			int reverse = num%10;
			System.out.print(reverse);
			
			//taking givenNum/10 = 1234/10=123,because givenNum is int not float,. Last would be 0/10=infinity hence condition is num!=0
			num = num/10;
						
		}
				
	}

}
