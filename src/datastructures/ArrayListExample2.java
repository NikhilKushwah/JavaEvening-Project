package datastructures;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		// adding elements to array list
		System.out.println("number of elements:"+ al.size());
		
		al.add("Welcome");
		al.add(10);
		al.add(10.234);
		al.add('A');
		
		System.out.println("number of elements in array list are:"+ al.size());// Number of elements present in al
        System.out.println("elements in array list are:"+al);
		// inserting elements into array list
		al.add(2, "training");// 2 is describes after number of elements not position
		al.add(3,456);// 3 is describes after number of elements not position
		
		System.out.println("number of elements in array list are:"+ al.size()); 
		System.out.println("number of elements:"+ al);
		
		// Remove elements from array list
		
		al.remove("Welcome"); // directly specify the value
		al.remove(4);//4 is describes after number of elements not index
		System.out.println("number of elements in array list are:"+ al.size()); 
		System.out.println("number os elemnets:"+ al);
	}

}
