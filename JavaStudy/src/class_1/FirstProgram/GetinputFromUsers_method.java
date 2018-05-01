package class_1.FirstProgram;

// Scanner class is present in java.util package so we import this package in our program.
//its mandatory to use this for getting an input from user when by using Scanner

import java.util.Scanner;  

public class GetinputFromUsers_method 
{

	public static void main(String[] args) 
	{
			
		getString();
		
		getInteger();
		
		getDecimal();

	}
	
	public static void getString()
	{
		// Scanner class is present in java.util package so we import this package in our program.
		
		Scanner s=new Scanner(System.in);
		
		//Here Scanner is the class name, a is the name of object, 
		//new keyword is used to allocate the memory and System.in is the input stream. 
		
		System.out.println("Entered a string ");
		String inputString = s.nextLine();
		System.out.println("You entered a string " + inputString );
		System.out.println();
	}
	
	public static void getInteger()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer ");
		int integer = s.nextInt();
		System.out.println("You enered an integer " + integer);
		System.out.println();
	}
	
	
	public static void getDecimal()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a decimal number ");
		
		double decimal = s.nextDouble();
		
		System.out.println("You enered a decimal number " + decimal);
	}

}
