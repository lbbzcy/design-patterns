package com.lbbzcy.design.patterns.abstractfactory.factory;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 11:38
 * @Copyright: asiainfo
 */
public abstract class Item {
	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}

	public abstract String makeHTML();
}
