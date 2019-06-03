package com.lbbzcy.design.patterns.visitor;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-02 20:53
 * @Copyright: asiainfo
 */
public class File extends Entry{
	private String name;
	private int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
