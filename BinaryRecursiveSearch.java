public class BinaryRecursiveSearch implements Practice03Search{

	public String searchName(){
		return "Binary Recursive Search";
	}


	public int search(int[] arr, int target, int start, int end){
		if(start>end)
			return -1;
		int mid = (start+end)/2;
		if(arr[mid]==target)
			return mid;
		else if(arr[mid]<target)
			return search(arr,target,mid+1,end);
		else
			return search(arr,target,start,mid-1);
	}
	
}