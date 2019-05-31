package com.lbbzcy.design.patterns.composite;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-30 09:16
 * @Copyright: asiainfo
 */
public abstract class Entry {
	public abstract String getName();
	public abstract int getSize();

	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}

	public void printList() {
		printList("");
	}
	protected abstract void printList(String prefix);

	public String toString() {
		return getName() + "(" + getSize() + ")";
	}

}
