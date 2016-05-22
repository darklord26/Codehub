package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int number[] = { 15, 12, 13, 11, 20, 15, 22, 14 };
		int low = 0;
		int high = number.length - 1;
		int result[] = qSort(number,low, high);
		for (int i = 0;i<result.length ;i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] qSort(int num [], int low, int high) {

		int i = low;
		int j = high;
		// Get the pivot element from the middle of the list
		int pivot = num[i + (j - i) / 2];

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (num[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (num[j] > pivot) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(num, i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			qSort(num,low, j);
		if (i < high)
			qSort(num,i, high);
		
		return num;
	}

	public static void exchange(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}

}
