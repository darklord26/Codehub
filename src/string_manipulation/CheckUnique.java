package string_manipulation;

import java.util.HashSet;
import java.util.Set;

public class CheckUnique {

	public static void main(String[] args) {
		String s = " Sumit ";
		boolean res = isUnique(s);
		System.out.println(res);

	}
	static boolean isUnique(String s){
		if(s.length() <=1){
			return true;
		}
		if(s.isEmpty()){
			return false;
		}
		boolean flag = true;
		char [] c = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<c.length;i++){
			if(set.contains(c[i])){
				flag = false;
				return flag;
			}
			set.add(c[i]);
		}
		return flag;
	}

}
