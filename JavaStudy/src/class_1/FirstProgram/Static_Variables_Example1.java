package class_1.FirstProgram;

public class Static_Variables_Example1 
{

	public static void main(String[] args) 
	{
		staticVariable var=new staticVariable();
		System.out.println("Value of id after completion of for loop is " + staticVariable.id);
		// static variables are called using syntax classname.variablename(that is decalred static)
	}

}

class staticVariable
{
	static int id;
	
	staticVariable(int id)
	{
		for(int ids=id;id<3;id++)  //here variable id is initialised to a value given by the user
		{
			System.out.println("printing value of id when it is initialised by user " + ids);
		}
	}
	
	staticVariable()
	{
	   for(;id<3;id++) 			//id is not initialized manually. Since it is declared static id is initialised to 0 by java compiler
		{
		   System.out.println("Since variable 'id' is declared static it is initialised to 0 by java compiler " + id);
		}
		
	}
	
		
}
