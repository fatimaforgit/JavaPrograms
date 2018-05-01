
// using parameters in constructors - constructor parameterization

public class Example_Constructors_2
{

	public static void main(String[] args) 
	{
		Person p=new Person("Anees","Fatima",true);
		
		System.out.println(p.f + "  " + p.l + "  " + p.t);
		
		// more than one object can be defined for the same constructor

		//Person q=new Person("Anees","Fatima",true);
		//System.out.println(q.f + "  " + q.l + "  " + q.t);

	}

}

class Person
{
	String f; String l; boolean t;
	
	Person(String firstName, String lastName, boolean test)
	{
		System.out.println("Constructor is called");
		
		f=firstName;
		l=lastName;
		t=test;
		
	}
	
}
