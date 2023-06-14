package recursion;

import java.util.Scanner;

public class nth_triangle {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=2;
		System.out.print(total(n,1,0));
		
	}
	public static int total(int n,int e,int s)
	{
		if(e>=n)
			return s;
	   return s+total(n-1,e+1,s);
	 
	}
}
