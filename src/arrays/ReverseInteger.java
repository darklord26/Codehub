package arrays;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 13456;
		int result = reverseNumber(num);
		System.out.println(result);
	}

	public static int reverseNumber(int num) {
		int res = 0;
		while (num != 0) {
			// Overflow
			if (Math.abs(res) > Integer.MAX_VALUE) {
				return 0;
			}
			res = res * 10 + num % 10;
			num /= 10;
		}

		return res;
	}

}
