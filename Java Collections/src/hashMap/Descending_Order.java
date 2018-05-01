package hashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class Descending_Order 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("A", 1);
		hm.put("B", 5);
		hm.put("F", 3);
		hm.put("M", 2);
		hm.put("E", 5);

//Step 1
		//Ascending order

		TreeMap ascending = new TreeMap(hm);

		System.out.println("In ascending order \n" + ascending);
		
//Step 2
		//Descending order

		System.out.println("Sorting given map in descending order" + ascending.descendingMap());

		System.out.println("Sorting key in descending order" + ascending.descendingKeySet());

	}

}
