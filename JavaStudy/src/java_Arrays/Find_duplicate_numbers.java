package java_Arrays;

public class Find_duplicate_numbers 
{

	public static void main(String[] args) 
	{
		int[] num = {1,2,3,4,4,5, 3, 4};
		int count = 1;

		for (int i = 0; i < num.length; i++) 
		{
			for (int j = i+1; j < num.length-1; j++) 
			{
				if(num[i]==num[j])
				{
					int n = num[i];
					System.out.println("duplicate number is " + n);
					count++;
					System.out.println("count of appearence of "+n+" number is "+ count);

				}

			}

		}

	}

}
