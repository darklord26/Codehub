package arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWithinKIndices {

	public static void main(String[] args) {
		int arr[] = {1,2,3,11,2,5,6};
		DuplicateWithinKIndices dk = new DuplicateWithinKIndices();
        System.out.println(dk.duplicate(arr, 3));
        System.out.println(dk.duplicate2(arr, 3));
	}
	
	private boolean duplicate(int [] num, int k){
		// null check
		int dupIndex = 0;
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<num.length;i++){
			if(set.contains(num[i])){
				dupIndex = i;
			}
			set.add(num[i]);
		}
		if(k+1 == dupIndex){
			return true;
		}
		return false;
	}
	
	public boolean duplicate2(int arr[],int k){
        Set<Integer> visited = new HashSet<Integer>();
        for(int i=0; i < arr.length; i++){
            if(visited.contains(arr[i])){
                return true;
            }
            if(i >= k){
                visited.remove(arr[i-k]);
            }
            visited.add(arr[i]);
        }
        return false;
    }

}
