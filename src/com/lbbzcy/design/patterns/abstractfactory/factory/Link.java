package com.lbbzcy.design.patterns.abstractfactory.factory;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 14:16
 * @Copyright: asiainfo
 */
public abstract class Link extends Item{

	protected String url;
	public Link(String caption,String url) {
		super(caption);
		this.url = url;
	}
}
