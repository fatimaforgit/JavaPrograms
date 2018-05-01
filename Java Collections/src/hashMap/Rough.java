package hashMap;

public class Rough 
{ 
	public static void main(String[] args) 
	{
		int[] num = {3,5,2,6,1};
		int temp;
		for (int i = 0; i < num.length; i++) 
		{
			for (int j = 0; j < num.length; j++) 
			{
				if(num[i]<num[j])
				{
					temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
			}
						
		}
		
		for(int n:num)		
		System.out.print(n);
		
		
	}

}