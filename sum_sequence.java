package recursion;

import java.util.ArrayList;

public class sum_sequence {
 public static void main(String[] args)
 {
	 int arr[]= {2,3,6,7};
	 //int target=5;
	 ArrayList<Integer> li=new ArrayList<Integer>();
	 int j=sum(arr,0,7,li);
	 System.out.print(j);
	 
	 
 }
 public static int sum(int arr[], int index,int target,ArrayList<Integer> li)
 {
	
	 if(index==arr.length)
	 {
		 if(target==0)
		 
			 System.out.println(li);
			 return 0;
		 
		 //return;
	 }
		 if(target>=arr[index])
		 {
			 li.add(arr[index]);
		sum(arr,index,target-arr[index],li);
			 li.remove(li.size()-1);
			
		 }
		 int d=sum(arr,index+1,target,li);
	
		return d;
		 
		 
			 
	 }
 }

