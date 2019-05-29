package com.lbbzcy.design.patterns.bridge;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 16:43
 * @Copyright: asiainfo
 */
public class CountDisplay extends Display {
	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}
}
