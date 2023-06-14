package recursion;

import java.util.ArrayList;

public class subsequence {
	public static int printSubsequences(int[] arr, int index,
            ArrayList<Integer> path)
{
      
// Print the subsequence when reach
// the leaf of recursion tree
if (index == arr.length)
{

// Condition to avoid printing
// empty subsequence
if (path.size() > 0)
{System.out.println(path);
  
}

else if(path.size()==0)
{
	System.out.println("[]");
	
}
return 1;
}



int c=printSubsequences(arr, index + 1, path);

path.add(arr[index]);

int l=printSubsequences(arr, index + 1, path);

// Backtrack to remove the recently
// inserted element
path.remove(path.size() - 1);

return l+c;
}


public static void main(String[] args)
{
int[] arr = { 1,2,3};

// Auxiliary space to store each path
ArrayList<Integer> path = new ArrayList<>();

System.out.print(printSubsequences(arr, 0, path));
}
}
