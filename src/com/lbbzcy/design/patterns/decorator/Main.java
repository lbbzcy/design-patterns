package com.lbbzcy.design.patterns.decorator;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-02 11:49
 * @Copyright: asiainfo
 */
public class Main {
	public static void main(String[] args) {
		Display b1 = new StringDisplay("Hello,world.");
		Display b2 = new SideBorder(b1,'#');
		Display b3 = new FullBorder(b2);
		b1.show();
		b2.show();
		b3.show();

		Display b4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("您好，世界。")),'*'))),'/');
		b4.show();
	}
}
