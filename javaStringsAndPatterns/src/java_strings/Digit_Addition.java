package java_strings;

import java.util.Scanner;

public class Digit_Addition 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a whole number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum=0;
		while(num!=0)
		{
			//taking reverse by 10 1234%10 = 4
			int reverse = num%10;
			System.out.print(reverse);
			sum=sum+reverse;
			
			//taking givenNum/10 = 1234/10=123,because givenNum is int not float,. Last would be 0/10=infinity hence condition is num!=0
			num = num/10;
						
		}
		System.out.println("\n sum of all digits is: " + sum);

	}

}
