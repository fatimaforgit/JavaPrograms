package class_1.FirstProgram;

public class Example_Concatination 
{

	public static void main(String[] args) 
	{
		// print concatination result
		System.out.println("Concatinated sentence is " + concatinate("ALLAH", "uakbar") );
		//expected result is ALLAHuakbar

	}

	public static String concatinate(String a, String b)
	{
		String concate = a + b ;
		return concate ;
	}
	
}

