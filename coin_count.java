package recursion;

import java.util.ArrayList;

public class coin_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,2,3,4};
    int amount=22;
    ArrayList<Integer> li=new ArrayList<Integer>();
    sum(arr,amount,li);
    System.out.print(s);
	}
	static int s=Integer.MAX_VALUE;
	public static void sum(int sum[],int count,ArrayList<Integer> li)
	{
		if(count==0)
		{
			
			int mini=li.size();
			 s=Math.min(s, mini);
			 return;
		}
		for(int i=0;i<sum.length;i++)
		{
			if(count>=sum[i])
			{
				li.add(sum[i]);
				sum(sum,count-sum[i],li);
				li.remove(li.size()-1);
				
			}
		}
	}

}
