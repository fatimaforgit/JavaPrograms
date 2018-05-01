package class_1.FirstProgram;
/* Programs to use replace() and concat() built in java methods
 * anyVariableStringName.replace("put existing string to be replaced", " put new string")
 * anyVariableStringName.concat("any string that is to be concatenated")
 */

public class ReplaceCharsInAnyString 
{

	public static void main(String[] args) 
	{
		String someString= "-Hello mam-" ;
		System.out.println("The given string is " + someString);
		System.out.println("Replacing mam with sir = " + someString.replace("mam", "sir" ) );
		System.out.println("Concatination of two strings = " + someString.concat(" How are you ? ") );

	}

}
