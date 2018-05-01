package class_1.FirstProgram;

public class Dynamic_Method_Dispatch 
{

	public static void main(String[] args) 
	{
		human h=new goodHuman(); // dynamic method dispatch where left part is superclass and right part is its subclass. An object for right part, that is, goodHuman class will be created
		h.printThis();  // this should print content of subclass printThis() method
				
	}

}

class human
{
		
	public void printThis()
	{
		System.out.println("printing printThis() method content defined under superclass");
	}
}

class goodHuman extends human
{
	public void printThis()
	{
		System.out.println("printing printThis() method content defined under subclass"); 
				
	}
}
