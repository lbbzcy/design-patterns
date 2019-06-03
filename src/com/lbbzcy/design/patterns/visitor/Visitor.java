package com.lbbzcy.design.patterns.visitor;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-02 20:52
 * @Copyright: asiainfo
 */
public abstract class Visitor {
	public abstract void visit(File file);
	public abstract void visit(Directory directory);

}
