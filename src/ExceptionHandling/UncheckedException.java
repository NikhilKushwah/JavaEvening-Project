package ExceptionHandling;

public class UncheckedException {

	public static void main(String[] args)
	{
		System.out.println("Program Started");
		int a=20;
		
		//System.out.println(a/0); //Arithmetic Exception
		
		
		String s=null;
		//System.out.println(s.length()); // Nullpointer Exception
		
		
		String st="abcd1234";
	//    int i=Integer.parseInt(st); // NumberFormatException
	//    System.out.println(i); 
		
		
		int array[]=new int[5];
		array[10]=120; //  ArrayIndexOutOfBoundsException
		
		System.out.println("program is in proccess");
		System.out.println("Program is closed");
		
	}	
	}


