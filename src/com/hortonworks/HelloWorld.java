package com.hortonworks;

public class HelloWorld implements ListenerA, ListenerB {
	static A a = null;
	static B b = null;
	static ListenerA la = null;
	static ListenerB lb = null;

	public static void main(String[] args) {
		
		a = new A(100);
		b = new B(100);

		System.out.println("A.value=" + a.getValue()); // prints A.value=100
		System.out.println("B.value=" + b.getValue()); // prints B.value=100
		
		la = new HelloWorld();
		lb = new HelloWorld();
		
		a.addChangeListener(la);
		b.addChangeListener(lb);
		a.setValue(101);
		// b.setValue(102);
		System.out.println("A.value=" + a.getValue()); // prints A.value=101
		System.out.println("B.value=" + b.getValue()); // should print
														// B.value=101

		b.setValue(201);

		System.out.println("A.value=" + a.getValue()); // should print
														// A.value=201
		System.out.println("B.value=" + b.getValue()); // prints B.value=201
	}

	public void valueChangedA(int newValue) {
		// System.out.println("A" + newValue);
		b = new B(newValue);
		b.addChangeListener(lb);

	}

	public void valueChangedB(int newValue) {
		// System.out.println("B" +newValue);
		// a.setValue(newValue);
		a = new A(newValue);
		a.addChangeListener(la);
	}

}
