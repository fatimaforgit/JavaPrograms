package class_1.FirstProgram;
/* Using static blocks
 * Note: other things are is executed only after static block is executed even if 
 * this constructor comes before the static block in the main
 */
public class Static_Blocks_Example1 
{

	public static void main(String[] args) 
	{
		Test t=new Test();  //if this step is not included only static block is executed
		int x=Test.count;
		
	}
	
}

class Test
{
	static int count;
	
	static
	{
		count=0;
		System.out.println("Static block is called first " + count);
	}
	
	Test()
	{
		count++;
		System.out.println("constructor is executed " + count); 
	}
}