package java_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rough {

	public static void main(String[] args) 
	{
		int[] num1 = {1,2,3,4};
		
		
		List<int[]> list =  new ArrayList<int[]>(Arrays.asList(num1));
		
		
		
		for(int i=0;i<list.size();i++)
		{
			String st = list.get(i).toString();
			System.out.println(st.valueOf(i));
		}
		
		
	}
}
