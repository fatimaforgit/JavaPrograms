package set;

import java.util.Set;
import java.util.TreeSet;

public class Descending_order 
{
	public Set<Integer> descendingOrder(Set<Integer> data)
	{
		TreeSet ascn = new TreeSet(data);
		System.out.println("In descending order \n" + ascn.descendingSet());
		
		return data;
	}

}
