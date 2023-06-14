package recursion;

import java.util.ArrayList;

public class subset {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3};
		int k=2;
		ArrayList<Integer> li=new ArrayList<Integer>();
		subset(arr,0,li);
	}
	public static void subset(int arr[],int index,ArrayList<Integer> li)
	{
		if(index==arr.length)
			{
			if(li.size()>0)
			System.out.println(li);
			else if(li.size()==0)
				System.out.println("[]");
			
		
			}
		else
		{ 
			 li.add(arr[index]);
			subset(arr,index+1,li);
			 li.remove(li.size()-1);
		 subset(arr,index+1,li);
		
		 
		
		 
		
	}
	}
}
