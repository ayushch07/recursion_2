package recursion;

public class matrix_search {
	
	public static void main(String[] args)
	{
		int n=3;//row
		int m=4;//col
		System.out.println(prntans(n,n,0,0,""));
	
	}
	public static int prntans(int n,int m,int cc,int cr,String ans)
{
		//int c,d;
		if(cc==m-1 && cr==ne-1)
		{
			System.out.println(ans);
			return 1;
		}
		if(cc>=m || cr>=n)
			return 0
					
					;
		int c=prntans(n,m,cc,cr+1,ans+"v");
		int d=prntans(n,m,cc+1,cr,ans+"h");
//		sum=c+d;
		return c+d;
		
}
	

}
