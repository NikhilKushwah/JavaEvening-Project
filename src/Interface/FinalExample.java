package Interface;

final class Test
{
	final int a=10;
	
final void m1 ()
	{
		//a=20; // not valid coz int a is mentioned as final
		System.out.println(a);
	}
}
 
/*class Test12 extends Test // not valid cozz Test class is mentioned final
{
	/*void m1() not valid cozz m1 method is mentioned as final
	{
		System.out.println("m1 is overriden");
	}
}*/



public class FinalExample {

	public static void main(String[] args)
	{
		/*Test12 obj=new Test12();
		obj.m1();*/
		
		Test obj2=new Test();
		obj2.m1();

	}

}
