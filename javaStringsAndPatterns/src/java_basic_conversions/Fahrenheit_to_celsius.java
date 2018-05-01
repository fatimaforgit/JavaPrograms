package java_basic_conversions;

import java.util.Scanner;

public class Fahrenheit_to_celsius 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter temparature in fahrenheit: ");
		Scanner scan = new Scanner(System.in);
		double fahrenheit = scan.nextDouble();

		double celsius = (fahrenheit-32)*5/9;
		System.out.println(fahrenheit + " degree F is "+ celsius+" degree C");
		
		
	}

}
