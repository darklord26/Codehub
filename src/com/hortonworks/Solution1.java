package com.hortonworks;

public class Solution1 {

	public static int[] result(int[] no) {
		if (no == null || no.length == 0)
			return no;
		/*
		 * i -> iterate over the entire array once j -> iterates over duplicates
		 * section current -> processes the current element counter - > Setting
		 * the new incremented id's after detecting the duplicates
		 */

		int i = 0;
		int counter = 0;

		while (i < no.length) {
			int curr = no[i];

			if (counter >= no[i])
				no[i] = ++counter;
			else
				counter = no[i];

			int j = i + 1;

			// Will only go to this while, when there are duplicate id's found

			while (j < no.length && curr == no[j]) {
				no[j] = ++counter;
				j++;
			}
			// Updating the value of i after getting all the duplicates
			if (i + 1 != j)
				i = j;
			else {
				if (counter > no[i])
					no[i] = ++counter;
				i++;
			}
		}
		return no;
	}

}

/*
 * Time Complexity - > O(n) Space Complexity -> O(n)
 */