package class_1.FirstProgram;

public class StringBuffer_class_and_String_value_comparison 
{
	public static void main(String args[])
	{
		String s1 = "java";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println("printing value of s2 " + s2);
		
		withoutToStringMethod without = new withoutToStringMethod(s1,s2);
		withToStringMethod with = new withToStringMethod(s1,s2);
		
		System.out.println("Hence it is mandatory to convert StringBuffer value to string before comparing ");
		
	}

}

class withoutToStringMethod
{
	withoutToStringMethod(String s11, StringBuffer s12)
	{
		if(s11.equals(s12))
		{
			System.out.println("withoutToStringMethod : s1 and s2 are  same");
		}
		else 
			System.out.println("withoutToStringMethod : s1 and s2 are not same");
	}
}

class withToStringMethod
{
	withToStringMethod(String s21, StringBuffer s22)
	{
		if(s21.equals(s22.toString()))
		{
			System.out.println("withToStringMethod : s1 and s2 are  same");
		}
		else 
			System.out.println("withToStringMethod : s1 and s2 are not same");
	}
	
}