package arrays;

public class ArrayAddition {

	public static void main(String[] args) {
		int arr1[] = { 8, 4, 3, 4, 4, 5 };
		int arr2[] = { 1, 6, 5, 6 };
		ArrayAddition aa = new ArrayAddition();
		int result[] = aa.add(arr1, arr2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}
	}

	private int[] add(int[] arr1, int[] arr2) {
		int l = Math.max(arr1.length, arr2.length);
		int[] result = new int[l];

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = result.length - 1;
		int carry = 0;

		while (i >= 0 && j >= 0) {
			int res = arr1[i] + arr2[j] + carry;
			carry = res / 10;
			int digit = res % 10;
			result[k] = digit;
			i--;
			j--;
			k--;
		}

		while (i >= 0) {
			int res = arr1[i] + carry;
			carry = res / 10;
			int digit = res % 10;
			result[k] = digit;
			i--;
			k--;
		}
		while (j >= 0) {
			int res = arr2[i] + carry;
			carry = res / 10;
			int digit = res % 10;
			result[k] = digit;
			j--;
			k--;
		}

		if (carry > 0) {
			int[] newResult = new int[result.length + 1];
			for (int t = newResult.length - 1; t > 0; t--) {
				newResult[t] = result[t - 1];
			}
			newResult[0] = carry;
			return newResult;
		}

		return result;

	}

}
