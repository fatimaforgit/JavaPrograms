package class_1.FirstProgram;

// under method over riding we see two methods with ditto same arguments(copy of each other) are used in different classes
// here subclass extends superclass and both have same method defined within each one of them. 
// When the method is called using object reference of subclass commonMethod() of superclass is not called but commonMethod() of subclass is called. 
// when a method is called using any object, the method that is within its corresponding class will be called though the same copy is present in the inherited class

public class Method_overriding_example 
{

	public static void main(String[] args) 
	{
		
		
		subclass subclass=new subclass();
		subclass.commonMethod(); // calling method using subclass object reference
		
		superclass superclass=new superclass();
		superclass.commonMethod(); // calling method using superclass object reference

	}

}

class superclass
{
	public void commonMethod()
	{
		System.out.println("printing commonMethod content defined under superclass");
	}
}

class subclass extends superclass
{
	public void commonMethod()
	{
		System.out.println("printing commonMethod content defined under subclass");
	}
}
