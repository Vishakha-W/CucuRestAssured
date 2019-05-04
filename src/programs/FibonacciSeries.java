package programs;

public class FibonacciSeries {

	public static void main(String args[])
	{
		int f0=0,f1=1,c;
		int n=4;
		for(int i=1;i<=n;i++)
		{   System.out.print(" "+f0);
			c=f1+f0;
			f0=f1;
			f1=c;
		}
		
		
		
	}
	
	
	
}
