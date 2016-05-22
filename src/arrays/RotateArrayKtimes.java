package arrays;

public class RotateArrayKtimes {

	public static void main(String[] args) {
		int arr [] = {0,1,2,3,4,5,6};
		int k = 3;
		int [] res = reverse(arr,k);
		for(int i = 0; i<res.length;i++){
			System.out.print(res[i]+",");
		}
			
	}
	
	private static int [] reverse(int [] num, int k){
		if (num == null || num.length==0 || k < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
	 
		if(k > num.length){
			k = k %num.length;
		}		
		int counter = num.length - k ;		
		swap(num,0,counter-1);
		swap(num,counter,num.length-1);
		swap(num,0,num.length-1);
		
		return num;
	}
	
	private static void swap (int []a, int start, int end){
		while(start<end){
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start ++;
			end--;
		}		
			
//		for(int i=0;i<(end-start)/2;i++){
//			int temp = a[i];
//			a[i] = a[end-i-1];
//			a[end-i-1] = temp;
//		}
	}

}
