package Arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args)
	{
		//With Limitation
		
		Object a[][]=new Object[3][2]; //declaration
		
		//storing elements values into array.
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;

		//classic for loop
		
	/*	for(int i=0;i<=2;i++) //for incrementing rows 
		{
			for(int x=0;x<=1;x++) // for incrementing column for each rows
			{
				System.out.print(a[i][x]+ " ");
				
			}
			
			System.out.println(); 
		}*/
		
		
		//for each loop
		
		for(Object i[]:a)
		{
			for (Object j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
