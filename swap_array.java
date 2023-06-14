package recursion;

public class swap_array {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		//int i=0;
	      reverse(0,arr);
	      for(int i=0;i<5;i++)
	    	  System.out.print(arr[i]+" ");
	      
		//System.out.println(arr);
		
	}
	public static void reverse(int i,int arr[])
	{
		if(i>=(arr.length)/2)
			return;
		int temp=arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
		reverse(i+1,arr);
	}
//	public static void swap(int i,int j)
//	{
//		int temp=i;
//		  i=j;
//		  j=temp;
//	}
}
