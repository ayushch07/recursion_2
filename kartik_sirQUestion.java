package recursion;

import java.util.Scanner;
import java.util.Stack;

public class kartik_sirQUestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer> st=new Stack<>();
		while(n-->0)
		{
			int q1=sc.nextInt();
			if(q1!=1)
			{
				int q2=sc.nextInt();
				st.push(q2);
					
				
			}
			else if(q1==1)
			{
				System.out.println(st.peek());
				st.pop();
			}
			
				
		}
		if(st.isEmpty())
			System.out.println("No Code");

	}

}
