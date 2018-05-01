package java_strings;

public class Split_count_words 
{

	public static void main(String[] args) 
	{

		String s = "Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method";

		String[] split = s.split(" ");
		System.out.println("Number of words in the given sentence is " + split.length);
		
		// to find number of times 'in' present in the given sentence
		int count = 0;
		for (int i = 0; i < split.length; i++) 
		{

			if(split[i].contains("method"))
			{
				count++;
			}
		}

		System.out.println("Number of times word 'method' present in the given sentence is " + count);
	}

}
