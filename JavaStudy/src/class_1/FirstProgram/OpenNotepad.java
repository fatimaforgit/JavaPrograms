package class_1.FirstProgram;
import java.util.*;
import java.io.*;

public class OpenNotepad 

{	
	 
	 public static void main(String[] args) 
	 {	 
		 Runtime rs = Runtime.getRuntime();
	 
	    try 
	    {
	      rs.exec("notepad openMe.txt"); // this file is placed in the path C:\JavaPrograms\JavaStudy
	    }
	    catch (IOException e) 
	    {
	      System.out.println(e);
	    }   
	  }
	
}

/*Explanation of code: getRunTime method is used to get reference of current RunTime object, 
 * exec method can be used to execute commands. You can also specify a file while 
 * opening notepad such as exec("notepad programming.txt") where 'programming.txt' is the 
 * file you wish to open, if the file doesn't exist in current working directory then a 
 * dialog box will be displayed to create file. You can launch other applications using exec 
 * method, for example exec("calc") will launch calculator application. If an application is 
 * present in a directory which is not set in environment variable PATH then you can specify 
 * complete path of application. If you are still using Notepad for Java development it is 
 * recommended to switch to some advanced text editor like Notepad++ or use a development IDE.
 */
