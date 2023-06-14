package recursion;

public class string_subsequence {
	public static void main(String[] args)
	{
		String str="abcd";
		String s="";
		sub(str,s,0);
		
	}
	public static void sub(String str,String s,int index)
	{
		if(index==str.length())
		{
			if(s=="")
				System.out.print("[]");
			else
			System.out.println(s);
			return;
		}
		sub(str,s+str.charAt(index),index+1);
		sub(str,s,index+1);
	}

}
