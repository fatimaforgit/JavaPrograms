package java_strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Count_repetation_of_words_in_a_string 
{

	public static void main(String[] args) 
	{
		String s = "Java coding interview questions Java Java coding Java coding interview ";
		String[] word = s.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < word.length; i++) 
		{
			int count=0;

			for (int j = 0; j < word.length; j++) 
			{		
				if(word[i].equalsIgnoreCase(word[j]))
				{
					count++;
				}

			}		
//adding to empty map
			map.put(word[i], count);

		}

		System.out.println( "count is \n" + map);
		
//sorting result
		TreeMap<String, Integer> sorting = new TreeMap<String, Integer>(map);

		System.out.println("\n Sorted map \n " +sorting);
		
//retrieving first value from sorted map		
		Set<Map.Entry<String, Integer>> first = sorting.entrySet();
		Iterator<Map.Entry<String, Integer>> ite = first.iterator();

		System.out.println("\n the word having maximum number of repetations is \n" + ite.next());
	}

}
