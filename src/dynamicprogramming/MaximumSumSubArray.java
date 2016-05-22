package dynamicprogramming;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		int[] input = { 2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = maxSubArray(input);
		System.out.println(result);
	}

	public static int maxSubArray(int[] A) {
		int maxEndingHere = A[0];
		int maxSoFar = A[0];

		for (int i = 1; i < A.length; i++) {
			maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
			maxSoFar = Math.max(maxEndingHere, maxSoFar);
		}
		return maxSoFar;
	}
}
