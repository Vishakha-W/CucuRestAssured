package programs;

public class PalindromeString {

	public static void main(String args[])
	{
		String original="madam",reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
			if(original.equals(reverse))
			{
				System.out.println("String is palindrome");
				
			}
			else
			{
				System.out.println("String is not a palindrome");
			}
		
	}
	
	
}
