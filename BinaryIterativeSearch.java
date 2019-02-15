public class BinaryIterativeSearch implements Practice03Search{
	public String searchName(){
		return "Binary Iterative Search";
	}


	public int search(int[] arr, float target){
		int start = 0;
		int end = arr.length;
		int mid = (start+end)/2;
		while(start<end){
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				return search(arr,target,mid+1,end);
			else
				return search(arr,target,start,mid-1);
			return -1;
		}
	}
}