package Inheritancepkg;

class Bank
{
	int getRateOfinterest()
	{
	
		return 0;
	}
}

class ICIC
{

	int getRateOfinterest()
	{
		return 10;
	}
}

class SBI
{

	int getRateOfinterest()
	{
		return 12;
	}
}

class Kotak
{
	int getRateOfinterest()
	{
		return 13;
	}
}

public class Overriding {

	public static void main(String[] args) 
	{
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getRateOfinterest());
		
		ICIC iciciobj= new ICIC();
		System.out.println(iciciobj.getRateOfinterest());
		
		Kotak kotakobj=new Kotak();
		System.out.println(kotakobj.getRateOfinterest());
		

	}

}
