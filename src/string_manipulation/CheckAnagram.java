package string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

	public static void main(String[] args) {
		String s1 = "Eleven plus two";
		String s2 = "Xwelve plus one";
		boolean result = checkAnagram(s1, s2);
		System.out.println(result);
	}

	private static boolean checkAnagram(String s1, String s2) {
		if (s1.isEmpty() || s2.isEmpty() || s1.length() != s2.length()) {
			return false;
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			while (!Character.isLetterOrDigit(s1.charAt(i))) {
				i++;
			}
			if (map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			} else {
				map.put(s1.charAt(i), 1);
			}
		}
		for (int i = 0; i < s1.length(); i++) {
			while (!Character.isLetterOrDigit(s1.charAt(i))) {
				i++;
			}
			if (map.containsKey(s2.charAt(i))) {
				map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
			} else {
				return false;
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return false;
			}
		}
		return true;
	}

}
