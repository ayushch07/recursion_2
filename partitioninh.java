package recursion;

public class partitioninh {
	public static void main(String[]ag)
	{
		String i="123";
		part(i,"");
	}
	static char[] ch= {'0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	static void part(String str,String ans)
	{
		if(str.length()==0)
		{
		
			
			System.out.println(ans);
			
			return;
		}
		for(int i=1;i<=str.length();i++)
		{
			String q=str.substring(0,i);
			if(Integer.parseInt(q)<=26)
			 part(str.substring(i),ans+ch[Integer.parseInt(q)]);
		}
	}

}
