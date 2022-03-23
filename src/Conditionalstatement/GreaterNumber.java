package Conditionalstatement;

public class GreaterNumber {

	public static void main(String[] args) 
	{
	
		int x=60;
		int y=100;
		int z=40;
		
		if((x>y)&&(x>z))
		{
			System.out.println("x is greater number");
		}
		else if((y>x)&&(y>z))
		{
			System.out.println("y is greater number");
		}
		else
		{
			System.out.println("z is greater number");
		}
	}

}
