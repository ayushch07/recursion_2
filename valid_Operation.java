package recursion;

import java.util.Scanner;
import java.util.Stack;

public class valid_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 Stack<Integer>st=new Stack<Integer>();
		 int n=sc.nextInt();
		    int arr[]=new int[5];
		    for(int i=0;i<n;i++)
		    {	arr[i]=sc.nextInt();
		    }
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		    	if(arr[i]==1)
		    	{
		    		st.push(arr[i]);
		    	}
		    	else
		    	{
		    		if(st.isEmpty())
		    		{
		    			c=1;
		             	}
		    		else
		    		{
		    			st.pop();
		    		}
		    	}
		    	
		           
		    		if(c==1)
		    			break;
		    		
		    }
		    if(c==1)
		    {
		    	System.out.print("Invalid");
		    }
		    else if(st.peek()==0)
		    {
		    	System.out.println("Invalid");
		    	
		    }
		    else
		    {
		    	System.out.println("Valid");
		    }
		  
		    
	}

}
