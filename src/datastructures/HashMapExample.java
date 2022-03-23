package datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	

	public static void main(String[] args) 
	{
		HashMap <Integer,String> Hm=new HashMap<Integer,String>();
		
		// Adding keypairs into hashmap
		
		Hm.put(100,"Nikhil");
		Hm.put(200,"Ram");
		Hm.put(300, "Bajrang");
		
		System.out.println(Hm);
		
		for(Map.Entry p:Hm.entrySet())// This is foreach loop
		{
			System.out.println(p.getKey()+ "  "+p.getValue());
		}
		Hm.remove(100);
		for(Map.Entry p:Hm.entrySet())// This is foreach loop
		{
			System.out.println(p.getKey()+ "  "+p.getValue());
		}

	}

}
