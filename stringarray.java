package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String str[]=new String[6];
		
		String str[]= {"coffee","donuts","time","toffee"};
		int c=0;
		List<String> li=new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			li.add(str[i]);
		}
		String a="";
		String b="";
		//for(int i=0;i<str.length;i++)
	     for(int i=0;i<str.length;i++)
	     {
	    	 for(int j=0;j<str.length;j++)
	    	 {
	    		    	 a=str[i].charAt(0)+str[j].substring(1);
	    			   b=str[j].charAt(0)+str[i].substring(1);
	    	 
	    		     
	    			   
	    		 
	    		 if(li.contains(b)||li.contains(a))
	    			 continue;
	    		 else
	    			 c++;
	    		 
	    			   
	    	      }
	    	 }
	     System.out.println(c);
	     }
	    
	   
	   

	
}


