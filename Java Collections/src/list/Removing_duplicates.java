package list;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Removing_duplicates 
{

	protected ArrayList<Integer> removingDuplicates(ArrayList<Integer> data) 
	{
		LinkedHashSet<Integer> dupRemoved = new LinkedHashSet<Integer>(data);

		System.out.println("Data after duplicates removed \n" + dupRemoved);

		// Copying this unique data into an array list. To copy it to same array list 'data' first remove all existing data then addAll
		
		data.clear();
		data.addAll(dupRemoved);
		
		System.out.println("Copying unique data into an arraylist \n" +data);
		
		return data;
	}

}
