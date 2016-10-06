package arrays;

public class MedianTwoSortedArray {

	/*
	 * Modified Binary Search
	 * Time : O(log n)
	 * Space : O(1)
	 */
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 11, 17 };
		int b[] = { 9, 10, 11, 13, 14 };
		System.out.println("The median of the two array is:" + medianSearch(a, b));
		System.out.println(" ");
	}

	static int medianSearch(int[] a, int[] b) {
		int aStart = 0;
		int aEnd = a.length - 1;
		int bStart = 0;
		int bEnd = b.length - 1;

		while (aStart < aEnd && bStart < bEnd) {
			
			/* Base case 1 :
			 * When both array have only two numbers left i.e a[aStart,aEnd] && b[bStart,bEnd]
			 * Then the median is Maximum value between aStart && bstart, because the minimum value goes to the first position
			 * Reverse is true for the end values
			 */
			if (aEnd - aStart == 1 && bEnd - bStart == 1) {
				int max = Math.max(a[aStart], b[bStart]);
				int min = Math.min(a[aEnd], b[bEnd]);
				int median = (max + min) / 2;

				return median;
			}
			int aMid = (aStart + aEnd) / 2;
			int bMid = (bStart + bEnd) / 2;
			
			// Base Case 2 : 
			if (a[aMid] == b[bMid]) {
				return a[aMid];
			}
			if (a[aMid] < b[bMid]) {
				aStart = aMid;
				bEnd = bMid;
			} else {
				aEnd = aMid;
				bStart = bMid;
			}
		}
		return -1;
	}
}
