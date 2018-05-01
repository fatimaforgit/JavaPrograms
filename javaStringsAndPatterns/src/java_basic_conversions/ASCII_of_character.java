package java_basic_conversions;
/*
Scanner class takes only String value from users through nextLine() method. Since Scanner class does not have method to take char value from user, we use System.in.read(); This takes only one character from user and converts it to an int value(ASCII value). If a string is inputted by user then it picks only first letter and converts to its equivalent int value. Hence its usage is
int intValueOfInputtedChar= System.in.read();
System.in.read() throws IO exception. Hence “throws Exception” has to be used to handle it.
 */
public class ASCII_of_character 
{
	public static void main(String[] args) throws Exception
	{

		// assume value 
		char c= 'A';
		int ASCIIValue = c;
		System.out.println(c+"'s ASCII value is " +ASCIIValue);

		// ask user to input value
		System.out.println("Enter a character");	

		int ASCIIvalue = System.in.read();
		System.out.println(ASCIIvalue);		
	}
}
