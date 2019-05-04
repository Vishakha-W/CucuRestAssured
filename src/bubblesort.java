
public class bubblesort {
           public static void main(String args[])
           {
        	   int a[]=new int[]{5,4,3,2,1};
        	   int pass=0,j=0,swap,n=5;
        	   
        	   for(pass=0;pass<n-1;pass++)
        	   {
        		   for(j=0;j<n-pass-1;j++)
        		   {
        			   if(a[j]>a[j+1])
        			   {
        				   //swap
        				   swap=a[j];
        				   a[j]=a[j+1];
        				   a[j+1]=swap;
        			   }
        		   }
        	   }
        	   
        	   
        	   for(int i=0;i<n;i++)
        	   {
        		   System.out.println("After Bubblesort is"+a[i]);
        	   }
        	   
        	   
           }
	
	
	
}
