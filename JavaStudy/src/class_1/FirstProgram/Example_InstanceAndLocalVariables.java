package class_1.FirstProgram;

/* A program to note that when instance variables are declared, 
 * a default value is assigned to them. There is no necessity to initialize them
 * while this is not the case of a local variable
 * local variables need to be initialized else an error message pops up
 */

public class Example_InstanceAndLocalVariables 
{

	public static void main(String[] args) 
	{
		instanceVariable i=new instanceVariable();
		
		i.printing();
		i.printingAgain();
	}
	
}
	//creating class outside the mother class
	class instanceVariable
	{
		//declaring instance variables
		String firstName, lastName;
		boolean fact;
		int a;
		double b;
		
		//creating method to print the instance variables
		public void printing()
		{
			System.out.println("default value assigned to a string is " + firstName);
			System.out.println("default value assigned to a boolean variable is " + fact);
			System.out.println("default value assigned to an integer is " + a );
			System.out.println("default value assigned to a double is " + b);
		}
		
		
		//creating another method to print the instance variables again
		//instance variables should be accessible by all methods created withing the same class
		
		public void printingAgain()
		{
			System.out.println("Printing from the second method");
			System.out.println("default value assigned to a string is " + lastName);
		}
	}


