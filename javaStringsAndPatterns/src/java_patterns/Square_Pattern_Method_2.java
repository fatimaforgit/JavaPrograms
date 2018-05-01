package java_patterns;

import java.util.Scanner;

public class Square_Pattern_Method_2 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter size");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(i==1 || i==size || j==1 || j==size )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
