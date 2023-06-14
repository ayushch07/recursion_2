package recursion;

import java.util.ArrayList;
import java.util.List;

public class prefix_Permutation {
	static int c=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		  boolean freq[]=new boolean[arr.length];
		  ArrayList<Integer> li=new ArrayList<Integer>();
		  List<List<Integer>> l=new ArrayList<>();

		  permutation(arr,li,l,freq);
		 
		  if(l.size()==0)
		
		System.out.println(-1);
		  else
			  System.out.print(l);
			
			
		 

	}
	public static boolean istrue(List<Integer> li)
	{
		int s=li.get(0);
		for(int i=1;i<li.size();i++)
		{
			s+=li.get(i);
			if(s%(i+1)==0)
				return false;
				
		}
		return true;
	}
	
	public static void permutation(int arr[],List<Integer>li,List<List<Integer>> l,boolean freq[])
	{
		if(c==1)
		{
			return;
			
		}
		if(li.size()==arr.length)
		{
		    
			if(istrue(li))
			{
				l.add(new ArrayList<>(li));
				c++;
                }		
			
		}
	
	
		for(int i=0;i<arr.length;i++)
		{
			if(!freq[i])
			{  freq[i]=true;
				li.add(arr[i]);
				permutation(arr,li,l,freq);
				li.remove(li.size()-1);
				freq[i]=false;
			}
		}
		
	}

}
