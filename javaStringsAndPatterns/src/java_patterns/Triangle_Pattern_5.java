package java_patterns;

import java.util.Scanner;

public class Triangle_Pattern_5
{

	public static void main(String[] args) 
	{
		System.out.println("Enter size");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		for(int i=size;i>=1;i--)
		{
			for(int j=size;j>=i;j--)
			{
								
				if(j<=i)
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
