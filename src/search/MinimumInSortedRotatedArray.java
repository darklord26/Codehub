package search;

public class MinimumInSortedRotatedArray {

	public static void main(String[] args) {
		int [] input = {9,10,1,2,4,5,6,7,8};
		int position = minimum(input);
		System.out.println("The position of the minimum element is:" + position);
	}
	
	static int minimum(int [] arr){
		int low = 0;
		int high = arr.length-1;
		int mid;
		while(low < high && arr[low] >= arr[high]){
			mid = (low + high)/2;
			if(arr[mid]>arr[high]){
				low = mid +1;				
			}
			else{
				high = mid;
			}			
		}
		return low;
		
	}

}
