package com.lbbzcy.design.patterns.visitor;


import java.util.Iterator;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-02 20:54
 * @Copyright: asiainfo
 */
public abstract class Entry implements Element{
	public abstract String getName();
	public abstract int getSize();

	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}

	public Iterator iterator() throws FileTreatmentException{
		throw new FileTreatmentException();
	}

	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
}
