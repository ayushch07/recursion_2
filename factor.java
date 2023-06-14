package recursion;

public class factor {
  public static void main(String[] args)
  {
	  int a=3;
	  System.out.println(fact(a))
	  ;
  }
  public static int fact(int a)
  {
	  if(a==0)
		  return 1;
	  return fact(a-1)*a;
  }
}
