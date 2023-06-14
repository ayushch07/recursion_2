package recursion;

public class phone_number {
	static String key[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
	public static void main(String[] ags)
	{
               printkey("12", "");
//               String press=key['2'-48 	];
//               System.out.print(press);
              String ab="abc";
              ab=ab.substring(1);
              System.out.print(ab);
	}
               public static void printkey(String str,String s)
                             {
            	   
            	   if(str.length()==0)
            	   {
            		   System.out.println(s);
            		   return;
            	   }
            	   char ch=str.charAt(0);
            	   String press=key[ch-'0'];
            	   for(int i=0;i<press.length();i++)
            		   printkey(str.substring(1), s+press.charAt(i));
            	   
               }

}
