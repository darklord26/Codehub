package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] input = { 2, 7, 9, 8, 1, 6 };
		int target = 11;
		int[] result = findTwoSum(input, target);
		System.out.println(result);
	}

	public static int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(Math.abs(target - nums[i]))) {
				return new int[] { map.get(target - nums[i]), i };
			} else {
				map.put(nums[i], i);
			}
		}
		throw new IllegalArgumentException("No two sum solution");

	}

}
