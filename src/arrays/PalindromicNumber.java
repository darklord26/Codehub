package arrays;

public class PalindromicNumber {

	public static void main(String[] args) {
		
		int x = 121121;
		boolean result = isPalindromicNumber(x);
		System.out.println(result);
		
		String str1 = "A man, a plan, a canal: Panama";
		boolean resultstr = palindrome(str1);
		System.out.println(resultstr);
		
		
	}
	public static boolean palindrome(String str){
		str = str.replaceAll("\\s", "");
		
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i) != str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindromicNumber(int num){
		if(num < 0){
			return false;
		}
		int reverseNumber = reverse(num);
		if(num == reverseNumber){
			return true;
		}
		return false;
	}
	
	public static int reverse(int num){
		int rev = 0;
		while(num!=0){
		rev = rev*10 + num%10;
		num = num/10;
		}
		return rev;
	}

}
