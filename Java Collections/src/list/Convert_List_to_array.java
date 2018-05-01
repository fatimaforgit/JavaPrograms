package list;

import java.util.ArrayList;

public class Convert_List_to_array 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		data.add(3);
		data.add(2);
		data.add(5);
		data.add(1);
		data.add(4);
		
	/*	List<T> list = new ArrayList<T>();	
		T [] countries = list.toArray(new T[list.size()]);*/
		
		Integer[] array = data.toArray(new Integer[data.size()]);
		
		System.out.println(array[3]);
		
	
	}

}
