package search;

public class CountNoOfTimesSorted {

	public static void main(String[] args) {
		int a [] = {11,12,13,2,3,4,5};
		int res = count(a);
		System.out.println(res);
	}
	
	private static int count(int a []){
		if(a.length<1){
			return -1;
		}
		
		int start = 0;
		int end = a.length-1;
		int mid;
		
		while(start<end){
			mid = (start + end)/2;			
			if(a[mid] < a[end]){
				end = mid;
			}
			else{
				start = mid+1 ;
			}
		}
		return start;
	}
}
