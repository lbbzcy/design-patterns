package com.lbbzcy.design.patterns.chainofresponsibility;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-03 14:53
 * @Copyright: asiainfo
 */
public class NoSupport extends Support {
	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}
}
