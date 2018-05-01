package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Convert_List_to_Set 
{

	public static void main(String[] args) 
	{
		ArrayList<String> data = new ArrayList<String>();

		data.add("asd");
		data.add("d");
		data.add("r");
		data.add("g");
		data.add("r");

		System.out.println("Before conversion duplicate remains \n" + data);
		
		Set<String> set = new HashSet<String>(data);
		System.out.println("\nAfter conversion duplicate is eliminated \n" + set);


	}

}
