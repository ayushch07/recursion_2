package recursion;

import java.util.ArrayList;

public class substring_find {
public static void main(String [] args)
{
	String str="cab";
	
	ArrayList<String> li=new ArrayList<String>();
	String st=str;
	printanswer(str,"",li,st);
//	
//	String s="abc";
//        s=s.substring(2);
//   System.out.println(s);
	
			
}
public static void printanswer(String str,String ans,ArrayList<String> li,String st)
{
	if(str.length()==0)
	{ 
		

		if(li.contains(ans))
			return;
		else
		li.add(ans);
		if(st.compareTo(ans)>0)
	   System.out.println(ans);
	}
	for(int i=0;i<str.length();i++)
	{
		String s1=str.substring(0,i);
		String s2=str.substring(i+1);
		char ch=str.charAt(i);
		
		printanswer(s1+s2,ans+ch,li,st);
	}
}
}
