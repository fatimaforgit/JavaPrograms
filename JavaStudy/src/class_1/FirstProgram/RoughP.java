package class_1.FirstProgram;

import java.util.Scanner;

// program to demonstrate method chaining in java

class RoughP
{
	public void chats()
	{
		System.out.println("i am within chats");
	}
	public void chinese()
	{
		System.out.println("i am within chinese chats");
	}
	

	public static void main(String args[])
	{
		myOrder m = new myOrder();
		m.chats();
		m.chinese();
	}
	
}
