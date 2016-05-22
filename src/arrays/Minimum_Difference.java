package arrays;

import java.util.Arrays;

public class Minimum_Difference {

	public static void main(String[] args) {
		int a[] = { 4, 9, 1, 32, 13 };
		int res = findMinimum(a);
		System.out.println(res);
	}

	static int findMinimum(int [] a){
		Arrays.sort(a);
		// 1,4,9,13,32
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length-1;i++){
			min = Math.min(min,Math.abs(a[i] - a[i+1]));
		}
		return min;
	}

}
