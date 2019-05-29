package com.lbbzcy.design.patterns.template;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 11:09
 * @Copyright: asiainfo
 */
public abstract class AbstractDisplay {

	public abstract void open();
	public abstract void print();
	public abstract void close();

	public final void display() {
		open();
		for (int i = 0 ; i < 5 ; i++) {
			print();
		}
		close();
	}


}
