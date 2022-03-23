package pack2;

import pack1.A;

public class B extends A
{

	public static void main(String[] args)
	{
		/*A aobj= new A();*/
		//aobj.i=20; // not accessable coz it is mentioned in other pacakge

		B obj=new B();
		obj.i=20;
		obj.pac();
	}

}
