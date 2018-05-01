package class_1.FirstProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_to_get_current_date 
{
	public static void main(String[] args) 
	{
		//Using Date class
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss S EEEE MMMM  EEE MMM"); // note here M for month should be in capitals s is seconds and capital S is milliseconds
		System.out.println(sdf.format(currentDate));
				
	}
}
