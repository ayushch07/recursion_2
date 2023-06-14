package recursion;

public class fact_coding_Blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=4;
       System.out.println(fact(n));
       int c=fact(n);
       int d=fact(n-1)*(n-1);
       System.out.println(c-d);
		
	}
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int f= fact(n-1)*n;
		return f;
		
	}

}
