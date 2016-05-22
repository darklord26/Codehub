package Narvar;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquare {

	public static void main(String[] args) {
		
		
		int[] a = { 3, 4, 5, 6, 7, 8, 9, 10 };
		int start = a[0];
		int end = a[a.length-1];
		List<Integer> result = findPerfectSquares2(start,end);

		for (int i : result) {
			System.out.println(i);
		}

	}

	static List<Integer> findPerfectSquares2(int start, int end) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = start; i <= end; i++) {
			int sqrt = (int) Math.sqrt(i);
			if (sqrt * sqrt == i) {
				list.add(i);
			}
		}
		return list;
	}

}
