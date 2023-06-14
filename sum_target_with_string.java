package recursion;

public class sum_target_with_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,2,5};
		int target=100;
		int p=sum(arr,target,"");
		System.out.print("total number of counts are "+ p);

	}
	public static int sum(int arr[], int target, String ans)
	{
		if(target==0)
		{
			System.out.println(ans);
			return 1;
		}
		 int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(target>=arr[i])
			{
				count+=sum(arr,target-arr[i],ans+arr[i]);
			}
		}
		return count;
	}
//list ke liye target ke neeche li.add or sum function ke baad li.remove(backtrack).
}
