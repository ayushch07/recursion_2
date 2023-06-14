package recursion;

import java.util.ArrayList;
import java.util.List;

public class subset_sum {
public static void main(String[] args)
{
	int arr[]= {1,2,3,4};
   ArrayList<Integer>li=new ArrayList<Integer>();
   // List<List<Integer>> l=new ArrayList<>();
	sum(0,arr,li,1,"");
	System.out.print(li);
			
}
public static void sum(int index,int arr[],ArrayList<Integer> li,int sum,String ans)
{
	
	if(index==arr.length)
	{
		li.add(sum);
		System.out.println(ans);
		return;
	}
	sum(index+1,arr,li,sum,ans);
	sum(index+1,arr,li,sum+arr[index],ans+arr[index]);

	
	
	
	
}
}
