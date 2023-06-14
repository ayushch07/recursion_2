package recursion;
import java.util.List;
import java.util.ArrayList;
public class target_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {2,8,9,15};
       int target=17;
       List<String> li=new ArrayList<>();
       pp(arr,target,"",li);
       System.out.print(li);
	}

	private static void pp(int[] arr, int target, String string,List<String> li) {
		// TODO Auto-generated method stub
		    if(target==0)
		    {
		    	if(!li.contains(string))
		    	li.add(string);
		    	return;
		    }
		    for(int i=0;i<arr.length;i++)
		    {
		    	if(target>=arr[i])
		    	{
		    		pp(arr,target-arr[i],string+arr[i],li);
		    	}
		    }
		
	}


}
