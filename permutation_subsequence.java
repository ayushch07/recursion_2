	package recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation_subsequence {
  public static void main(String[] args)
  
  {
	  int n=3;
	  ArrayList<String> li=new ArrayList<>();
      List<List<String>> l=new ArrayList<>();
      boolean freq[]=new boolean[n];
      permutation(n,li,l,freq);
      System.out.println(l);
     
      System.out.print(l.get(2));
     
      
   
  }
  public static void permutation(int n,ArrayList<String> li,List<List<String>> l,boolean freq[])
  {
      if(li.size()==n)
      {
            l.add(new ArrayList<>(li));
            return;
      }
      for(int i=0;i<n;i++)
      {
          if(!freq[i])
          {
              freq[i]=true;
              li.add(String.valueOf(i+1));
              permutation(n,li,l,freq);
              li.remove(li.size()-1);
              freq[i]=false;
          }
      }
  }
}
