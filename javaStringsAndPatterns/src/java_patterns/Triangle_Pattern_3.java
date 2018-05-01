package java_patterns;

import java.util.Scanner;

public class Triangle_Pattern_3 
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
				if(j>=i)
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
