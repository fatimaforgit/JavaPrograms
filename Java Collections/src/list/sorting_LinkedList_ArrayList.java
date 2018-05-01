package list;

import java.util.LinkedList;
import java.util.TreeSet;

public class sorting_LinkedList_ArrayList 
{

	public static void main(String[] args) 
	{
		 LinkedList<String> li = new LinkedList<String>();
		 li.add("a");
		 li.add("e");
		 li.add("g");
		 li.add("r");
		 li.add("c");
		 
		 System.out.println("before sorting \n" + li);
	 
		 // sorting list
		 TreeSet<String> ts = new TreeSet<String>(li);
		 
		 for(String s: ts)
		 {
			 System.out.print(" " + s);
		 }
		 	
	}

}
