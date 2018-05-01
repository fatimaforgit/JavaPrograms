package class_1.FirstProgram;

public class Example_MultipleMethods 
{

	public static void main(String[] args) 
	{
		//addition
		System.out.println("Sum is " + add(20,30)); //print return value-expected result 30
		System.out.println("New Sum is " + add(1000,30));//print return value-expected result 1030

		//substraction		
		System.out.println("Sub is " + subtract(12.11,1.10)); //print return value-expected result 11.01
		System.out.println("New Sub is " + subtract(1000,30.22));//print return value-expected result 969.78
		
		//Multiply
		System.out.println("Multiply is " + multiply(10,21.3)); //print return value-expected result 213.0
		System.out.println("New Multiply is " + multiply(5,30.22));//print return value-expected result 151.10
		
		//division
		System.out.println("Divide is " + division(10,2)); //print return value-expected result 5.0
		System.out.println("New divide is " + division(9.11,3));//print return value-expected result 3.03
		
	} //end of main

	public static int add(int a, int b) //method for addition of two integer numbers
	{
		int sum = a + b ;
		return sum;
	}
	
	public static double subtract(double a, double b)//method for subtraction of two decimal numbers
	{
		double sub = a - b ;
		return sub ;
	}
	
	public static double multiply(int a, double b) //method for muliplication of two numbers
	{
		double mul = a * b ;
		return mul ;
	}
	
	public static double division(double a, int b) //method for division of two numbers
	{
		double div = a / b ;
		return div ;
	}
}
