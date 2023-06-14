package recursion;

public class palindrome_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		count(str);
		

	}
	public static int count(String s)
	{
		int c=0;
		for(int axis=0;axis<s.length();axis++)
		{
			for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++)
			{
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit))
				{
					  break;
				}
				c++;
			}
			
		}
		for(double axis=0;axis<s.length();axis++)
		{
			{
				for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++)
			
			if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit)))
			{
				break;
				
			}
			c++;
			}
		}
		
		return c;
	}

}
