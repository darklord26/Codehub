package com.hortonworks;

public class Solution {
	public static int[] result(int[] no) {
		int prev = no[0];
		int counter = 1;
		for (int i = 1; i < no.length; i++) {
			if (no[i] <= prev) {
				no[i] = no[i] + counter;
				counter++;
			} else {
				counter = 1;
			}
			prev = no[i];
		}
		return no;
	}
}
