package recursion;
//dice question.
public class trial {
	public static void main(String[] args)
	{
		
		int n=4;
		int src=0;
		String str="";
		printdice( n,src,str);
		
	}
	public static void printdice(int n,int src, String str)
	{
		if(src==n)
		{
			System.out.println(str+" ");
			
		}
		if(src>n)
		{
			return;
		}
		for(int i=1;i<=3;i++)
		{
			printdice(n,src+i,str+i);
		}
	}

}
