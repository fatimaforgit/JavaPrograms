package class_1.FirstProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date_using_SimpleDateFormat 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		try
		{

			// using of SimpleDateFormat - converting date type to string type
			Date current_Date =  new Date();
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("converting date type to string type : " + sdf2.format(current_Date));
			
			// accepting date from user
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n provide a date in the format day-month-year \n");
			String inputDate = sc.nextLine();
			System.out.println("You inputted date: " + inputDate + "\n");
			
			//converting given user date string to date type
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Converting given string " + inputDate + " to date type for a user given format 'dd-MM-yyyy': \n" + sdf1.parse(inputDate));
			

			Date sdf =  new SimpleDateFormat("dd-MM-yyyy").parse("19-8-1983");   // this will convert given date within parse to a date
			System.out.println("\n coding in one step by converting from string type to date type : \n" +sdf); 

		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}

	}

}


