package recursion;
import java.util.*;
import java.lang.*;
public class binary_search_aggresive_cow {



		public static void main (String[] args) throws java.lang.Exception
		{
		         Scanner sc=new Scanner(System.in);
		         int t=sc.nextInt();
		         while(t-->0)
		         {
		         	int n=sc.nextInt();
		         	int c=sc.nextInt();
		         	int arr[]=new int[n];
		         	for(int i=0;i<arr.length;i++)
		         	{
		         		arr[i]=sc.nextInt();
		         		
		         	}
		         	Arrays.sort(arr);
		         	int low=0;
		         	int high=arr[arr.length-1];
		         	int mid=low+(high-low)/2;
		         	int ans=-1;
		         	while(low<=high)
		         	{
		         		 if(ispossible(arr,mid,c))
		         		 {
		         		 	ans=mid;
		         		 	low=mid+1;
		         		 }
		         		 else
		         		  high=mid-1;
		         		  mid=low+(high-low)/2;
		         	}
		         	System.out.println(ans);
		         }
		}
		         public static boolean ispossible(int arr[],int mid,int noc)
		         {        int c=1;
		         	     int val=arr[0];
		         	     for(int i=1;i<arr.length;i++)
		         	     {
		         	     	   if(arr[i]-val>=mid)
		         	     	   {
		         	     	   	   c++;
		         	     	   
		         	     	   if(c==noc)
		         	     	   return true;
		         	     	   val=arr[i];
		         	     }
		         	     }
		         	     return false;
		         }
		}
	

