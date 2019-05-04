package programs;

public class MaxMinInArray {
	public static void main(String args[])
	{int max=0;
		int arr[]={1,2,3,4,5,6,7,8};
	for(int i=0;i<=arr.length;i++)
	{
		if(arr[i]>arr[i++])
		{
			max=arr[i];
		}
		else
		{
			max=arr[i+1];
		}
	}
	
	
	}

}
