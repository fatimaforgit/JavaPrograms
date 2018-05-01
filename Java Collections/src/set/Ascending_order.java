package set;

import java.util.Set;
import java.util.TreeSet;

public class Ascending_order 
{
	public Set<Integer> ascendingOrder(Set<Integer> data)
	{
		// arranging in descending order by reversing the order
		TreeSet<Integer> ascenData = new TreeSet<Integer>(data);

		System.out.println("In ascending order \n" + ascenData);

		// Copying the result back into array list.
		data.clear();
		data.addAll(ascenData);

		return data;
	}



}
