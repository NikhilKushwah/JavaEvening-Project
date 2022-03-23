package Inheritancepkg;

class A
{
	int a;
	int b;
	
	public void display()
	{
		System.out.println(a+b);
	}	
}

class B extends A // sub child class single level inheritance
{
	int x;
	int y;
	
	public void show()
	{
		System.out.println(x+y);
	}
}

class C extends B  // sub child class multi level inheritance
{
	
	int z;
	int o;
	
	public void additio()
	{
		System.out.println(z+o);
	}
}

public class Test1 {

	public static void main(String[] args) 
	{
		/*A aobj=new A();
		aobj.a =500;
		aobj.b=200;
		aobj.display(); */
		
		B bobj=new B();
		bobj.x=100;
		bobj.y=100;
		bobj.show();

		bobj.a=200;
		bobj.b=300;
		bobj.display();
		
		
		C cobj=new C();
		cobj.a=100;
		cobj.b=200;
		cobj.o=300;
		cobj.z=400;
		cobj.x=500;
		cobj.y=600;
		
		cobj.display();
		cobj.show();
		cobj.additio();
	}

}
