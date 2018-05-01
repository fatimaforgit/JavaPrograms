package java_patterns;

public class Fabonicci 
{

	public static void main(String[] args) 
	{  
		int n1=0,n2=1;
		int fab=0;
		int count=0;
		while(count<10)
		{
			fab = n1+ n2;
			n1=n2;
			n2=fab;
			
			System.out.println(fab);
			count++;
		}
		
	}

}
