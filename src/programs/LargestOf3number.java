package programs;

public class LargestOf3number {

     public static void main(String []args)
     {
    	 int a=1,b=2,c=3;
    	 if(a>b && a>c)
    	 {
    		 System.out.println("a is largest of b and c"+a);

    	 }
    	 else if(b>a && b>c)
    	 {
    		 System.out.println("b is largest of a and c"+b);

    	 }
    	 else if(c>a && c>b)
    	 {
    		 System.out.println("c is largest of a and b "+c);
    	 }
    	 
     }
}
