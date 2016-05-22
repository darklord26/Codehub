package arrays;

public class PlusOne {

	public static void main(String[] args) {
		int [] input = {1,3,9};
		int [] result = addOne(input);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
	}

	public static int[] addOne(int[] num) {
		int carry = 1;
		int digit;
		int[] result = new int[num.length];
		for (int i = num.length - 1; i >= 0; i--) {
			digit = num[i] + carry;
			result[i] = digit%10;
			carry = digit / 10;
		}
		if(carry==1){
			result = new int[num.length + 1];
			result[0] = 1;
		}
		return result;

	}

}
