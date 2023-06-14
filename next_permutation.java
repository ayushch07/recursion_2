package recursion;

import java.util.Arrays;

public class next_permutation {
	public static void main(String[]ags)
	{
		int arr[]= {1,2,3};
		int temp=0;
		int c=arr.length-2;
		int d=arr.length-1;
		while(c>=0 && arr[c]>=arr[c+1])
			c--;
		if(c>=0)
		{
			while(arr[d]<=arr[c])
			{
				d--;
			}
			swap(arr,c,d);
		}
		reverse(arr,c+1,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	   
	}
	public static void swap(int arr[], int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void reverse(int arr[], int c,int d)
	{
		while(c<d)
		{
			swap(arr,c++,d--);
		}
	}

}
