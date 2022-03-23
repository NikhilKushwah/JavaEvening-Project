package Arrays;

public class StringMethods {

	public static void main(String[] args)
	{
		String s="Nikhil";
		
		System.out.println(s.length());
		
		//Concatination
		
		String s1="Welcome";
		String s2=" to training";

		System.out.println(s1+s2);
		System.out.println("Wlcome"+" to training");
		
		System.out.println(s1.concat(s2));
		System.out.println("Welcome".concat(" to training"));
	
		//Equals 
		
		String s3="WELCOME";
		String s4="welcome";
		
		
		System.out.println(s3.equals(s4));// This is case sensitive thats y it is showing False
		
		System.out.println(s3.equalsIgnoreCase(s4));// This is not case sensitive
		
		
		//contains
		
		System.out.println(s.contains("yz"));
		System.out.println(s2.contains("to"));
		System.out.println(s3.contains("WELCOME"));
		
		//Substring  will give the path of the strings
		
		
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(0,6));
		
		
		//replace
		
		System.out.println(s.replace('i', 'a'));
		System.out.println(s1.replace('l', 'b'));
		
		System.out.println(s.replace("Nikhil","Dome"));
	
	}

}
