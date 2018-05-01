package java_patterns;

import java.util.Scanner;

public class Upper_Triangle_Pattern_1 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter size");
		Scanner scan = new Scanner(System.in);
		int noOfRows = scan.nextInt();

		for (int row = 1; row <=noOfRows; row++) 
		{
			for (int colspace = noOfRows-row; colspace >=1; colspace--)
			{ 
				System.out.print(" ");
			}

			for (int colStar = 1; colStar <=(row*2)-1; colStar++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}


