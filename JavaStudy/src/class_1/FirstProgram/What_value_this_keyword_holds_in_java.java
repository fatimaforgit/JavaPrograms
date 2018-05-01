package class_1.FirstProgram;
//checking if 'this' keyword holds location details same as the object (created using new operator) holds here it is p
// check if the value of p is same as value of this keyword in java 

public class What_value_this_keyword_holds_in_java 
{
	public static void main(String[] args) 
	{
		printingThisValue p=new printingThisValue();
		p.printing();
		System.out.println("trying to print object value in java ..................................................." + "   "+ p );
	}
		

}
	
class printingThisValue
{
	public void printing()
	{
	System.out.println("this keyword holds location details same as the object created using new operator holds " + "   "+ this );
	}
}
