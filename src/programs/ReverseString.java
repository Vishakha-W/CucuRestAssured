package programs;

public class ReverseString {

	public static void main(String []args)
	{
		String original="Hello",reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		
		System.out.println("reverse string is  "+reverse);
	}
	
	
	
}
