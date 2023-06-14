package recursion;

public class linear_search {
public static void main(String[] args)
{
	int arr[]= {1,2,3,4,7,6,6845346,5468,7,898989898,98989898,9898,9989989};
	int target=64646;
	
	System.out.println(search(arr,0,target));
	String str="Haathi";
	str=str.substring(0,2);

	System.out.println(str);
}
public static int search(int arr[],int index,int target)
{
	if(index==arr.length)
	return -1;
	if(target==arr[index])
		//System.out.println(index);
	    return index;
	 return search(arr,index+1,target);
	

	
	
}
}
