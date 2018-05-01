package SeleniumTraining;



public class write_instead_of_print {

	public static void main(String[] args) {
Persons p=new Persons("Anees","Fatima",true);
		
		System.out.println(p.f + "  " + p.l + "  " + p.t);
		
		// more than one object can be defined for the same constructor
		
		//Person q=new Person("Anees","Fatima",true);
		//System.out.println(q.f + "  " + q.l + "  " + q.t);
	}

}

class Persons
{
	String f; String l; boolean t;
	
	Persons(String firstName, String lastName, boolean test)
	{
		System.out.println("Constructor is called");
		
		f=firstName;
		l=lastName;
		t=test;
		
	}
	
}