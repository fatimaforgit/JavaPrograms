package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashCode_example 
{

	public static void main(String[] args) 
	{

//		for List<>  // note hashCode can be used for any object within java, not necessarily for collections
		List<String> emp = new ArrayList<String>();
		emp.add("Ravi");

		System.out.println("Hash code of emp object is " +emp.hashCode());
		
		
//		for Set<>
		Set<String> names = new HashSet<String>();
		
		names.add("abc");
		
		// printing hash code of object names
		System.out.println("Hash code of names object is " + names.hashCode());
		
		Set<String> banks = new HashSet<String>();
		banks.add("ddk");
		System.out.println("Hash code of banks object is " +banks.hashCode());

//		for Map<>
		
		Map<Integer, Integer> age = new HashMap<Integer, Integer>();
		
		age.put(222, 12345);
		System.out.println("Hash code of age object is " +age.hashCode());
		
		
		
	}

}
