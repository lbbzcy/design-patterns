package com.lbbzcy.design.patterns.bridge;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 16:39
 * @Copyright: asiainfo
 */
public class Display {
	private DisplayImpl impl;

	public Display(DisplayImpl impl) {
		this.impl = impl;
	}

	public void open() {
		impl.rawOpen();
	}

	public void print() {
		impl.rawPrint();
	}

	public void close() {
		impl.rawClose();
	}

	public final void display() {
		open();
		print();
		close();
	}
}
