package recursion;

import java.util.Scanner;

public class time_complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int num=(int)Math.pow(n,0.5);
		int no=(int)Math.sqrt(n);
System.out.println(no);
				for(int i=2;i<=num;i++)
				{
					if(n%i==0)
						c++;
					
				}
		if(c==0)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}
	

}
