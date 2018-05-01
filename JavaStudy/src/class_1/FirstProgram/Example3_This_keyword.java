package class_1.FirstProgram;
// example for using this is overloaded constructors
public class Example3_This_keyword 
{
	
	public static void main(String[] args) 
	{
		color c=new color("invoking constructor with 2 colors","invoking constructor with 2 colors");
		
	}
	
}

class color
{
	String color1,color2,color3; // declared 3 instance variables
	
	color(String color1,String color2,String color3) //largest constructor
	{
		this.color1=color1;
		this.color2=color2;
		this.color3=color3;
		System.out.println(this.color1 +"\n"+ this.color2 +"\n"+ this.color3);
	}
	
	color(String color1,String color2) //overloaded constructor
	{
		this("pink","yellow","");
	}
	
	color(String color1) //overloaded constructor
	{
		this("pink","","");
	}
	
	color() //overloaded constructor
	{
		this("-","-","-");
	}
	
		
}
