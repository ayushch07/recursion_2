package recursion;

public class longest_palindrome_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr("cbbd",0,"");
		System.out.println(stt.length());

	}
	 static String stt="";
	    public static void pr(String str,int index,String ans)
	    {
	        if(index==str.length())
	        {
	            if(isPalindrome(ans))
	            {
	                if(ans.length()>stt.length())
	                   stt=ans;
	            }
	            return;
	        }
	        pr(str,index+1,ans+str.charAt(index));
	        
	        pr(str,index+1,ans);
	    }
	     public static boolean isPalindrome(String str)
	    {
	        int i=0;
	        int j=str.length()-1;
	        while(i<=j)
	        {
	            if(str.charAt(i)!=str.charAt(j))
	            return false;
	            i++;
	            j--;

	        }
	        return true;
	    }
	    

}
