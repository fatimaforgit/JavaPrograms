package list;

import java.util.ArrayList;
import java.util.Collections;

public class Descending_order 
{
	public ArrayList<Integer> descendingOrder(ArrayList<Integer> data)
	{
		Collections.reverse(data);
		System.out.println("In descending order by reversing order \n" +data);
		
		return data;
	}

}
