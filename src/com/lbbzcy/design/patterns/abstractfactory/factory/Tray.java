package com.lbbzcy.design.patterns.abstractfactory.factory;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 14:18
 * @Copyright: asiainfo
 */
public abstract class Tray extends Item{
	protected ArrayList tray = new ArrayList();
	public Tray(String caption) {
		super(caption);
	}

	public void add(Item item) {
		tray.add(item);
	}
}
