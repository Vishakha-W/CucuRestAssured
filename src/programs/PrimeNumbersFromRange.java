package programs;

public class PrimeNumbersFromRange {
     public static void main(String []args)
     {int flag=0;
     
    	 System.out.println("Prime number from range 1 to 100");
    	 for(int i=0;i<=100;i++)
    	 {  flag=0;
    		 for(int j=2;j<=i/2;j++)
    		 {
    			 if(i%j==0)
    			 {
    				 //condition for non prime number
                  System.out.println("--->");
                  flag=1;
                  break;
    			 }
    		 }
    		 if(flag==0)
    		 {
    			 System.out.println("it is a prime number"+i);
    		 }
    		 else
    		 {
    			 System.out.println("it is not a prime number"+i);
    		 }
    	 }
     }
	
	
}
