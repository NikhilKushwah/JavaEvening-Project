package Interface;

interface Testinter
{
	int a=10; // by default variable is static and final
	void display(); // by default abstract method
	
}

public class InterfaceExample implements Testinter
{
	public void display()
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		InterfaceExample obj=new InterfaceExample();
		obj.display();

	}

}
