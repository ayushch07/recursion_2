package recursion;

import java.util.Scanner;

public class bitwise_or {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int y=8;
	     int arr[]=new int[n];
	     for(int i=0;i<n;i++)
	    	 arr[i]=sc.nextInt();

	     
	     int b=arr[0];
	     for(int i=1;i<n;i++)
	    	 b=arr[i]|b;
	  System.out.println(b);
	 // int c=3|5|6|2|1;
	  //System.out.println(c);
	  int d=1;
	  int t=0;
	  while(true)
	  {
		 t =d|b;
		  d++;
		  if(t>=y)
			  break;
		  
	  }
	  if(t==y)
	  System.out.println(d-1);
	   
	}

}
