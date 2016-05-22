package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 6, 8, 10 };
		int[] b = { 4, 5, 6, 11, 15, 20 };
		int c[] = { 4, 2, 3, 5, 1 };
		int d[] = { 7, 8, 9, 1, 10 };
		int result = intersection(a, b);
		int res = intersection2(c, d);
		System.out.println(result);
		System.out.println(res);
	}

	static int intersection(int[] a, int[] b) {
		int x = 0;
		int y = 0;

		if (a[x] == b[y]) {
			return a[x];
		}
		while (a[x] < b[y]) {
			x++;
		}
		while (a[x] > b[y]) {
			y++;
		}
		if (a[x] == b[y]) {
			return a[x];
		}
		return -1;
	}

	static int intersection2(int[] a, int[] b) {
		if (a.length <= 0 || b.length <= 0) {
			return -1;
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			if(set.contains(b[i])){
				return b[i];
			}
		}			
		System.out.println("No common element");
		return -1;
	}
}
