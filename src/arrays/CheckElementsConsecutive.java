package arrays;

import java.util.Arrays;

/*
 * Method 1 : 
 * Sort arrays and then traverse over the sorted array to find if the difference is more than 1
 * 
 * Method 2 : 
 * Calculate the Minimum and Maximum Element in the array.
 * Now use the property for consecutive numbers i.e. (Maximum - Minimum)-1 will be equal to the number of elements(n) in the array. 
 * If not straight away return false 			  	
 * Now use a boolean array to track for distinct elements.
 */

public class CheckElementsConsecutive {

	public static void main(String[] args) {
		int input[] = { 12,10,13,14,11 };
		CheckElementsConsecutive cia = new CheckElementsConsecutive();
		System.out.println(cia.checkConsecutive(input));
		System.out.println(cia.checkConsecutive2(input));
	}

	private boolean checkConsecutive(int[] num) {
		Arrays.sort(num);

		for (int i = 0; i < num.length - 1; i++) {
			if (num[i + 1] - num[i] > 1) {
				return false;
			}
		}
		return true;
	}

	private boolean checkConsecutive2(int[] num) {
		int min = num[0];
		for (int i : num) {
			if (i < min) {
				min = i;
			}
		}
		int max = num[0];
		for (int i : num) {
			if (i > max) {
				max = i;
			}
		}
		boolean[] visited = new boolean[num.length];

		if (num.length == (max - min + 1)) {
			for (int i = 0; i < num.length; i++) {
				if (visited[num[i] - min] != false) {
					return false;
				}
				visited[num[i] - min] = true;
			}
			return true;
		}
		return false;
	}

}
