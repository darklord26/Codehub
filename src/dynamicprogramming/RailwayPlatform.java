package dynamicprogramming;

import java.util.Arrays;

public class RailwayPlatform {

	public static void main(String[] args) {
		double arr[] = { 9.00, 9.40, 9.50, 11.00, 15.00, 18.00 };
		double dep[] = { 9.10, 12.00, 11.20, 11.30, 19.00, 20.00 };

		int result = minPlatform(arr, dep);
		System.out.println(result);
	}

	private static int minPlatform(double arr[], double dep[]) {
		int plat_needed = 1, result = 1;

		int i = 1;
		int j = 0;

		while (i < arr.length && j < dep.length) {
			{
				if (arr[i] < dep[j]) {
					plat_needed++;
					i++;
					if (plat_needed > result) // Update result if needed
						result = plat_needed;
				} else // Else decrements count of platforms needed
				{
					plat_needed--;
					j++;
				}
			}
		}
		return result;
	}

}
