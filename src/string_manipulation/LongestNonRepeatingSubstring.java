package string_manipulation;

public class LongestNonRepeatingSubstring {

	/*
	 * Length of longest non-repeating substring
	 */
	public static void main(String[] args) {

		longestNonRepeatingSubstring("abcabcbaabcd");
	}

	public static int longestNonRepeatingSubstring(String s) {
		boolean[] flag = new boolean[128];
		int i = 0;
		int maxLength = 0;
		for (int j = 0; j < s.length(); j++) {
			while (flag[s.charAt(j)]) {
				flag[s.charAt(i)] = false;
				i++;
			}
			flag[s.charAt(j)] = true;
			maxLength = Math.max(j - i + 1, maxLength);
		}
		return maxLength;
	}
}
