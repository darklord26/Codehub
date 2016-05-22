package sorting;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "asjfkl";

		boolean reverse = validAnagram(s, t);
		System.out.println(reverse);
	}

	public static boolean validAnagram(String s, String t) {
		char[] first = s.toCharArray();
		char[] second = t.toCharArray();

		Arrays.sort(first);
		Arrays.sort(second);

		String fString = new String(first);
		String sString = new String(second);

		if (fString.equals(sString)) {
			return true;
		}
		return false;
	}

}
