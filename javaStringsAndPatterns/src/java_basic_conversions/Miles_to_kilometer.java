package java_basic_conversions;

import java.util.Scanner;

public class Miles_to_kilometer 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter distance in miles: ");
		Scanner scan = new Scanner(System.in);
		double miles = scan.nextDouble();

		double kilometer = 1.60 * miles;
		System.out.println(miles + " miles in kilometer is "+ kilometer+"km");
	}

}
