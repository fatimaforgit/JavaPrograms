package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example_Set_duplicate_ascending_descending 
{

	public static void main(String[] args) 
	{
		Set<Integer> data = new LinkedHashSet<Integer>();
		
		data.add(1);
		data.add(5);
		data.add(3);
		data.add(4);
		data.add(2);
		data.add(3);
		
		System.out.println("All values \n" + data);
		
		//remove duplicates
//		No need to remove duplicate values as Set allows only unique values to be put into it by default
		
		//ascending order
		Ascending_order ascending= new Ascending_order();
		ascending.ascendingOrder(data);
		
		//descending order
		Descending_order descending =  new Descending_order();
		descending.descendingOrder(data);
		

	}

}
