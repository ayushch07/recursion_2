package recursion;

import java.util.ArrayList;

public class sum_target {

	public static void main(String[] args)
	{
	    int arr[]= {5,4,5,2,1};
	    ArrayList<Integer> li=new ArrayList<Integer>();
	    int target=6;
	    sum(0,arr,target,0,li);
	    
	    
	}
	public static void sum(int ind,int arr[],int target,int s,ArrayList<Integer>li)
	{
		if(ind==arr.length)
		{
			if(s==target)
			{
			   System.out.println(li);
			}
			return;
		}
		
		li.add(arr[ind]);
		s=s+arr[ind];
		sum(ind+1,arr,target,s,li);
		s=s-arr[ind];
		li.remove(li.size()-1);
		sum(ind+1,arr,target,s,li);
		
		
	
	}
}
