package java_Arrays;

public class Print_array_using_Enhanced_for_loop 
{

	public static void main(String[] args) 
	{
		int[] marks = new int[5];
		
//		printing using traditional for loop
		for (int i = 0; i < marks.length; i++) 
		{
			marks[i] = i+1;
			int m = marks[i];
			System.out.println(m);
		}
		
		System.out.println("====================");
//		the for loop used below is known as enhanced for loop
		int[] newMarks = {10,20,30,40,50};
		for(int printMarks:newMarks)
		{
			System.out.println(printMarks);
		}

	}

}
