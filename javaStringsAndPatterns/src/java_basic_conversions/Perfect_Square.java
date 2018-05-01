package java_basic_conversions;
// To find how many perfect squares are there within 100 and list them
public class Perfect_Square 
{

	public static void main(String[] args) 
	{
		System.out.println(" List of perfect squares within 100 are:");
		int count=0;
		for(int i=1;i<=100;i++)
		{
			double squareRoot = Math.sqrt(i);
			if(Math.floor(squareRoot)==squareRoot)
			{
				count=count+1;
				System.out.println(i);
			}

		}
		System.out.println("count of perfect squares within 100 is:"+count);
	}

}
