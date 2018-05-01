package java_strings;

public class Identify_only_numbers_in_given_string 
{

	public static void main(String[] args) 
	{
		String s = "some123more435";
		int b;

		for (int i = 0; i < s.length(); i++) 
		{
			b = Integer.valueOf(s.charAt(i));
			if(b>48 && b< 57)
				System.out.print(s.charAt(i));
		}		

	}

}
