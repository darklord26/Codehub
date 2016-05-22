package com.hortonworks;

public class TestMain {
	public static void main(String[] args) {
		A a = new A(100);
		B b = new B(100);

		System.out.println("A.value=" + a.getValue()); // prints A.value=100
		System.out.println("B.value=" + b.getValue()); // prints B.value=100

		/* Your code here */
		ListenerA aList = new ListenerA() {
			// Inline over-riding of interface method	
			@Override
			public void valueChangedA(int newValue) {
				// When we set a new value to object a, we check if the previous value of object b is same as the value of a
				// If object b is already set to the new value of a, just break out from the loop to avoid cycle(infinite loop)
				// Else set the value of object b to the new value of object a
				if (b.getValue() != newValue)
					b.setValue(newValue);
			}
		};
		ListenerB bList = new ListenerB() {
			@Override
			public void valueChangedB(int newValue) {
				// When we set a new value to object b, we check if the previous value of object a is same as the value of b
				// If object a is already set to the new value of b, just break out from the loop to avoid cycle(infinite loop)
				// Else set the value of object a to the new value of object b
				if (a.getValue() != newValue)
					a.setValue(newValue);
			}
		};
		// Append the values of object a and object b to the respective ArrayLists
		a.addChangeListener(aList);
		b.addChangeListener(bList);
		/* End of code */

		a.setValue(101);

		System.out.println("A.value=" + a.getValue()); // prints A.value=101
		System.out.println("B.value=" + b.getValue()); // should print
														// B.value=101
		b.setValue(201);
		System.out.println("A.value=" + a.getValue()); // should print
														// A.value=201
		System.out.println("B.value=" + b.getValue()); // prints B.value=201
	}
}
