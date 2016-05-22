package string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatCharacter {

	public static void main(String[] args) {
		String s = "abbbccdea";
		char res = firstNonRepeatCharacter(s);
		System.out.println(res);
	}

	private static char firstNonRepeatCharacter(String s) {
		if (s.isEmpty()) {
			throw new RuntimeException("Subclasses of Valueables cannot take in an empty Strin");
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		    if(entry.getValue() == 1){
		    	return entry.getKey();
		    }
		}
		return ' ';
	}
}
