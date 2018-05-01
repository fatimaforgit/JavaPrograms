package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hashmap_example 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> mappingNameWithPhoneNumber = new HashMap<>();

		mappingNameWithPhoneNumber.put("A", 1);
		mappingNameWithPhoneNumber.put("B", 2);
		mappingNameWithPhoneNumber.put("C", 3);
		mappingNameWithPhoneNumber.put("D", 4);
		mappingNameWithPhoneNumber.put("E", 5);

		//To display value corresponding to a key use get(key)
		System.out.println(mappingNameWithPhoneNumber.get("A"));

		//To display all values in the above Map use values() which returns a Collection not Set

		System.out.println("\nDisplaying all values");
		Collection<Integer> displayAllValues = mappingNameWithPhoneNumber.values();

		Iterator<Integer> values = displayAllValues.iterator();

		int val = values.next();
		System.out.println(val);

		while(values.hasNext())
		{
			System.out.println(values.next());
		}


		//To display all keys in the above Map use keySet()

		System.out.println("\nDisplaying all keys");
		Set<String> displayAllKeys = mappingNameWithPhoneNumber.keySet();

		Iterator<String> ite = displayAllKeys.iterator();

		String key = ite.next();
		System.out.println(key);

		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}


		//To check if this map has certain key contained in it use containsKey("key")

		System.out.println("\n Check if map contains these keys ");

		boolean checkKey1 = mappingNameWithPhoneNumber.containsKey("B");
		boolean checkKey2 = mappingNameWithPhoneNumber.containsKey("F");

		System.out.println(" B contained ? "+checkKey1+"\n F contained ? "+checkKey2);

		//To check if this map has certain value contained in it use containsValue(value)
		System.out.println("\n Check if map contains these values ");

		boolean checkKey3 = mappingNameWithPhoneNumber.containsValue(3);
		boolean checkKey4 = mappingNameWithPhoneNumber.containsValue(8);

		System.out.println(" 3 contained ? "+checkKey3+"\n 8 contained ? "+checkKey4);

		//To display all entry [a pair of key and its value is known as a entry] using entrySet(). Here Entry is a interface within Map interface

		System.out.println("\nDisplaying all entry");
		Set<Map.Entry<String, Integer>> displayAllEntry = mappingNameWithPhoneNumber.entrySet();

		Iterator<Map.Entry<String, Integer>> entry = displayAllEntry.iterator();

		Map.Entry<String, Integer> entries = entry.next();
		System.out.println(entries);

		while(entry.hasNext())
		{
			System.out.println(entry.next());
		}


		//To find number of entries in a Map use size()
		int numberOfEntries = mappingNameWithPhoneNumber.size();
		System.out.println("\n Number Of Entries in this map = " + numberOfEntries);
		
		// TO remove a key from map use remove(key)
		mappingNameWithPhoneNumber.remove("B");
		
		System.out.println("\nDisplaying all entry after deleting B");
		
		Set<Map.Entry<String, Integer>> newEntryAfterDeletingB = mappingNameWithPhoneNumber.entrySet();

		Iterator<Map.Entry<String, Integer>> ite1 = newEntryAfterDeletingB.iterator();

		Map.Entry<String, Integer> key1 = ite1.next();
		System.out.println(key1);

		while(ite1.hasNext())
		{
			System.out.println(ite1.next());
		}
		
		//To sort hash map use TreeMap class, create an object of HashMap that needs to be sorted and pass this object as argument to Treemap 
		System.out.println("\n Displaying sorted entry ");
		
		TreeMap sortMap = new TreeMap(mappingNameWithPhoneNumber);
		
		Set<Map.Entry<String, Integer>> sortedMap = sortMap.entrySet();
		
		Iterator<Map.Entry<String, Integer>> ite222 = sortedMap.iterator();
		
		Map.Entry<String, Integer> f = ite222.next();
		System.out.println(f);
		while(ite222.hasNext())
		{
			System.out.println(ite222.next());
		}
			


	}

}
