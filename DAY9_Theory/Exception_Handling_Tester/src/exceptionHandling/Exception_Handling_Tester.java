package DAY9_Theory.Exception_Handling_Tester.src.exceptionHandling;

//EXCEPTION - It is defined as runtime anomaly
public class Exception_Handling_Tester {
	public static void fn1() throws InterruptedException
	{
		fn2();
	}
	public static void fn2() throws InterruptedException
	{
		fn3();
	}
	public static void fn3() throws InterruptedException
	{
	//Thread.sleep(20);
		throw new InterruptedException("Exception Occured");
	}

	public static void main(String[] args) {
		try {
			fn3();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}


/*class A
{
	public void fn()
	{
		
	}
}*/
