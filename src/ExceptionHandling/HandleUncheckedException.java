package ExceptionHandling;

public class HandleUncheckedException {

	public static void main(String[] args)
	{
		System.out.println("Program Started");
		int a=20;
		
		try 
		{
		System.out.println(a/0); //Arithmetic Exception
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
        
		
		String s=null;
		
		try
		{
		System.out.println(s.length()); // Nullpointer Exception
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("program is in proccess");
		System.out.println("Program is closed");
		
	}

	}
