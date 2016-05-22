package string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		String s = "Alive is awesome";
		char[] c = s.toCharArray();
		countChar(c);
	}

	static void countChar(char[] c) {
		if (c.length < 1) {
			return;
		}

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < c.length; i++) {
			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);
			} else {
				map.put(c[i], 1);
			}
		}

	}

}
