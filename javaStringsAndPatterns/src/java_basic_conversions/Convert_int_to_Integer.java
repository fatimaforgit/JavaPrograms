package java_basic_conversions;

import java.util.Arrays;
import java.util.Collections;

public class Convert_int_to_Integer 
{

	public static void main(String[] args) 
	{
		// given array is in int
		int[] arr = {2,1,6,3};
		
		// converting int to Integer
		Integer[] arrayInInteger = new Integer[arr.length];
		
		// storing content of int array into Integer array
		for (int i = 0; i < arr.length; i++) 
		{
			arrayInInteger[i] = Integer.valueOf(arr[i]);
			
		}
		
		for(Integer a: arrayInInteger)		
		System.out.print(a);
		
	// example use
		System.out.println("\n example use");
		
		Arrays.sort(arrayInInteger);
		
		Arrays.sort(arrayInInteger, Collections.reverseOrder());
		
		for(Integer a:arrayInInteger)
		System.out.print(a);
		
	}

}
