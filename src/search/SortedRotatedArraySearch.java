package search;

public class SortedRotatedArraySearch {

	public static void main(String[] args) {
		SortedRotatedArraySearch ras = new SortedRotatedArraySearch();

		int arr2[] = { 9, 10, 1, 2, 4, 5, 6, 7, 8 };
		System.out.println(ras.search(arr2, 1));
		System.out.println(ras.search(arr2, 5));
		System.out.println(ras.search(arr2, 10));
		System.out.println(ras.search(arr2, 14));
	}

	public int search(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low < high) {
			mid = low + (high - low) / 2;

			// Case 1 : Found target the mid
			if (arr[mid] == target) {
				return mid;
			}
			// Now we search the sorted half!!
			// Case 2 : Right half is sorted
			if (arr[mid] < arr[high]) {
				if (arr[mid] < target && target < arr[high]) {
					low = mid + 1;
				} else {
					high = mid;
				}
			}
			// Case 3 : Left half is sorted
			if (arr[mid] > arr[low]) {
				if (arr[mid] > target && target > arr[low]) {
					high = mid;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;

	}

}
