package java_basic_conversions;

import java.util.Scanner;

public class Compound_Interest 
{

	public static void main(String[] args) 
	{	
		double amount, rate, years, compoundInterest;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount");
		amount = scan.nextDouble();
		
		System.out.println("Enter % rate");
		rate = scan.nextDouble();
		
		System.out.println("Enter number of years");
		years = scan.nextDouble();
		
		double mathVlaue = Math.pow((1+rate), years);
		
		compoundInterest = amount*mathVlaue;
		
		System.out.println("compound interest is "+compoundInterest);
	}

}
