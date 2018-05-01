package class_1.FirstProgram;

import java.util.HashSet;

public class Set_in_Java_example 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		
		System.out.println(hs); // insertion is randomly

	}

}
