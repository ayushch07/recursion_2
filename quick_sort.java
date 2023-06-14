package recursion;
//ye poora shi nhi hai.

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,5,15,2,58,1,5,8};
sort(arr,0,arr.length-1);
  for(int i=0;i<arr.length;i++)
	  System.out.print(arr[i]+" ");
		
  
	}
	public static int sort(int arr[],int si,int ei)
	{
		int item=arr[ei];
		int pi=si;
		for(int i=si;i<ei;i++)
		{
			if(arr[i]<=item)
			{
				int temp=arr[i];
				arr[i]=arr[pi];
				arr[pi]=temp;
				pi++;
			}
		}
		int temp=arr[pi];
		arr[pi]=arr[ei];
		arr[ei]=temp;
		return pi;
	}

}
