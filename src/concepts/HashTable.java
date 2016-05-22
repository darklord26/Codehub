package concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 5, 5, 1, 3, 4, 10 };
		int res = hSet(a);
		int result = hMap(a);
		System.out.println(res);
		System.out.println(result);
	}

	public static int hSet(int[] a) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i : a) {
			if (s.contains(i)) {
				return i;
			}
			s.add(i);
		}
		return -1;
	}

	public static int hMap(int[] num) {
		if (num == null || num.length < 1) {
			return -1;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0;i<num.length;i++) {
			if (map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i])+1);
			}
			else{
			map.put(num[i], 1);
			}
		}
		return -1;
		
	}

}
