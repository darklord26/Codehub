package arrays;

public class TwoSumSortedArray {

	public static void main(String[] args) {
		int[] input = { 1,1,2,3,4 };
		int target = 4;
		int[] result = findTwoSum(input, target);
		System.out.println(result);
	}

	public static int[] findTwoSum(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start < end) {
			if (nums[start] + nums[end] < target) {
				start++;
			} else {
				end--;
			}
			if (nums[start] + nums[end] == target) {
				return new int[] { start, end };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
