package recursion;
import java.util.List;
import java.util.ArrayList;
public class print_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {2,3,5,8};
       int target=10;
       List<String> li=new ArrayList<>();
       pp(arr,target,"",li,0);
       System.out.print(li);
	}

	private static void pp(int[] arr, int target, String string,List<String> li,int idx) {
		// TODO Auto-generated method stub
		    if(target==0)
		    {
		    	if(!li.contains(string))
		    	li.add(string);
		    	return;
		    }
		    for(int i=idx;i<arr.length;i++)
		    {
		    	if(target>=arr[i])
		    	{
		    		pp(arr,target-arr[i],string+arr[i],li,idx);
		    	}
		    }
		
	}


}
