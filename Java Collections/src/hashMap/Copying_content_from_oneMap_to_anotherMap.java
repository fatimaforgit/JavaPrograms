package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// How to copy Map content to another HashMap?


public class Copying_content_from_oneMap_to_anotherMap 
{

	public static void main(String[] args) 
	{
//To Copy content from map1 to map2 use map1.putAll(map2); where map2 values are added into map1 with content of map2 remain same
//this code returns void hence no variable on the left side to catch anything 
		
		
//		creating first map/HashMap
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
			
//		putting entries into map1
		map1.put("a", 11);
		map1.put("b", 12);
		map1.put("c", 13);
		
		Set<String> allValues = map1.keySet();
		System.out.println("All keys of map1 " + allValues);
		
//		creating second map/HashMap
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		
//		putting entries into map1
		map2.put("d", 21);
		map2.put("e", 22);
		map2.put("f", 23);
		Set<String> allValues1 = map2.keySet();
		System.out.println("All keys of map2 " + allValues1);
				
//		Copying_content_from_map1_to_map2
		map1.putAll(map2); //  this returns void hence no variable on the left side
		System.out.println("map1 is modified to = " + map1);
		System.out.println("map2 after map1 modification will remain same = " + map2);
		
//		Copying_content_from_map2_to_map1
		map2.putAll(map1);
		System.out.println("map2 is modified to = " + map2);
			

	}

}
