package class_1.FirstProgram;
//class that is outside the mother class is called within the mother class but through a method that is declared/created within the outside class 
//here method " circleCalculate() " is created within outside class " circle "
//radius value is passed from main to method
// This program is executing correctly in command prompt

public class Area_Of_A_Circle_4 
{

	public static void main(String[] args) 
	{
		Circle c=new Circle();
		double AreaIs = c.circleCalculate(1);
		System.out.println(AreaIs);

	}

}
	
class Circle  //note this class is declared outside the mother(above) class
{
	static double PI=3.14;
	
	public static double circleCalculate(double radius) //this method is created within the outside class
	{		
		double area = PI * radius * radius ; 
		return area;
		
	}
}



