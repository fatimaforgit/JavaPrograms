package list;

import java.util.ArrayList;

public class Convert_List_to_String 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> data = new ArrayList<Integer>();

		data.add(3);
		data.add(2);
		data.add(5);
		data.add(1);
		data.add(4);
		
		Integer[] some = new Integer[data.size()];
		
		Integer[] in = data.toArray(some);

		for (int i = 0; i < 5; i++) 
		{
			System.out.println(in[i].toString());
		}
		

	}

}
