package java_Arrays;
// finding values common to both strings and putting the result(here result has more than one value in common) into a list variable
// here commonValues holds more than one string as a result of 
//if statement this is outputed using Arrays.asList(arrayName) method and addAll() of collections interface

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Usage_of_Arrays_asList_method 
{

	public static void main(String[] args) 
	{
		
//	 Manually using add() of ArrayList -  arraylist_ObjectName.add(arrayName[i])
		
		/*ArrayList declaration*/
	    ArrayList<String> arraylist= new ArrayList<String>();

	    /*Initialized Array*/
	    String array[] = {"Text1","Text2","Text3","Text4"};   

	    /*array.length returns the current number of 
	     * elements present in array*/
	    for(int i =0;i<array.length;i++)
            {

	         /* We are adding each array's element to the ArrayList*/
		 arraylist.add(array[i]);
	    }

	    /*ArrayList content*/
	    for(String str: arraylist)
	    {
	         System.out.println(str);
	    }
	    

//	using Arrays.asList(s1[i])

		String[] s1 = {"name1","name12","name13"};

		String[] s2 = {"new1","name12","name13"};

		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j <3; j++) 
			{
				if(s1[i].equals(s2[j]))
				{
					List<String> commonValues = new ArrayList<String>(Arrays.asList(s1[i]));
					System.out.print(commonValues);
				}

			}

		}


// using Collections.addAll(arraylist, array);

		/* Array Declaration and initialization*/
		String array1[]={"Hi", "Hello", "Howdy", "Bye"};

		/*ArrayList declaration*/
		ArrayList<String> arraylist1= new ArrayList<String>();

		/*Conversion*/
		Collections.addAll(arraylist1, array1);

		/*Adding new elements to the converted List*/
		arraylist.add("String1");
		arraylist.add("String2");

		/*Display array list*/
		for (String str: arraylist)
		{
			System.out.println(str);
		}
	}


}


