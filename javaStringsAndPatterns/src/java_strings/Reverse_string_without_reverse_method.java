package java_strings;

public class Reverse_string_without_reverse_method 
{
	public static void main(String[] args) 
	{

		// program to reverse the position of each letter example for fun output should be nuf
		String s = "It is fun";

		for (int i = (s.length()-1); i >=0; i--) 
		{
			
			System.out.print(s.charAt(i));

		}
		System.out.println();
		
		
		// program to reverse the position of words example fun is It
		
		String[] stringOfwords = s.split(" ");
		System.out.println(stringOfwords.length);
		
		for (int i = (stringOfwords.length-1); i >=0 ; i--) 
		{
			System.out.print(stringOfwords[i]+" ");
			
		}		

	}
}
