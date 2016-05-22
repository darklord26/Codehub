package string_manipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

/*
 * Add the first String characters in a map with keeping character count
 * now check second string characters in the map and for each find reduce count by 1
 * Then using entryset, find if any character count is still 1
 * if yes, return false
 */

public class CheckPermutation {

	public static void main(String[] args) {
		String s1 = "sumit";
		String s2 = "Sumit";

		boolean res = isPerm(s1, s2);
		System.out.println(res);
	}

	static boolean isPerm(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}
			map.put(s1.charAt(i), 1);
		}
		
		for(int i = 0;i<s2.length();i++){
			if(map.containsKey(s2.charAt(i))){
				map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			if(entry.getValue() == 1 ){
				return false;
			}			
		}
		return true;
	}	
}
