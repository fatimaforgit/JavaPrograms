package hashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class Ascending_Order 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("A", 1);
		hm.put("B", 5);
		hm.put("C", 3);
		hm.put("D", 2);
		hm.put("E", 5);


		//Ascending order

		TreeMap ascending = new TreeMap(hm);

		System.out.println("In ascending order \n" + ascending);}

}
