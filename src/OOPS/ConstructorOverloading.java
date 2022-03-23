package OOPS;

public class ConstructorOverloading {

	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverloading() // First constructor
	{ 
		a=10;
		b=20;
		c=20.25;
	}
	
	ConstructorOverloading(int i, int x) //second constructor
	{
		a=i;
		b=x;
	}
	
	ConstructorOverloading(int i, double x) // third constructor
	{
		a=i;
		c=x;
	}
	
	ConstructorOverloading(int i, int x, double y) // fourth constructor
	{
		a=i;
		b=x;
		c=y;
	}
	
	ConstructorOverloading(int i, double x, int y) // fith constructor
	{
		a=i;
		c=x;
		b=y;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		//ConstructorOverloading co=new ConstructorOverloading();
		//ConstructorOverloading co=new ConstructorOverloading(10,20);
		//ConstructorOverloading co=new ConstructorOverloading(10, 10.5);
		//ConstructorOverloading co=new ConstructorOverloading(10, 20,10.5);
		ConstructorOverloading co=new ConstructorOverloading(10, 20.5,30);
		co.display();

	}

}
