package java_patterns;

import java.util.Scanner;

public class Square_Pattern_Method_1 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter size");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		//		first row
		for(int i=1;i<=size;i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");

		//		middle rows where only star is needed in the first and last column
		for(int j=1;j<=size-2;j++)
		{
			for(int i=1;i<=size;i++)
			{
				if(i==1 || i==size)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.print("\n");
		}



		//		last row
		for(int i=1;i<=size;i++)
		{
			System.out.print("*");
		}



	}

}
