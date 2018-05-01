package class_1.FirstProgram;
//class that is outside the mother class is called within the mother class but through a method that is created within the mother class
// here method " circleCalculate() " is created within mother class " Area_Of_A_Circle_2 "


public class Area_Of_A_Circle_2 
{

	public static void main(String[] args) 
	{
		
		circleCalculate();

	}
	
	public static void circleCalculate() //this method is created within the mother class
	{		
		Circle c=new Circle();
		c.radius = 6.5 ;
		c.area = c.PI * c.radius * c.radius ; 
		System.out.println(c.area);
	}

}
	
class Circle  //note this class is declared outside the mother(above) class
{
	double radius;
	double area;
	static double PI=3.14;
}


