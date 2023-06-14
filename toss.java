package recursion;

import java.util.Scanner;

public class toss {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str="";
		int n=sc.nextInt();
		toss(n,str);
	}
	public static void toss(int n,String str)
	{
//		if(str.contains("HH"))
//			return;
//		if(str.contains("TT"))
//			return;
		if(n==0)
		{
			System.out.println(str);
			return;
		}
		
		toss(n-1,str+"H");
		toss(n-1,str+"T");
		
	}
	//ye str.cotains ki jagah likha hai.
	//if(str.length==0||str.CharAt(str.length()-1)!='H')
	//{
	 //  toss(n-1,str+"H);        }
   //	toss(n-1,str+"T");
	

}
