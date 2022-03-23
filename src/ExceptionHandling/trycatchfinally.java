package ExceptionHandling;

public class trycatchfinally {

	public static void main(String[] args) 
	{
		int array[]=new int[5];
		try
		{
		array[4]=120;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("This is finally block");
		}
	}

}
