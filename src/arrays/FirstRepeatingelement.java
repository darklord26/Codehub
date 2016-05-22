package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingelement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 7, 5, 3, 10, 2 };
		
		String b [] = {"a"};
		String c [] = {"a"};
		System.out.println(Arrays.equals(b, c));
		int res = firstRepeatingElem(a);
		System.out.println(res);
	}

	static int firstRepeatingElem(int[] a) {

		Set<Integer> set = new HashSet<Integer>();
		int repeatIndex = -1;
		for (int i = a.length-1; i>=0; i--) {
			if (set.contains(a[i])) {
				repeatIndex = i;
			} else {
				set.add(a[i]);
			}
		}
		return repeatIndex;
	}

}
