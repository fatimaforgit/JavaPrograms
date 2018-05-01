package class_1.FirstProgram;

public class Example_Concatination2 // concatination of several words, number and spaces
{

	public static void main(String[] args) 
	{
		// print concatination result
		System.out.println("Concatinated sentence is " + concatinate("There", "is", "only", 1, "GOD") );
		//expected result is There is only 1 GOD

	}

	public static String concatinate(String a, String b, String c, int d, String e) // concatination of several words, number and spaces
	{
		String concate = a + " " + b + " " + c + " " + d + " " + e ;
		return concate ;
	}
	
}

