package set;

import java.util.HashSet;
import java.util.Set;

public class Convert_Set_to_array 
{

	public static void main(String[] args) 
	{
		Set<Integer> data = new HashSet<Integer>();

		data.add(3);
		data.add(2);
		data.add(5);
		data.add(1);
		data.add(4);
		
		
		System.out.println(data);

		/*Since in Set insersion is random the value printed below is unpredictable*/
		
		Integer[] array = data.toArray(new Integer[data.size()]);

		System.out.println(array[2]);

	}

}
