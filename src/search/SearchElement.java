package search;

public class SearchElement {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 8, 9, 10 };
		int target = 7;
		int result = searchPosition(arr, target);
		System.out.println(result);
	}

	static int searchPosition(int[] nums, int target) {
		// Binary search setup

		int low = 0;
		int high = nums.length - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if (nums[low] < target) {
			return low +1;
		}
		if (nums[high] == target) {
			return high;
		}
		return low;
	}
}
