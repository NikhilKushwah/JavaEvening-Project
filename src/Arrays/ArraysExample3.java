package Arrays;

public class ArraysExample3 {

	public static void main(String[] args) 
	{
		
		//Without limitaion
		int a[]= {100,200,300,400,500}; // we can store any number of elements
		
		int sum=0;
		for(int b:a)
		{
			System.out.println(b);
		    sum=sum+b;	
		}
		System.out.println(sum);

	}

}
