package recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation {
	public static void permutation(int arr[],List<List<Integer>> l,List<Integer>li,boolean freq[])
	{
		if(li.size()==arr.length)
		{
			l.add(new ArrayList<>(li));
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(!freq[i])
			{  freq[i]=true;
				li.add(arr[i]);
				permutation(arr,l,li,freq);
				li.remove(li.size()-1);
				freq[i]=false;
			}
		}
		
	}
	public static void main(String[] args)
	{
		int arr[]= {0,1,2,3};
		List<List<Integer>> l=new ArrayList<>();
		List<Integer> li=new ArrayList<>();
		boolean freq[]=new boolean[arr.length];
		permutation(arr,l,li,freq);
		System.out.println(l);
	}

}
