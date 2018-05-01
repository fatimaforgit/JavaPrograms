package class_1.FirstProgram;
//import java.lang.scanner
// examples on string compare, concat, substring
public class Strings_examples 

{

	public static void main(String[] args) 
	{
		StringsExamples se=new StringsExamples();
		
		System.out.println("Are these two strings same ? " + se.compare);
		System.out.println("concatination of two strings " + se.concatenations);
		System.out.println("string after ommiting first 3 letters of s3 is " + se.substring);
		System.out.println("substring Beginning From 0 position ending at 3rd position of s3 is " + se.substringBeginningFrom);
		System.out.println("converting s1 to uppercase " + se.uppercase);
		System.out.println("converting s4 to lowercase " + se.lowercase);
		System.out.println("Does s3 start with Su " + se.startwith);
		System.out.println("Does s1 end with k " + se.endwith);
		System.out.println("What is the character at position 2 in s4 is   " + se.charac_at);
		System.out.println("length of s2 is  " + se.length);
		System.out.println("f5 is converted from int to string  " + se.valueof);
		System.out.println("Replacing TIN to Batman  " + se.replace);
		System.out.println("Does question contain your name ?  " + se.contain);
		System.out.println("Trim s2 to remove space at the edges. Result is  " + "'" +se.trim+"'");

	}

}

class StringsExamples
{
	String s1="My";
	String s2=" name is";
	String s3="Suman";
	String s4="TINTIN";
	int f5=123456;
	String question=" What is your name ?";
	
	boolean compare=s1==s3;
	String concatenations=s1.concat(s2);
	String substring=s3.substring(3);
	String substringBeginningFrom=s3.substring(0,3);
	String uppercase=s1.toUpperCase();
	String lowercase=s4.toLowerCase();
	boolean startwith=s3.startsWith("Su");
	boolean endwith=s1.endsWith("k");
	char charac_at=s4.charAt(2);
	int length=s2.length();
	String valueof=String.valueOf(f5); // The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string
	String replace=s4.replace("TIN", "Batman");	
	boolean contain=question.contains("your name");
	String trim=s2.trim();
}