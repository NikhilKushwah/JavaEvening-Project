package Arrays;

public class ObjectArrays {

	public static void main(String[] args) 
	{
		//Without limitation
    	/*Object a[]=new Object[5];
    	
    	a[0]=10;
    	a[1]=10.56;
    	a[2]="Welcome";
    	a[3]='A';
    	a[4]=true; */
    	
    	Object a[]= {100,345.520,"Welcome",'A',true,500,600.33};
    	
    	for(Object i:a)
    	{
    	
    		System.out.println(i);
    	}
    	
	}

}
