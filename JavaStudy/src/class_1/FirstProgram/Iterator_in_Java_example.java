package class_1.FirstProgram;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_in_Java_example 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		
		System.out.println("You inserted values " + hs);
		
		Iterator<Integer> it = hs.iterator();
		
		System.out.println("location of first element --> " + it);  // point to location of first element in the set
		System.out.println("value in the first location is --> "+ it.next()); // fetches value in the first location in the set
		System.out.println("value in the second location is --> "+ it.next()); // fetches value in the second location in the set
		
		// to fetch all element of a set
		Iterator<Integer> ite = hs.iterator();
		
		System.out.println("\n Fetching values of set ");
		
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}

}
