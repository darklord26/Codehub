package string_manipulation;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "The sky is";
		String reversedSentence = reverse(s);
		System.out.println(reversedSentence);
	}

	private static String reverse(String s) {
		char[] words = s.toCharArray();
		reverse(words, 0, words.length);

		int wordStart = 0;
		for (int i = 0; i <= words.length; i++) {
			if (i == words.length || words[i] == ' ') {
				reverse(words, wordStart, i);
				wordStart = i + 1;
			}
		}
		return new String(words);
	}

	private static void reverse(char[] a, int start, int end) {
		if (start >= end) {
			return;
		}
		while (start < end) {
			char temp = a[start];
			a[start] = a[end - 1];
			a[end - 1] = temp;
			start++;
			end--;
		}
	}
}
