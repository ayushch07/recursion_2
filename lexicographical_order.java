package recursion;

public class lexicographical_order {
public static void main(String[] ags)
{
//	int a=0x34;
//	System.out.println(a);
	
	int n=100;
	lex(n,0);
	
}
public static void lex(int n,int curr)
{
	if(curr>n)
	{
		return;
	}
	System.out.print(curr+" ");
	int i=0;
	if(curr==0)
	i=1;
	for(;i<=9;i++)
		lex(n,curr*10+i);
}
}

