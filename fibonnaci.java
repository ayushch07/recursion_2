package recursion;

public class fibonnaci {

	public static void main(String [] args)
	{
		int n=5;
	System.out.print(fibbo(n));
	}
	public static int fibbo (int n)
	{
		if(n==1||n==0)
			return n;
		return fibbo(n-1)+fibbo(n-2);
	
		
		
	}
}
