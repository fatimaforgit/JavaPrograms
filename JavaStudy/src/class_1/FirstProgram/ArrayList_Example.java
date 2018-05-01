package class_1.FirstProgram;

import java.util.ArrayList;

public class ArrayList_Example 
{

	public static void main(String[] args) throws InterruptedException
	{
		arrayList a=new arrayList();
		System.out.println(" \bold Integer type \n");
		a.IntergerType();
		System.out.println("************************************ \n");
		System.out.println(" Char type \n");
		a.CharacterType();
		System.out.println("************************************ \n ");
		System.out.println(" String type \n");
		a.StringType();
	
	}
	
}

class arrayList
{
	public void IntergerType()
	{
	ArrayList<Integer> al= new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	
	System.out.println(al);

	// remove value from index 2 that is value 30
	al.remove(2);
	// also can be written using elements as al.remove((Integer(30))
	System.out.println(al);

	//print value from index 2
	System.out.println(al.get(2));
	
	//add values at desired index	
	al.add(2, 35);
	System.out.println(al);
	
	// insert or add values in bulk
	int[] m={1,2,3,4,5};
	for(int i=0;i<5;i++)
		{
			al.add(i, m[i]);
		}
			System.out.println(al);
		
	}
	
	public void CharacterType()
	{
		ArrayList<Character> al= new ArrayList<Character>();
		al.add('J');
		al.add('A');
		al.add('V');
		al.add('A');
		al.add('C');
		
		System.out.println(al);

		// remove value from index 2 that is value 30
		al.remove(2);
		// also can be written using elements
		System.out.println(al);

		//print value from index 2
		System.out.println(al.get(2));
		
		//add values at desired index	
		al.add(2, 'M');
		System.out.println(al);
		
		// insert or add values in bulk
		char[] m={'N','E','W',' '};
		for(int i=0;i<4;i++)
			{
				al.add(i, m[i]);
			}
				System.out.println(al);
	}
	
	public void StringType()
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("Learning");
		al.add("Java");
		al.add("is");
		al.add("not");
		al.add("easy");
		
		System.out.println(al);

		// remove value from index 2 that is value 30
		al.remove(3);
		// also can be written using elements
		System.out.println(al);

		//print value from index 2
		System.out.println(al.get(2));
		
		//add values at desired index	
		al.add(3, "very");
		System.out.println(al);
		
		// insert or add values in bulk
		String[] m={"we","shall","all"};
		for(int i=0;i<3;i++)
			{
				al.add(i, m[i]);
			}
				System.out.println(al);
	}
	
}
	
	