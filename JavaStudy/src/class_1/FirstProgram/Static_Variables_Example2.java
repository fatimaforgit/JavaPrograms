package class_1.FirstProgram;
/* every object created owns its own variable. 
 * But when the variable is declared as static now the objects do not own the variable but the class 
 * within which this variable is decalred static owns the variable
 * example: if 'i' is a variable of class 'var' then in general objects var v1 = new var(); var v2 = new var();var v3 = new var();
 * these ojects v1 owns its own i, v2 owns its own i and v3 owns its own i which means i owned by v1 is different than the i owned by v2
 * they are not the same i but considered different i's
 * but when i is declared static it is now owned by the class var hence it should be called var.i(=classname.variablename)
 * which means all i's called/used by v1,v2 and v3 are treated same i
 */
public class Static_Variables_Example2
{

	public static void main(String[] args) 
	{
		// for class "variable_Without_Static "
		variable_Without_Static v1=new variable_Without_Static();
		variable_Without_Static v2=new variable_Without_Static();
		variable_Without_Static v3=new variable_Without_Static();
		
		System.out.println("\n");
		
		// for class "variable_With_Static "
		variable_With_Static var1=new variable_With_Static();
		variable_With_Static var2=new variable_With_Static();
		variable_With_Static var3=new variable_With_Static();
		
		System.out.println("\n");
		
		// or using right way of calling a static variable we can call it like below
		// only possible for class "variable_With_Static "
		
		variables_With_Static_using_CallingStaticVariableByStandardWay varByStandardWay=new variables_With_Static_using_CallingStaticVariableByStandardWay();
				
	}

}

class variable_Without_Static
{
	int i=0;
	
	variable_Without_Static()   //constructor
	{
		i++;
		System.out.println("i value Without Static" + i);
	}
	
}

class variable_With_Static
{
	static int i=0;
	
	variable_With_Static()  //constructor
	{
		i++;
		System.out.println("i value With Static" + i);	
	}
	
}

class variables_With_Static_using_CallingStaticVariableByStandardWay
{
	static int i=0;
	
	variables_With_Static_using_CallingStaticVariableByStandardWay()  //constructor
	{
		do
		{
			i++;
			System.out.println("when calling static variable by using standard way " + variables_With_Static_using_CallingStaticVariableByStandardWay.i);
			
		}while(i<3);
	}
	
}


