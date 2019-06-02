package com.lbbzcy.design.patterns.decorator;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-31 14:23
 * @Copyright: asiainfo
 */
public abstract class Border extends Display {
	protected Display display;

	public Border(Display display) {
		this.display = display;
	}
}
