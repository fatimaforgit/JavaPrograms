package class_1.FirstProgram;

public class Example_This_keyword 
{

	public static void main(String[] args) 
	{
		number n=new number();
		n.printNum();
		//number n1=new number();
		//n1.printNum();

	}

}

class number
{
	int num=5;
	public void printNum()
	{
		int num=10;
		System.out.println("output without this keyword "+ num);
		System.out.println("output with this keyword "+ this.num);
	}
}



/* 
 *Explanation:
 * pointer points to main
 * object n is created where n is the object name
 * n.printNum(); here since an object n is created, this.num will point to the instance variable num through n 
 * and not local variable num
 * this keyword is used within a class for the same purpose as an object name is used outside a class to call the same objects
 * both this keyword and object created using new operator (here n) points 
 * to the location/reference not data/value
 * this becomes n here hence for this.num it becomes n.num which means class number.num hence instance variable num's value is picked.
 */