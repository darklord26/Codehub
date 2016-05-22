package arrays;

public class MaxSum {

	public static void main(String[] args) {
		int[] num = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = maxSum(num);
		System.out.println(result);
	}

	static int maxSum(int[] a) {
		int maxsofar = a[0];
		int max = a[0];

		int n = a.length;

		for (int i = 1; i < n; i++) {
			maxsofar = Math.max(a[i], maxsofar + a[i]);
			max = Math.max(maxsofar, max);
		}

		return max;
	}

}
