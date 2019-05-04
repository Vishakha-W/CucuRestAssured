package programs;

public class EvenOdd {

	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6};
		System.out.println("Even odd programs");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+"is even");
			}
			else
			{
				System.out.println(arr[i]+"is odd");
			}
		}
		
		
	}
	
	
	
	
}
