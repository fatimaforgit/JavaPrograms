package class_1.FirstProgram;

public class Example_Method_SmartAssistant_FloatingValues
{
	public static void main(String[] args) 
	{
		add(3.11,20); // calling method add()
				
		System.out.println("Sum is " + add(3.11,20)); //directly printing the sum without using any separate variable
		
		//OR
		
		// int total=add(10,20); // assigning a variable for return value which is not necessary 
				
		// System.out.println("Sum is " + total); // printing sum using a separate variable
	}
	
	public static double add(double a, int b)
	{
		double Sum;
		Sum = a + b ;
		return Sum;
		
	}

}
