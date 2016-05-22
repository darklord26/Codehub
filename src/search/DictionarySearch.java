package search;

import java.util.HashSet;
import java.util.Set;

public class DictionarySearch {
	
	private static final Set<String> dictionary = new HashSet<String>();
    static {
        dictionary.add("this");
        dictionary.add("his");
        dictionary.add("is");
        dictionary.add("awe");
        dictionary.add("we");
        dictionary.add("some");
        dictionary.add("awesome");
        dictionary.add("foo");
        dictionary.add("bar");
    }
    
    private static boolean search(String str){
    	if(dictionary.contains(str)){
    		return true;
    	}
    	return false;
    	
    }


	public static void main(String[] args) {
		String str = "thisisawesome";
		boolean result = search(str);
		System.out.println(result);

	}

}
