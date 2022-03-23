package datastructures;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args)
	{
		ArrayList <String> AL=new ArrayList<String>();
		
		//adding elements to ArrayList
		
		AL.add("Nikhil");
		AL.add("Sam");
		AL.add("Vaibhav");
		AL.add("Chris");
		
		System.out.println(AL.size());
		
		for(String s:AL)
		{
			System.out.println(s);
		}
	}

}
