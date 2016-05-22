package arrays;

import java.util.HashSet;
import java.util.Set;

public class CountDuplicates {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5, 5, 6 };
		int x = 2;
		int count = countDup(a, x);
		System.out.println(count);
	}

	static int countDup(int[] a, int k) {
		if (a == null || a.length < 1) {
			return -1;
		}
		Set<Integer> hs = new HashSet<Integer>();
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (hs.contains(a[i])) {
				counter++;
			} else {
				hs.add(a[i]);
			}
		}
		return counter;
	}
}
