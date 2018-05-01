package list;

import java.util.ArrayList;

public class Example_duplicate_ascending_descending 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> data = new ArrayList<Integer>();		
		
		data.add(1);
		data.add(5);
		data.add(3);
		data.add(4);
		data.add(2);
		data.add(3);
		
		System.out.println("All values \n" + data);
		
		// removing duplicates from data
		Removing_duplicates remDup = new Removing_duplicates();
		remDup.removingDuplicates(data);
		
		// arranging in ascending order
		Ascending_order ascOrd =  new Ascending_order();
		ascOrd.ascendingOrder(data);
		
		// arranging in descending order by reversing the order
		Descending_order descOrd = new Descending_order();
		descOrd.descendingOrder(data);
		
		

	}

}
