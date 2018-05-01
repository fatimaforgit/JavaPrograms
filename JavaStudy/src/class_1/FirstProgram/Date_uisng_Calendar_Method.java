package class_1.FirstProgram;

import java.util.Calendar;
import java.util.Date;

public class Date_uisng_Calendar_Method 
{

	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance(); //gets time zone in milliseconds as an offset w.r.t epoch time
		Date d = new Date(); // gets current date
		c.setTime(d); //it sets this Calendar's time with the given Date
		
		System.out.println("YEAR --> " + c.get(Calendar.YEAR));
		System.out.println("MONTH --> " + c.get(Calendar.MONTH)); // month begins with 0 hence January is 0
		System.out.println("WEEK_OF_MONTH --> " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("WEEK_OF_YEAR --> " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("DAY_OF_MONTH --> " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_WEEK --> " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("HOUR_OF_DAY --> " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE --> " + c.get(Calendar.MINUTE));
		System.out.println("SECOND --> " + c.get(Calendar.SECOND));
		System.out.println("MILLISECOND --> " + c.get(Calendar.MILLISECOND));

	}

}
