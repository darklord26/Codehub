package arrays;

import java.util.ArrayList;
import java.util.List;

public class OddOccuringNumber {

	public static void main(String[] args) {
		int a [] = {1,5,4,4,1,1,3,5,5};
		List<Integer> res = findOdd(a);
		for(int i : res)
		System.out.println(i);
	}
	
	static List<Integer> findOdd(int a[]){
		int res = 0;
		List<Integer> list = new ArrayList<>();
		for(int i : a){
			res = res ^ i;
			if(res!=0){
				list.add(i);
			}
		}
		return list;
	}

}
