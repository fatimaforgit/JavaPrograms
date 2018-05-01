package java_Arrays;
//to find largest value in an array
//to find smallest value in an array
public class Largest_number_in_an_array_program 
{

	public static void main(String[] args) 
	{
		int[] num = {1,2,74,3,4,5, 782, 0};
		
//		finding largest value
		int large=0;
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]>large)
			{
				large=num[i];
			}
			
		}
		System.out.println("largest number in the array is " + large);
		
//		finding smallest value
		int small=large;
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]<small)
			{
				small=num[i];
			}
			
		}
		System.out.println("largest number in the array is " + small);
	}

}
