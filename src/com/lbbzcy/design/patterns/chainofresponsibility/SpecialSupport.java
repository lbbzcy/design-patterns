package com.lbbzcy.design.patterns.chainofresponsibility;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-03 17:25
 * @Copyright: asiainfo
 */
public class SpecialSupport extends Support {
	private int number;
	public SpecialSupport(String name,int number) {
		super(name);
		this.number = number;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() == number) {
			return true;
		} else {
			return false;
		}

	}
}
