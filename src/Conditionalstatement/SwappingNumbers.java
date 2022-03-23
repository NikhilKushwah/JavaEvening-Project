package Conditionalstatement;

public class SwappingNumbers {

	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		
		System.out.println("Values before swapping x" + x);
		System.out.println("Values before swappin y" + y);
		
		int z;
		z=x;
		x=y;
		y=z;
		
		System.out.println("Values after swapping x" + x);
		System.out.println("Values after swappin y" + y);

	}

}
