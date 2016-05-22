package com.hortonworks.test;

import com.hortonworks.Solution1;
import com.hortonworks.*;

public class TestSolution1 extends Solution {

	/*
	 * Special Case Scenario int []a = [0,1,2,2]; Program Output : [1,2,3,4]
	 * This is an assumption I have made, that instead of the output [0,1,2,3] I
	 * am starting with id's 1 This is because, when we persist these id's in
	 * the database, we will always start with 1
	 */

	public static void main(String[] args) {
		// Test Case 1
		int t1[] = { 1, 2, 2, 2 };
		t1 = result(t1);
		System.out.print("The result of testcase one is:");
		for (int i : t1)
			System.out.print(" " + i);

		System.out.println();

		// Test Case 2
		int t2[] = { 1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 5, 10 };
		t2 = result(t2);
		System.out.print("The result of testcase two is:");
		for (int i : t2)
			System.out.print(" " + i);
		System.out.println();

		// Test Case 3
		int t3[] = { 1, 2, 3, 4, 5, 6, 6, 8 };
		t3 = result(t3);
		System.out.print("The result of testcase three is:");
		for (int i : t3)
			System.out.print(" " + i);

		System.out.println();

		// Test Case 4
		int t4[] = { 1, 2, 2, 2, 5, 8, 8, 20, 20, 20, 22 };
		t4 = result(t4);
		System.out.print("The result of testcase four is:");
		for (int i : t4)
			System.out.print(" " + i);
	}

}
