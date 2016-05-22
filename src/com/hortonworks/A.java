package com.hortonworks;

import java.util.List;
import java.util.ArrayList;

public class A  {

	private int mValue = 0;
	private List<ListenerA> mListeners = new ArrayList<ListenerA>();

	public A(int val) {
		mValue = val;
	}

	public void addChangeListener(ListenerA listener) {
		mListeners.add(listener);
	}

	public int getValue() {
		return mValue;
	}

	public void setValue(int val) {
		mValue = val;
		for (ListenerA listener : mListeners) {
			listener.valueChangedA(mValue);
		}
	}
}
