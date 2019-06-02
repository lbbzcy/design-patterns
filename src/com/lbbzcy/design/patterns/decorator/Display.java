package com.lbbzcy.design.patterns.decorator;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-31 11:32
 * @Copyright: asiainfo
 */
public abstract class Display {
	public abstract int getColumns();
	public abstract int getRows();
	public abstract String getRowText(int row);

	public final void show() {
		for (int i = 0; i< getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
