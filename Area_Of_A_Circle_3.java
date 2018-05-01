// class that is outside the mother class is called within the mother class but through a method that is declared/created within the outside class 
// here method " circleCalculate() " is created within outside class " circle "


public class Area_Of_A_Circle_3
{

	public static void main(String[] args) 
	{
		Circle c=new Circle();
		c.circleCalculate();
		
	}

}
	
class Circle  //note this class is declared outside the mother(above) class
{
	static double PI=3.14;
	
	public static void circleCalculate() //this method is created within the outside class
	{		
		double radius = 3 ;
		double area = PI * radius * radius ; 
		System.out.println(area);
		
	}
}


