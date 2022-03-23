package Arrays;

public class ArraysExample2 {

	public static void main(String[] args)
	{
		//With limitation
		String s[]=new String [3];
		
		s[0]="Welcome";
		s[1]="to";
		s[2]="training";
		
		System.out.println(s.length); // return the length of arrays.
		
		for(String a:s)
		{
			System.out.println(a);
		}

	}

}
