package class_1.FirstProgram;

public class Area_Of_A_Circle 
{

	public static void main(String[] args) 
	{
		
		Circle c=new Circle(); // for calling or using variables of class outside this class, this is declared
		c.radius = 6.5 ;
		c.area = c.PI * c.radius * c.radius ; 
		System.out.println(c.area);

	}

}
	
	class Circle  //note this class is declared outside the above class
	{
		double radius;
		double area;
		static double PI=3.14;
	}


