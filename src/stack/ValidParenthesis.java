package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String input = "{{([])}}";
		boolean result = validParenthesis(input);
		System.out.println(result);
	}

	static boolean validParenthesis(String s) {
		Map<Character, Character> map = new HashMap<>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				st.push(s.charAt(i));
			}
			else if (st.isEmpty() || map.get(st.pop()) != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
}
