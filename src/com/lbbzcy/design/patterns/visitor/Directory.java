package com.lbbzcy.design.patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-02 20:54
 * @Copyright: asiainfo
 */
public class Directory extends Entry{
	private String name;
	private ArrayList dir = new ArrayList();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator it = dir.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			size += entry.getSize();
		}
		return size;
	}

	@Override
	public Entry add(Entry entry) throws FileTreatmentException{
		dir.add(entry);
		return this;
	}

	@Override
	public Iterator iterator(){
		return dir.iterator();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
