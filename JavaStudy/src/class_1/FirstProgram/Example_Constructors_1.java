package class_1.FirstProgram;

public class Example_Constructors_1 
{

	public static void main(String[] args) 
	{
		Person p=new Person();
		
		System.out.println(p.firstName + "  " + p.lastName + "  " + p.test);

	}

}

class Person
{
	String firstName; String lastName; boolean test;
	
	Person()
	{
		System.out.println("Constructor is called");
		firstName="Anees"; lastName="Fatima"; test=true;
		//we can use print statement within constructor
		//System.out.println(firstName + "ln" + lastName + "ln" + test);
	}
	
}
