package class_1.FirstProgram;
import java.util.Date;
public class Date_tutorial_examples 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		
		Date currentDate = new Date();
		System.out.println("currentDate:  " + currentDate);
		System.out.println("\n currentDate using toString() method:  " +currentDate.toString());
		
		// to print number of years passed since epoch Jan 1 1970 mid night
		System.out.println("\n Number of milli seconds from epoch is \n "+currentDate.getTime());
		
		//calculation to convert milliseconds to years
		long d = 60*60*24*365;
		long years = ((currentDate.getTime())/d)/1000;
		System.out.println("\n Converting milliseconds to years:  " + years+" yrs");
		
		int y = (currentDate.getYear()) + 1900;
		System.out.println("\n current year:  " + y);
		
		int m = currentDate.getMonth() +1;
		System.out.println("\n Current month:  " + m);
		
		System.out.println("\n GMT:  " + currentDate.toGMTString()); 
		
	}

}
