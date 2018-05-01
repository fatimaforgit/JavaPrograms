package class_1.FirstProgram;

public class Super_keyword_example 
{

	public static void main(String[] args) 
	{
		
		superKeyword superKeyword=new superKeyword();
		superKeyword.commonMethod(); // calling method using superclass object reference
		
		superKeyword_100 superKeyword_100=new superKeyword_100();
		superKeyword_100.commonMethod(); // calling method using subclass object reference

	}

}

class superKeyword
{
	String name="Anees";
	
	public void commonMethod()
	{
		System.out.println("printing commonMethod content defined under superclass"); // executed first
	}
}

class superKeyword_100 extends superKeyword
{
	public void commonMethod()
	{
		System.out.println("printing commonMethod content defined under subclass"); // executed second
		System.out.println("Printing super class variable using 'super' keyword "+super.name); // executed third
		
	}
}
