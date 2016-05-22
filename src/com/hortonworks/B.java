package com.hortonworks;

import java.util.List;
import java.util.ArrayList;

public class B {

	private int mValue = 0;
	private List<ListenerB> mListeners = new ArrayList<ListenerB>();

	public B(int val) {
		mValue = val;
	}

	public void addChangeListener(ListenerB listener) {
		mListeners.add(listener);
	}

	public int getValue() {
		return mValue;
	}

	public void setValue(int val) {
		mValue = val;
		for (ListenerB listener : mListeners) {
			listener.valueChangedB(mValue);
		}
	}

}
