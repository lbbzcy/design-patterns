package com.lbbzcy.design.patterns.visitor;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-02 20:55
 * @Copyright: asiainfo
 */
public interface Element {
	public abstract void accept(Visitor v);
}
