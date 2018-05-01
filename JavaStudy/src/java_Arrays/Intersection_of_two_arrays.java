package java_Arrays;

 // find intersection of two arrays that is the numbers common to both arrays

public class Intersection_of_two_arrays 
{

	public static void main(String[] args) 
	{
		int[] num1 = {1,2,3,4};
		int[] num2 = {20, 30, 3, 40, 4, 50};
		int commonInt ;

		System.out.print("{");

		for (int i = 0; i < num1.length; i++) 
		{
			for (int j = 0; j < num2.length; j++) 
			{
				if(num1[i]==num2[j])
				{
					commonInt = num1[i];
					System.out.print(commonInt+",");
				}

			}

		}

		System.out.print("}");
	}

}
