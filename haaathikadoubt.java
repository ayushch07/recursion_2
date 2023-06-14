package recursion;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class haaathikadoubt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
		int arr[]=new int[k];
		for(int i=0;i<k;i++)
		{
  		arr[i]=(int) Math.pow(2, i);
		}
		List<Integer> li=new ArrayList<Integer>();
		permutation(0,arr,li,0,n);
		System.out.println(c);

		}
	}
	static int c=0;
	public static void permutation(int index,int arr[],List<Integer> li,int sum,int n)
	{
		if(index==arr.length)
		{
			if(sum<=n)
			{System.out.println(li);
			c++;
			}
			return;
		}
		//not pick
		li.add(arr[index]);
		
		
		permutation(index+1,arr,li,sum+arr[index],n);
		li.remove(li.size()-1);
		
		permutation(index+1,arr,li,sum,n);
		
	}

}
