package ExceptionHandling;

public class HandleCheckedException {

	public static void main(String[] args) throws InterruptedException  
	{
		System.out.println("Program is started");
		System.out.println("Program is in process");
		
	/*	try
		{
			Thread.sleep(4000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		} */
		
		Thread.sleep(4000);
		
		System.out.println("Program closed");
		System.out.println("program exited");

	}

}
