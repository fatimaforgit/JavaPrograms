package class_1.FirstProgram;
// example for returning this using "return this;"

public class Example2_This_keyword 
{

	public static void main(String[] args) 
	{
		adding a=new adding();
		int returnThisAdd=a.add();
		int returnAdd=a.add(10,20);
		System.out.println(" addition of instance variable is \n" +"  " + returnThisAdd);
		System.out.println(" addition of local variable is \n" + "  " + returnAdd);

	}
	
}

class adding
{
	int x=50,y=100;
	int add=x+y;
	public int add()
	{
		int x=10,y=20;
		int add=x+y;
		return this.add;
	}
	public int add(int x,int y)
	{
		
		int add=x+y;
		return add;
	}
}
