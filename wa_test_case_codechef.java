package recursion;

import java.util.Scanner;

public class wa_test_case_codechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();

		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		   // System.out.println();

			 String str=sc.next();
		   
		    
		  
		     int min=Integer.MAX_VALUE;
		     
		    for(int i=0;i<str.length();i++)
		    {
		        if(str.charAt(i)=='0')
		         min=Math.min(min,arr[i]);
		        // System.out.println(min);
		         
		         
		    }
		    System.out.println(min);
	}

}
