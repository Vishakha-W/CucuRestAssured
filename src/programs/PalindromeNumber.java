package programs;

public class PalindromeNumber {

	public static void main(String args[])
	{
		int n=12121;
		int original=n;
		int remainder,reverse=0;
		while(n!=0)
		{
			remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
					
		}
		
		if(reverse==original)
		{
			System.out.println("Number is palindrome ");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
	
	
	}
	
	
}
