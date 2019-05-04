package programs;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		
		int n=5;
		System.out.println("factorial of n is: "+recur(n));	
	}
	
	public static int recur(int n)
	{
		if(n==1)
			return 1;
		else
			return(n*recur(n-1));
		
	}

}
