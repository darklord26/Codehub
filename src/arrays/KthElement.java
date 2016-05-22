package arrays;

import java.util.PriorityQueue;

public class KthElement {

	public static void main(String[] args) {
		int a[] = { 20, 21, 15, 13, 25, 12, 10, 32, 14, 18 };
		int k = 6;
		int kthlargest = findKthLargest(a, k);
		int kthsmallest = findkthsmallest(a, k);

		System.out.println(kthlargest);
		System.out.println(kthsmallest);

	}

	// Priority Queue
	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
		for (int i : nums) {
			q.offer(i);
			if (q.size() > k) {
				q.poll();
			}
		}
		return q.peek();
	}

	public static int findkthsmallest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < nums.length; i++) {
			pq.offer(nums[i]);
		}
		int n = 0;
		while (k > 0) {
			n = pq.poll();
			k--;
		}
		return n;
	}
}
