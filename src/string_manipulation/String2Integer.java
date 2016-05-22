package string_manipulation;

public class String2Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123456";
		atoi(s);
		//System.out.println(res);
	}

	private static void atoi(String s) {
		if (s.isEmpty()) {
			throw new NumberFormatException("null");
		}		
		int res = 0;		
		for(int i=0;i<s.length();i++){
			int digit = (int)s.charAt(i) - '0';
			res = res*10 + digit;
			System.out.println(res);
		}
	}	
}
