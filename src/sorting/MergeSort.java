package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 11, 17 };
		int b[] = { 9, 10, 11, 13, 14 };
		int[] mergedArray = mSort(a, b);
		System.out.print("The merged array is :");
		for (int i : mergedArray) {
			
			System.out.print(" " +i);
		}
	}

	static int[] mSort(int a[], int b[]) {

		int m = a.length;
		int n = b.length;
		int i = 0;
		int j = 0;
		int k = 0;
		int c[] = new int[m + n];

		while (i < m && j < n) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < m) {
			c[k] = a[i];
			i++;
			k++;
		}

		while (j < n) {
			c[k] = b[j];
			j++;
			k++;
		}
		return c;
	}
}
