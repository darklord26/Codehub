package arrays;

import java.util.Arrays;

public class QuickSelect {

	public static void main(String[] args) {

		int array[] = { 4, 1, 3, 10, 9, 5, 2 };
		int k = 10;
		int klargest = kthLargest(array, array.length - k);
		System.out.println(klargest);
	}

	private static int kthLargest(int[] num, int k) {
		int start = 0;
		int end = num.length - 1;
		return getKth(num, start, end, k);

	}

	private static int getKth(int[] num, int start, int end, int k) {
		int left = start;
		int right = end;
		// make pivot the start
		int pivot = start;

		while (left <= right) {

			while (num[left] <= num[pivot] && left <= right) {
				left++;
			}

			while (num[right] >= num[pivot] && left <= right) {
				right--;
			}
			if (left < right) {
				exchange(num, left, right);
			}
		}
		if (right >= 0 && pivot >= 0) {
			exchange(num, pivot, right);
		}
		if (k == right + 1) {
			return num[k];
		} else if (k > right + 1) {
			return getKth(num, right + 1, end, k);
		} else
			return getKth(num, start, right - 1, k);
	}

	private static void exchange(int[] num, int low, int high) {
		int temp = num[low];
		num[low] = num[high];
		num[high] = temp;
	}

}
