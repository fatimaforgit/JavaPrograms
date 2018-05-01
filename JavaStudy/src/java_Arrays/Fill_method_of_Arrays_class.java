package java_Arrays;
//fill the given array with the given value, here 123


import java.util.Arrays;

public class Fill_method_of_Arrays_class 
{

	public static void main(String[] args) 
	{
		int[] num = {1,2,3,4,5};

		Arrays.fill(num, 123);
		
		System.out.println("num array is filled with value ");
		for(int filledNumArray : num)
		{
			System.out.println(filledNumArray);
		}
		
//		adding new line
		System.out.println();
		
		String[] names ={"n1","n2","n3","n4"};
		
		Arrays.fill(names, "Java");
		
		System.out.println("names string is filled with new value \n");
		for(String filledNameArray : names)
		{
			System.out.println(filledNameArray);
		}
	}

}
