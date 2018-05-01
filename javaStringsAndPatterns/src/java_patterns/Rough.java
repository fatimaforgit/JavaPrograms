package java_patterns;

public class Rough {

	public static void main(String[] args) 
	{
		String s = "humbly humble";
		int count=0;
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)=='h')
			{
				count=count+1;
			}
			
		}
		System.out.println(count);
		
		int wordCount=0;
		
		
		boolean given = s.contains("hum");
		
		if(given==true)
		{
			wordCount++;
		}
		System.out.println(wordCount);
	}

}
