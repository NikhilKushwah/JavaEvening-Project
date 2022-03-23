package OOPS;

public class MethodOverloading {

	int a;
	int b;
	
	void sum() // First Method
	{
		a=10;
		b=20;
		System.out.println(a+b);
		
	}
	
	void sum(int i, int x) // Second Method
	{
		/*int a=i;
		int b=x;*/
		System.out.println(i+x);
	}
	
	void sum(int x, int y, int z ) // Third Method
	{
		System.out.println(x+y+z);
	}
	
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args)
	{
		MethodOverloading mo= new MethodOverloading();
		
		mo.sum();
		mo.sum(200, 300);
		mo.sum(20, 20.3124);
		mo.sum(600, 450, 800);
	}

}
