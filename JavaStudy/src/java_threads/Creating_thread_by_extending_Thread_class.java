package java_threads;

public class Creating_thread_by_extending_Thread_class 
{

	public static void main(String[] args) throws InterruptedException
	{

		creating_Thread thread1 = new creating_Thread();
		thread1.start();

		Thread.sleep(3000); // delay to see separately two threads run 

		creating_Thread thread2 = new creating_Thread();
		thread2.start();

	}

}

class creating_Thread extends Thread
{	
	public void run() 
	{
		System.out.println("Calling 'startWillCallMe()' method  ");

		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Thread ID = "+Thread.currentThread().getId()+"\t i="+i);

		}
	}

}

