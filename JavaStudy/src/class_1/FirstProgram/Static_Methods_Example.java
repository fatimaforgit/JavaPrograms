package class_1.FirstProgram;

public class Static_Methods_Example 
{

	public static void main(String[] args) 
	{
		example s=new example();
		s.normalMethod();	

	}

}

class example

{
	int normalVariable=1; // non Static Variable
	static int staticVariable=5;
	
	public void normalMethod()  // non static method
	{
		System.out.println("inside normal method");
		System.out.println("accessing normal variable from normal method " + normalVariable);
		System.out.println("accessing static variable from normal method " + staticVariable);
		staticMethod(); // accessing static method from normal method
	}
	
	public static void staticMethod()
	{
		example s=new example();
		System.out.println("inside static method");
		System.out.println("accessing normal variable from static method " + s.normalVariable);
		System.out.println("accessing static variable from static method " + staticVariable); // s. is not required as it is static
		//the below commented since if included execution will form repetitive circles between these two methods
		// s.normalMethod(); // accessing normal method from static method
	}
}
