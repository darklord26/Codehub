package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* We could use 3 ways:
 * Find sum of elements in first array and second array. And then find the difference to get the number
 * HashMap
 * XOR
 */

public class MissingElement {

	public static void main(String[] args) {
		int[] a = { 4, 1, 0, 2, 9, 6, 8, 7, 5, 3 };
		int[] b = { 6, 4, 7, 2, 1, 0, 8, 3, 9, };
		int res = findMissingElem(a, b);
		int result = findMissingElem2(a, b);
		System.out.println(res);
		System.out.println(result);
	}

	static int findMissingElem(int[] a, int[] b) {
		if (a.length <= 0 || b.length <= 0) {
			return -1;
		}
		int aSum = 0;
		int bSum = 0;

		if (a.length != b.length) {
			for (int i = 0; i < a.length - 1; i++) {
				aSum += a[i];
			}

			for (int j = 0; j < b.length - 1; j++) {
				bSum += a[j];
			}

			int res = Math.abs(aSum - bSum);

			return res;
		}
		System.out.println("No missing element");
		return -1;
	}

	static int findMissingElem2(int[] a, int[] b) {
		if (a.length <= 0 || b.length <= 0) {
			return -1;
		}

		if (a.length != b.length) {
			Map<Integer, Integer> elem = new HashMap<Integer, Integer>();
			for (int i = 0; i < a.length; i++) {
				if (elem.containsKey(a[i])) {					
					elem.put(a[i], elem.get(a[i]) + 1);
				}
				elem.put(a[i], 1);
			}
			for (int i = 0; i < b.length; i++) {
				if (elem.containsKey(b[i])) {
					elem.put(b[i],elem.get(b[i]) -1);
				}
			}
			for(Map.Entry<Integer,Integer> i : elem.entrySet()){
				if(i.getValue() == 1){
					return i.getKey();
				}
			}

		}

		System.out.println("No missing element");
		return -1;
	}
}
