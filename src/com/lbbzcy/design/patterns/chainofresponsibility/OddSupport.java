package com.lbbzcy.design.patterns.chainofresponsibility;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-03 14:56
 * @Copyright: asiainfo
 */
public class OddSupport extends Support {
	public OddSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() %2 == 1) {
			return true;
		} else {
			return false;
		}
	}
}
