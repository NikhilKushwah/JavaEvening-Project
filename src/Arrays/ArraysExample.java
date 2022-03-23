package Arrays;

public class ArraysExample {

	public static void main(String[] args)
	{
		int a[]=new int[5]; // declaration of arrays

		//store elements in arrays
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		
		// read elements from arrays.
	/*	for(int b=0;b<=4;b++)
		{
			System.out.println(a[b]);
		}*/
		
		//for each loop
		
		for(int x: a)
		{
			System.out.println(x);
		}
	}

}
