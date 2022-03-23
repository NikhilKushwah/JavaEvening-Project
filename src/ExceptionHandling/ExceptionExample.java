package ExceptionHandling;

public class ExceptionExample 
{
	public static void main(String[] args)
	{
		System.out.println("started");
		
	//	Thread.sleep(4000); // InterreuptedException this is called checked Exception
		
		int  a=10;
		System.out.println(a/0); // ArithemeticException this is called un-checked Exception 
		
		System.out.println("Stoped");

	}

}
