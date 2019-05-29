package com.lbbzcy.design.patterns.prototype.framework;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-27 14:31
 * @Copyright: asiainfo
 */
public interface Product extends Cloneable {

	public abstract void use(String s);
	public abstract Product createClone();
}
