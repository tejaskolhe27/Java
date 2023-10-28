package DAY9_Theory.Exception_Handling_Tester.src.exceptionHandling;

class FirstThread extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("First Thread Running....");
		}
		
	}	
}

class SecondThread extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("Second Thread Running....");
		}
		
	}	
}

public class Tester2 {

	public static void main(String[] args) {
		FirstThread ft1=new FirstThread();
		SecondThread ft2=new SecondThread();
		ft1.start();
		ft2.start();
	}
}
