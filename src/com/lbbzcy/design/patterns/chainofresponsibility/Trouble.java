package com.lbbzcy.design.patterns.chainofresponsibility;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-03 14:37
 * @Copyright: asiainfo
 */
public class Trouble {
	private int number;

	public Trouble(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Trouble{" +
				"number=" + number +
				'}';
	}
}
