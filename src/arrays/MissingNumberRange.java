package arrays;

public class MissingNumberRange {

	public static void main(String[] args) {
		int A[] = { 1, 2, 7, 6, 4, 3, 8, 9, 5 };
		int range = 10;
		System.out.println("Missing No is :" + missingNo(A, range));
	}

	static int missingNo(int[] a, int n) {
		int sumOfNumbers = (n * (n + 1)) / 2;
		int sumOfArray = 0;
		for (int i = 0; i < a.length; i++) {
			sumOfArray += a[i];
		}
		return sumOfNumbers - sumOfArray;
	}

	static int missingNoXor(int[] a, int n) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result ^= a[i];
		}

		return result;
	}

	// naive solution is use Hash Table ..space complexity - O(n)
	// better solutiion - XOR
	// A^A = 0 and A^B^A = B, so if we XOR all the elements, answer will be the
	// missing no
	public int find(int[] A) {
		int miss = A[0]; // if we have only one element, the missing no will be
							// that no
		for (int i = 1; i < A.length; i++) {
			miss = miss ^ A[i];
		}
		return miss;
	}

}
