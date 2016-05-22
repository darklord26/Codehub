package arrays;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearTwice {

	public static void main(String[] args) {
		int a [] = {1,1,2,2,3,4,4,5,5};
		int res = findNonRepeatingElem(a);
		System.out.println(res);
	}
	
	static int findNonRepeatingElem(int []a){
		if(a.length<1){
			return -1;
		}
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i : a){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}
			else{
				map.put(i,1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			if(entry.getValue() == 1){
				return entry.getKey();
			}
		}
		return -1;		
		
	}

}
