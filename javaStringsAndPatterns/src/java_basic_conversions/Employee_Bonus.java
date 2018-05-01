package java_basic_conversions;

import java.util.Scanner;

public class Employee_Bonus 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter current salary in rupess and bonus percentage: ");
		Scanner scan = new Scanner(System.in);
		int salary = scan.nextInt();
		System.out.println("Enter bonus percentage: ");
		double bonus = scan.nextDouble();
		
		System.out.println("You entered salary "+salary+" INR and bonus "+ bonus+ " % \n");

		double salaryWithBonus = salary+(salary*bonus/100);
		System.out.println("your revised salary with bonus is: " + salaryWithBonus);
		
		
	}

}
