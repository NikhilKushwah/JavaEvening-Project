package OOPS;

public class StaticExamples {

	
	int a; // non static variables
	static int b; // Static variables
	
	static void m1() // static methods
	{
		System.out.println("This is static method");
	}
	
	void m2() // non static methods
	{
		System.out.println("This is non static method");
	}
	
	void m3() // Non static method
	{
	    a=400; //non static variable
	    System.out.println(a);
	    b=500; // Static variable
	    System.out.println(b);
	    
	    m1(); // static method
	    m2(); // non static method
	}
	
	
	public static void main(String[] args) // Main method already defined
	{
		b=100;
		System.out.println(b);
		m1();
		
		//a=200;  not accessible bcoz  it is non static
		// m2(); not accessible bocz it is non static
		
		StaticExamples s=new StaticExamples(); // Object method
		s.a=200;
		System.out.println(s.a);
		s.m2();
		s.m3();

	}

}
