package string_manipulation;

import java.util.HashMap;

public class Substring {

	public static void main(String[] args) {
		Substring o = new Substring();
		String s = "tmmzuxt";
		int result = o.lengthOfLongestSubstring(s);
		System.out.println("The length of max substring is:" + result);
	}
	
	public int lengthOfLongestSubstring(String s) {
		if (s.length()==0){ 
			return 0;
		}
		
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int unique = 0;
        int j= 0;
        
        for (int i=0; i<s.length(); ++i){
           
        	if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
        	else{
            map.put(s.charAt(i),i);
            unique = Math.max(unique,i-j+1);
        	}
        }
        return unique;
        
    }

}
