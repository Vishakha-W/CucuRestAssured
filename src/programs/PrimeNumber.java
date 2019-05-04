package programs;
//prime number from array of numbers
public class PrimeNumber {
    public static void main(String []args)
    {
    	int arr[]={1,2,3,4,5,6};
    	int flag=0;
    	//int n=5;
    	for(int j=0;j<arr.length;j++)
    	{    	    	
         flag=0;
    	for(int i=2;i<=arr[j]/2;i++)
    	{    	
    		System.out.println("Prime number programs"+arr[j]);
    		if(arr[j]%i==0)
    		{
    	    	flag=1;
    	    //	System.out.println("Prime number programs"+flag);
    			break;
    		}//	}}	
}
   	if(flag==0)
    	{
        	System.out.println("it is prime number"+arr[j]);

   	}else
    	{
    		System.out.println("it is not a prime number"+arr[j]);
    	}
    	}   	
    	
    
    	}
}
