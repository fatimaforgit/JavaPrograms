package class_1.FirstProgram;

public interface Interface_Example_Food 
{
	void chats();
	void chinese();
	
}

class myOrder implements Interface_Example_Food
{
	public static void main(String args[])
	{
		myOrder m = new myOrder();
		m.chats();
		m.chinese();
	}
	
	public void chats()
	{
		System.out.println("i am within Indian chats");
	}
	public void chinese()
	{
		System.out.println("i am within chinese chats");
	}

}
