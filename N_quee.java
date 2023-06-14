package recursion;
import java.util.Scanner;
public class N_quee {
	

	public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		boolean board[][]=new boolean[n][n];
		printpath(n,board,0);
	    System.out.println(count);
	}
	public static boolean issafe(boolean[][]arr ,int row,int col)

	{
		int r=row;
		while(r>=0)
		{
			if(arr[r][col]==true)
				
				return false;
			r--;
		}
		 r=row;
	    int  c=col;
		while(r>=0 && c<arr.length)
		{
			if(arr[r][c]==true)
			return false;
			r--;
			c++;
			
		}
		 r=row;
		
		 c=col;
		while(r>=0 && c>=0)
		{
			if(arr[r][c]==true)
				return false;
			r--;
			c--;
		
		}
		return true;
		
	      
		
	}
	static int count=0;
	public static void printpath(int n,boolean board[][],int row)
	{
	 
		if(n==0)
		{
			count++;
		}
		if(row==board.length)
			return;
		for(int col=0;col<board.length;col++)
		{
			if(issafe(board,row,col)==true)
					{
				board[row][col]=true;
				printpath(n-1,board,row+1);

				board[row][col]=false;
					}
		}
	}
	}

}
