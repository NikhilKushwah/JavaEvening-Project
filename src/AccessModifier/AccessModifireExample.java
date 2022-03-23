package AccessModifier;

class A
{
/*private	int  a=10;
	
	private void AccM()
	{
		System.out.println(a);
	}*/
	
	int i=10;
	
	void m1()
	{
		System.out.println(i);
	}
}

public class AccessModifireExample 
{

	public static void main(String[] args)
	{
	// A obj=new A();// can not access as it is private
	// obj.AccM();// can not access as it is private

		A obj=new A();
		obj.i=20;
		obj.m1();
	}

}
